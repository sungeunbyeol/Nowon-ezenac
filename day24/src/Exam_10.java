import java.net.*;

public class Exam_10 {
	public static void main(String[] args) throws Exception {
		DatagramPacket dp = new DatagramPacket(new byte[65508], 65508);
		DatagramSocket ds = new DatagramSocket(12345);
		
		ds.receive(dp);
		ds.close();
		
		System.out.println("보낸이 : " + dp.getAddress().getHostAddress());
		System.out.println("내용물 : " + new String(dp.getData()));
	}
}
