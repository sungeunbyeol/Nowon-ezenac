import java.net.*;

public class Exam_09 {
	public static void main(String[] args) throws Exception {
		InetAddress ia = InetAddress.getByName("192.168.0.255");
		
		String msg = "�ȳ�!! ��ε�ĳ��Ʈ ��� �����̾�!!";
		DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length, ia, 12345);
		DatagramSocket ds = new DatagramSocket();
		
		ds.send(dp);
		ds.close();
	}
}
