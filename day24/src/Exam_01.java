import java.io.*;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

//선택된 파일을 다른곳으로 이동시키겠다

public class Exam_01 {
	public static void main(String[]args) throws IOException{
		JFileChooser jfc = new JFileChooser("."); //.은 현재위치
		int res = jfc.showOpenDialog(null); //프레임 없어서 null 이라고 적어줌
		File file = null;
		if(res == 0) {
			file = jfc.getSelectedFile();
		}else {
			JOptionPane.showMessageDialog(null, "파일선택을 안해서 종료합니다.","메세지",JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);			
		}
		DatagramPacket dp = null;
		DatagramSocket ds = new DatagramSocket();
		InetAddress ia = InetAddress.getByName("localhost");
		DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
		
		byte[] by = new byte[65508];
		while(true) {
			int x = dis.read(by, 0, by.length); //x는 결과를 말한다.
			//x값은 read 갯수, 만약에 값이 EOF(End Of File)면 -1을 반환받는다
			if(x==-1) break; //파일의 끝은 -1이기 때문에 break로 나가라고 함
			dp = new DatagramPacket(by, x, ia, 12345);
			ds.send(dp);
		}
		//exit 전송시키는 소스
		String exit = new String("exit");
		dp = new DatagramPacket(exit.getBytes(), exit.getBytes().length, ia,12345);
		ds.send(dp);
		ds.close();
		JOptionPane.showMessageDialog(null, "파일수신 끝!","메세지",JOptionPane.INFORMATION_MESSAGE);
	}
}
