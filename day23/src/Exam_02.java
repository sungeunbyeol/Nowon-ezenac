//

import java.net.*;

public class Exam_02 {
	public static void main(String[] args) throws Exception {
		//�޴� ��
		DatagramPacket dp = new DatagramPacket(new byte[65508], 65508);
		
		DatagramSocket ds = new DatagramSocket(12345);
		
		ds.receive(dp);
		ds.close();
		
		InetAddress ia = dp.getAddress();//dp�� ���� ���� �ּ�
		String data = new String(dp.getData()).trim();
		//dp.getData() dp�� ���� �����͸� �����ڴ�
		System.out.println("������ : " + ia.getHostAddress());
		System.out.println("�������� : " + data);
	}
}
