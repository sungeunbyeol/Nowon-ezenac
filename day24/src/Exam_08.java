import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Exam_08 {

	public static void main(String[] args) throws Exception {
		String msg = "Hello java";
		
		InetAddress ia = InetAddress.getByName("231.0.0.5");
		DatagramPacket dp = new DatagramPacket(msg.getBytes(),msg.getBytes().length,ia,12345);
		MulticastSocket ms = new MulticastSocket();
		
		ms.send(dp);
		ms.close();

	}

}
