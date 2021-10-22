import java.io.*;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

//���õ� ������ �ٸ������� �̵���Ű�ڴ�

public class Exam_01 {
	public static void main(String[]args) throws IOException{
		JFileChooser jfc = new JFileChooser("."); //.�� ������ġ
		int res = jfc.showOpenDialog(null); //������ ��� null �̶�� ������
		File file = null;
		if(res == 0) {
			file = jfc.getSelectedFile();
		}else {
			JOptionPane.showMessageDialog(null, "���ϼ����� ���ؼ� �����մϴ�.","�޼���",JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);			
		}
		DatagramPacket dp = null;
		DatagramSocket ds = new DatagramSocket();
		InetAddress ia = InetAddress.getByName("localhost");
		DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
		
		byte[] by = new byte[65508];
		while(true) {
			int x = dis.read(by, 0, by.length); //x�� ����� ���Ѵ�.
			//x���� read ����, ���࿡ ���� EOF(End Of File)�� -1�� ��ȯ�޴´�
			if(x==-1) break; //������ ���� -1�̱� ������ break�� ������� ��
			dp = new DatagramPacket(by, x, ia, 12345);
			ds.send(dp);
		}
		//exit ���۽�Ű�� �ҽ�
		String exit = new String("exit");
		dp = new DatagramPacket(exit.getBytes(), exit.getBytes().length, ia,12345);
		ds.send(dp);
		ds.close();
		JOptionPane.showMessageDialog(null, "���ϼ��� ��!","�޼���",JOptionPane.INFORMATION_MESSAGE);
	}
}
