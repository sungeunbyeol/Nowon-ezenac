import java.io.*;

public class Exam_04 {
	public static void main(String[]args) throws Exception {
		File dir = new File("C:\\javaAPI\\study\\day21\\src");
		File file = new File(dir, "bbb.txt");
		
		FileInputStream fis = new FileInputStream(file);
		//FileNotFoundException => IOException => Exception
		while(true) {
			int res = fis.read();
			if(res < 0) break;
			System.out.print((char)res);
		}
	}
}
