import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//�����°�
class A05 implements Serializable{ //����ȭ, ������ȭ / ��ü �����Ϸ��� �̰� ����� ��
	int a = 10;
	int b = 20;
}
public class Exam_05 {
	public static void main(String[]args) throws Exception{
		ByteArrayOutputStream baos = new ByteArrayOutputStream(); // ��ü�� ����Ʈ�� �������ڴ�
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
		System.out.println("��ü���� ��!");
		}
}
