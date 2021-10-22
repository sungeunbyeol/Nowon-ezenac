import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

import javax.swing.JOptionPane;

//파일 받는 곳

public class Exam_02 {
	public static void main(String[]args) throws Exception{
		File dir = new File("C:\\javaAPI\\study\\day24\\src");
		File file = new File(dir, "data.txt");
		
		DatagramSocket ds = new DatagramSocket(12345);
		
		DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
		while(true) {
			DatagramPacket dp = new DatagramPacket(new byte[65508], 65508);
			ds.receive(dp);
			
			String data = new String(dp.getData()).trim();
			if(data.equals("exit")) break;
			
			dos.write(data.getBytes(),0,data.getBytes().length);
			dos.flush();
		}
		dos.close();
		JOptionPane.showMessageDialog(null, "파일전송끝!","메세지",JOptionPane.INFORMATION_MESSAGE);
	}
}
