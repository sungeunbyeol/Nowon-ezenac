//

import java.net.*;

public class Exam_02 {
	public static void main(String[] args) throws Exception {
		//받는 곳
		DatagramPacket dp = new DatagramPacket(new byte[65508], 65508);
		
		DatagramSocket ds = new DatagramSocket(12345);
		
		ds.receive(dp);
		ds.close();
		
		InetAddress ia = dp.getAddress();//dp로 들어온 곳의 주소
		String data = new String(dp.getData()).trim();
		//dp.getData() dp에 들어온 데이터를 꺼내겠다
		System.out.println("보낸이 : " + ia.getHostAddress());
		System.out.println("보낸내용 : " + data);
	}
}
