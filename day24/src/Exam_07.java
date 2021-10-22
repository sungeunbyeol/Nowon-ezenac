import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Exam_07 {

	public static void main(String[] args) throws Exception{
		DatagramPacket dp = new DatagramPacket(new byte[65508], 65508);
		MulticastSocket ms = new MulticastSocket(12345);

		InetAddress ia = InetAddress.getByName("231.0.0.5");
		ms.joinGroup(ia);
		//for(int i=0; i<5; ++i) {
			ms.receive(dp);
			System.out.println("보낸이 : "+ dp.getAddress().getHostAddress());
			System.out.println("내용물 : " + new String(dp.getData()));
		//}
		
		ms.leaveGroup(ia);
		ms.close();
		
	}

}
