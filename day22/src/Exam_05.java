//Ŭ���̾�Ʈ

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
			//�ڱ��ڽ��� ��Ÿ���� �ּ�
			//localhost, 127.0.0.1, ���� �ڽ��� �ּ�(�� �����Ǵ� 180.83.164.77)
			soc = new Socket(ia,12345);
			//��ü�� �ϼ��Ƿ��� ������ ����� �Ϸ�Ǿ�� �Ѵ�.
			pw = new PrintWriter(new BufferedWriter
					(new OutputStreamWriter(soc.getOutputStream())));
			pw.println(msg + "\n");
			pw.flush();
			br = new BufferedReader
					(new InputStreamReader(soc.getInputStream()));
			String msg2 = br.readLine();
			System.out.println("�������� �� �޼��� : " + msg2);
			soc.close();
			System.out.println("�޼��� ���� ��!!");
		}catch(UnknownHostException e) {
			System.out.println("�˼� ���� �ּ��Դϴ�.");
		}catch(IOException e) {
			System.out.println("������ ��Ž� ���� �߻�!!");
			e.printStackTrace();
		}
	}
}
