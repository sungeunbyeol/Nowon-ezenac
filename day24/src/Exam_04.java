import java.io.*;
import java.util.*;
import java.text.*;
import java.net.*;

//server
public class Exam_04 {
	public static void main(String[] args) throws Exception {
		DatagramPacket dp1, dp2;
		DatagramSocket ds = new DatagramSocket(12345);
		Date date = null;
		SimpleDateFormat sdf = null; //SimpleDateFormat은 date 형식을 변경할 수 있는 클래스
		
		while(true) {
			dp1 = new DatagramPacket(new byte[65508], 65508);
			ds.receive(dp1);
			String num = new String(dp1.getData()).trim();
			int select = Integer.parseInt(num);
			if (select == 4) {
				ds.close();
				System.exit(0);
			}
			switch(select) {
			case 1 :	sdf = new SimpleDateFormat("yyyy-MM-dd"); break;
			case 2 :	sdf = new SimpleDateFormat("HH:mm:ss"); break;
			case 3 :	sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			}
			date = new Date();
			String data = sdf.format(date);
			dp2 = new DatagramPacket(data.getBytes(), 
								data.getBytes().length, dp1.getAddress(), 12346);
			ds.send(dp2);
		}
	}
}











