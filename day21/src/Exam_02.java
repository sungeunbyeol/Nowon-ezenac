import java.io.*;
import javax.swing.*;
public class Exam_02 {
	public static void main(String[] args) throws IOException{
		File dir = new File("D:\\javaAPI\\study\\day19");
		File file = new File(dir, "aaa.txt");
		
		String[] d = dir.list();	//���丮 ����� String�迭�� ��ȯ
		for(int i=0; i<d.length; ++i) {
			System.out.println(d[i]);
		}
		/*
		if (file.isHidden()) {
			System.out.println("aaa.txt������ ���� �����Դϴ�.");
		}else {
			System.out.println("aaa.txt������ ���� ������ �ƴմϴ�.");
		}
		
		/*
		if (file.canRead()) {
			System.out.println("aaa.txt������ ���� �� �ֽ��ϴ�.");
		}else {
			System.out.println("aaa.txt������ ���� �� �����ϴ�.");
		}
		/*
		if (file.canWrite()) {
			System.out.println("aaa.txt������ ���� �ֽ��ϴ�.");
		}else {
			System.out.println("aaa.txt������ ���� �����ϴ�.");
		}
		/*
		if (dir.isDirectory()) {
			System.out.println("���丮 �Դϴ�.");
		}else {
			System.out.println("���丮�� �ƴմϴ�.");
		}
		/*
		if (file.isFile()) {
			System.out.println(file);
		}else {
			System.out.println("file��ü�� ������ �ƴմϴ�.");
		}
		/*
		File file = null;
		JFileChooser jfc = new JFileChooser(".");
		int res = jfc.showOpenDialog(null);
		if (res==0) {
			file = jfc.getSelectedFile();
			System.out.println("file = " + file);
		}else {
			System.out.println("���ϼ����� ���ϼ̽��ϴ�.");
		}
		/*
		File dir = new File("D:\\javaAPI\\study\\day21\\src");
		File file = new File(dir, "aaa.txt");
		/*
		int filesize = (int)file.length();
		System.out.println("���� ũ�� : " + filesize + "bytes");
		/*
		System.out.println("file.getName() = " + file.getName());
		System.out.println("file.getParent() = " + file.getParent());
		/*
		if (file.delete()) {	//������ �����ϸ� �����ϰ� true ��ȯ
			System.out.println("aaa.txt������ ����!!");
		}else {					//������ ������ false ��ȯ
			System.out.println("aaa.txt������ �����ϴ�.");
		}
		/*
		if (file.createNewFile()) {	//�������� ������ ������ ����� true
			System.out.println("aaa.txt������ ��������ϴ�.");
		}else {						//�����ϸ� false
			System.out.println("aaa.txt������ �̹������մϴ�.");
		}
		
		/*
		File imsi = File.createTempFile("temp", ".txt", dir);
		//dir������ temp�� �����ϰ� .txt�� ������ �ӽ� ������ ����� ����.
		try {Thread.sleep(5000);}catch(Exception e) {}
		imsi.deleteOnExit();//���α׷��� ������ imsi������ �����ض�
		/*
		if (file.createNewFile()) {	//�������� ������ ������ ����� true
			System.out.println("aaa.txt������ ��������ϴ�.");
		}else {						//�����ϸ� false
			System.out.println("aaa.txt������ �̹������մϴ�.");
		}
		/*
		if (file.exists()) {
			System.out.println("aaa.txt������ �����մϴ�.");
		}else {
			System.out.println("aaa.txt������ �������� �ʽ��ϴ�.");
		}
		*/
	}
}
