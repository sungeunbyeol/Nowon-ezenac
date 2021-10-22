package member;

import java.util.*;
import java.io.*;
import java.net.*;

public class MemberServer {
	List<Member> list;
	
	DatagramPacket dp1, dp2;
	DatagramSocket ds;
	
	MemberPro pro = new MemberProImpl();
	
	public MemberServer() throws Exception {
		list = new ArrayList<>();
		ds = new DatagramSocket(12345);
		serverStart();
	}
	public void serverStart() throws Exception{
		while(true) {
			dp2 = new DatagramPacket(new byte[65508], 65508);
			ds.receive(dp2);
			
			ByteArrayInputStream bais = new ByteArrayInputStream(dp2.getData());
			BufferedInputStream bis = new BufferedInputStream(bais);
			ObjectInputStream ois = new ObjectInputStream(bis);
			
			Member member = (Member)ois.readObject();
			
			Object send = select(member);
			
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			BufferedOutputStream bos = new BufferedOutputStream(baos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(send);
			oos.flush();
			byte[] by = baos.toByteArray();
			
			dp1 = new DatagramPacket(by, by.length, dp2.getAddress(), 12346);
			ds.send(dp1);
		}
	}
	public Object select(Member member) {
		switch(member.getSelect().trim()) {
		case "input" : 
			if (pro.input(member)) return "회원가입성공!!";
			else return "같은 이름의 회원이 있습니다.";
		case "view" :
			return pro.view();
		case "delete" :	
			if (pro.delete(member.getName())) return member.getName()+"회원 삭제 성공!!";
			else return member.getName()+"님은 저희 회원이 아닙니다.";
		case "exit"	:
			pro.exit();
		}
		return null;
	}

	public static void main(String[] args) throws Exception {
		new MemberServer();
	}
}





