import java.net.*;
import java.util.*;

public class Exam_03 extends Thread{
	private DatagramPacket send, receive;
	private DatagramSocket ds;
	private InetAddress ia;
	private Scanner in;
	
	public Exam_03() {
		try {
			in = new Scanner(System.in);
			ia = InetAddress.getByName("localhost");
			ds = new DatagramSocket(12346);
			this.start();
			while(true) {
				System.out.print("글을 입력 : ");
				String msg = in.next();
				send = new DatagramPacket(msg.getBytes(), msg.getBytes().length, ia, 12345);
				ds.send(send);
			}
		}catch(Exception e) {}
	}
	public void run() {
		try {
			while(true) {
				receive = new DatagramPacket(new byte[65508], 65508);
				ds.receive(receive);
				String msg = new String(receive.getData()).trim();
				System.out.println("받은글 : " + msg);
			}
		}catch(Exception e) {}
	}
	
	public static void main(String[] args) {
		new Exam_03();
	}
}