//클라이언트

import java.net.*;
import java.io.*;

public class Exam_05{
	public static void main(String[]args) {
		InetAddress ia = null;
		Socket soc = null;
		String msg = "java network program";
		PrintWriter pw = null;
		BufferedReader br = null;
		try {
			ia = InetAddress.getByName("localhost");
			//자기자신을 나타내는 주소
			//localhost, 127.0.0.1, 실제 자신의 주소(내 아이피는 180.83.164.77)
			soc = new Socket(ia,12345);
			//객체가 완성되려면 서버와 통신이 완료되어야 한다.
			pw = new PrintWriter(new BufferedWriter
					(new OutputStreamWriter(soc.getOutputStream())));
			pw.println(msg + "\n");
			pw.flush();
			br = new BufferedReader
					(new InputStreamReader(soc.getInputStream()));
			String msg2 = br.readLine();
			System.out.println("서버에서 온 메세지 : " + msg2);
			soc.close();
			System.out.println("메세지 전송 끝!!");
		}catch(UnknownHostException e) {
			System.out.println("알수 없는 주소입니다.");
		}catch(IOException e) {
			System.out.println("서버와 통신시 오류 발생!!");
			e.printStackTrace();
		}
	}
}
