import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Text_01 {
	public static void main(String[]args) throws Exception{
		JFileChooser jfc = new JFileChooser(".");
		int res = jfc.showOpenDialog(null);
		File file = null;
		if(res == 0) {
			file = jfc.getSelectedFile();
		}else {
			JOptionPane.showMessageDialog(null, "���ϼ��� ���ؼ� ����");
			System.exit(0);
		}
		
		DatagramPacket dp = null;
		DatagramSocket ds = new DatagramSocket();
		InetAddress ia = InetAddress.getByName("localhost");
		DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
		
		byte[]by = new byte[65508];
		while(true) {
			int x = dis.read(by, 0, by.length);
			dp = new DatagramPacket(by,x,ia,12345);
			ds.send(dp); //ds�� dp�� ���� �޴´�
			ds.close();
			JOptionPane.showMessageDialog(null, "���ϼ��� ��","�޼���",JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
