import java.net.*;

public class Exam_01 {
	public static void main(String[] args) throws Exception{
		//������ ��
		String msg = "java network program UDP!!";
		InetAddress ia = InetAddress.getByName("localhost");
		DatagramPacket dp = new DatagramPacket(msg.getBytes(), 
				msg.getBytes().length, ia, 12345);
		//1��°�Ű����� : data
		//2��°�Ű����� : length(ũ��)
		//3��°�Ű����� : InetAddress
		//4��°�Ű����� : ��Ʈ��ȣ
		DatagramSocket ds = new DatagramSocket();
		//�� socket�� ���� ���� �������� �ϸ� �Ű������� ��Ʈ��ȣ�� �����ش�
		ds.send(dp);//dp�� �ڷḦ �����ش�
		ds.close();
	}
}
