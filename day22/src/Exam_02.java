import java.io.IOException;
import java.net.ServerSocket;

public class Exam_02 {
	public static void main(String[]args) {
		ServerSocket ss = null;
		for(int i=0; i<=65535; ++i) {
			try {
				ss = new ServerSocket(i);
				ss.close();
			}catch(IOException e) {
				System.out.println(i+"번은 이미 사용중인 포트번호 입니다.");
			}
		}
	}
}
