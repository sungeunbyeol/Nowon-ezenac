//Ŭ���̾�Ʈ

import java.net.*;
import java.io.*;
import java.util.*;

public class Exam_07 implements Runnable{
	private InetAddress ia;
	private Socket soc;
	private PrintWriter pw;
	private BufferedReader br;
	private Scanner in;
	
	public Exam_07() {	//������ �ڵ��ۼ�
		try {
			ia = InetAddress.getByName("localhost");
			soc = new Socket(ia, 12345);
			in = new Scanner(System.in);
			pw = new PrintWriter(soc.getOutputStream(), true);
			Thread th = new Thread(this);
			th.start();
			while(true) {
				String msg = in.nextLine();
				if (msg == null) break;
				pw.println(msg);
				pw.flush();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {	//�޴� �ڵ�
		try {
			br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			while(true) {
				String msg = br.readLine();
				System.out.println("�����޼��� : " + msg);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
	public static void main(String[] args) {
		new Exam_07();
	}
}
