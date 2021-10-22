import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Text_03 {
	public static void main(String[]args) throws Exception {
		Scanner in = new Scanner(System.in);
		DatagramPacket dp1, dp2;
		DatagramSocket ds = new DatagramSocket(12346);
		InetAddress ia = InetAddress.getByName("localhost");
		
		while(true) {
			System.out.print("1.��¥ 2.�ð� 3.��¥�ͽð� 4.���� : ");
			int select = in.nextInt();
			
			if(select<1 || select>4) {
				JOptionPane.showMessageDialog(null, "���� ��Ȯ�� �Է�","�޼���",JOptionPane.INFORMATION_MESSAGE);
				continue;
			}
			String num = String.valueOf(select);
			dp1 = new DatagramPacket(num.getBytes(),num.getBytes().length, ia,12345);
			ds.send(dp1);
			
			if(select == 4) {
				JOptionPane.showMessageDialog(null, "���α׷� ����", "�޼���", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}
			
			dp2 = new DatagramPacket(new byte[65508], 65508);
			ds.receive(dp2);
			System.out.println(new String(dp2.getData()));
		}
	}
}
