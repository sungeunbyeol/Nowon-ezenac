import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//보내는곳
class A05 implements Serializable{ //직렬화, 역직렬화 / 객체 전송하려면 이걸 써줘야 함
	int a = 10;
	int b = 20;
}
public class Exam_05 {
	public static void main(String[]args) throws Exception{
		ByteArrayOutputStream baos = new ByteArrayOutputStream(); // 객체를 바이트로 가져오겠다
		BufferedOutputStream bos = new BufferedOutputStream(baos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		oos.writeObject(new A05());
		oos.flush();
		byte[]data = baos.toByteArray();
		InetAddress ia = InetAddress.getByName("localhost");
		DatagramPacket dp = new DatagramPacket(data,data.length,ia,12345);
		DatagramSocket ds = new DatagramSocket();
		ds.send(dp);
		ds.close();
		System.out.println("객체전송 끝!");
		}
}
