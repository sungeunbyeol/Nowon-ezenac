import java.io.*;

public class Exam_01 {
	public static void main(String[] args) {
		/*
		File f1 = new File("C:\javaAPI\study\day21\src\\aaa.txt");
		//\ : \뒤에 특수문자를 처리
		//윈도우에서의 폴더구별 : \, 리눅스에서의 폴더구별 : /
		File f2 = new File("C:\javaAPI\study\day21\src", "aaa.txt");
		File dir = new File("C:\javaAPI\study\day21\src");
		File f3 = new File(dir, "aaa.txt");
		//f1, f2, f3 객체는 모두 같은 곳을 가르킨다
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






