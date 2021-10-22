import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

import javax.swing.JOptionPane;

public class Text_02 {

	public static void main(String[] args) throws Exception{
		File dir = new File("C:\\javaAPI\\study\\Test\\src");
		File file = new File(dir,"data.txt");
		
		DatagramSocket ds = new DatagramSocket(12345);
		DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
		while(true) {
			DatagramPacket dp = new DatagramPacket(new byte[65508],65508);
			ds.receive(dp);
			
			String data = new String(dp.getData()).trim();
			if(data.equals("exit")) break;
			
			dos.write(data.getBytes(),0,data.getBytes().length);
			dos.flush();
			}
		dos.close();
		JOptionPane.showMessageDialog(null, "颇老傈价 场","皋技瘤",JOptionPane.INFORMATION_MESSAGE);
	}

}
