import java.io.*;

public class Exam_01 {
	public static void main(String[] args) {
		/*
		File f1 = new File("C:\javaAPI\study\day21\src\\aaa.txt");
		//\ : \�ڿ� Ư�����ڸ� ó��
		//�����쿡���� �������� : \, ������������ �������� : /
		File f2 = new File("C:\javaAPI\study\day21\src", "aaa.txt");
		File dir = new File("C:\javaAPI\study\day21\src");
		File f3 = new File(dir, "aaa.txt");
		//f1, f2, f3 ��ü�� ��� ���� ���� ����Ų��
		*/
		File dir = new File("c:" + File.separator + "javaAPI" + File.separator 
			+ "study" + File.separator + "day21" + File.separator + "src");
		File f3 = new File(dir, "aaa.txt");
		/*
		System.out.println("File.separator = " + File.separator);
		System.out.println("File.separatorChar = " + File.separatorChar);
		System.out.println("File.pathSeparator = " + File.pathSeparator);
		System.out.println("File.pathSeparatorChar = " + File.pathSeparatorChar);
		*/
	}
}






