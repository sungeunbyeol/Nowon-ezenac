//����

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
			System.out.println("���� �����.......");
			soc = ss.accept();
			System.out.println("������ ���� : " + soc.toString());
			br = new BufferedReader
				(new InputStreamReader(soc.getInputStream()));
			String msg = br.readLine();
			System.out.println("Ŭ���� �� �޼��� : " + msg);
			pw = new PrintWriter(soc.getOutputStream());
			//pw = new PrintWriter(new BufferedWriter
			//(new OutputStreamWriter(soc.getOutputStream())));
			//�̷��� �ᵵ ������ ����ó�� ���¹���� �ִ�.
			pw.println(msg);
			pw.close();
			soc.close();
		}catch(IOException e) {
			e.printStackTrace();
			//���� �߻��� ��𿡼� ���ܰ� �߻������� �˱� ����
			//stack�� �׿��ִ� �޼ҵ带 ���� ȭ�鿡 �����ִ� ��ɾ�
		}
	}
}
