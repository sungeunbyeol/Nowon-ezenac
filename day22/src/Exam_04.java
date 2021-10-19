//서버

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Exam_04 {
	public static void main(String[]args) {
		ServerSocket ss = null;
		Socket soc = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			ss = new ServerSocket(12345);
			System.out.println("서버 대기중.......");
			soc = ss.accept();
			System.out.println("접속자 정보 : " + soc.toString());
			br = new BufferedReader
				(new InputStreamReader(soc.getInputStream()));
			String msg = br.readLine();
			System.out.println("클에서 온 메세지 : " + msg);
			pw = new PrintWriter(soc.getOutputStream());
			//pw = new PrintWriter(new BufferedWriter
			//(new OutputStreamWriter(soc.getOutputStream())));
			//이렇게 써도 되지만 위에처럼 쓰는방법도 있다.
			pw.println(msg);
			pw.close();
			soc.close();
		}catch(IOException e) {
			e.printStackTrace();
			//예외 발생시 어디에서 예외가 발생한지를 알기 위해
			//stack에 쌓여있는 메소드를 전부 화면에 보여주는 명령어
		}
	}
}
