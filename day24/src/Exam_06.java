import java.io.*;
import java.net.*;

//¹Þ´Â°÷
public class Exam_06 {
	public static void main(String[] args) throws Exception {
		DatagramPacket dp = new DatagramPacket(new byte[65508], 65508);
		DatagramSocket ds = new DatagramSocket(12345);
		
		ds.receive(dp);
		ds.close();
		
		ByteArrayInputStream bais = new ByteArrayInputStream(dp.getData());
		BufferedInputStream bis = new BufferedInputStream(bais);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		A05 ap = (A05)ois.readObject();
		System.out.println("ap.a = " + ap.a);
		System.out.println("ap.b = " + ap.b);
	}
}
