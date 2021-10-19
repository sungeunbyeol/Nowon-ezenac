import java.net.*;

public class Exam_01 {
	public static void main(String[] args) throws Exception{
		//보내는 곳
		String msg = "java network program UDP!!";
		InetAddress ia = InetAddress.getByName("localhost");
		DatagramPacket dp = new DatagramPacket(msg.getBytes(), 
				msg.getBytes().length, ia, 12345);
		//1번째매개변수 : data
		//2번째매개변수 : length(크기)
		//3번째매개변수 : InetAddress
		//4번째매개변수 : 포트번호
		DatagramSocket ds = new DatagramSocket();
		//이 socket을 통해 값을 받으려고 하면 매개변수로 포트번호를 적어준다
		ds.send(dp);//dp의 자료를 보내준다
		ds.close();
	}
}
