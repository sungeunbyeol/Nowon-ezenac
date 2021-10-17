import java.io.*;
public class Exam_11 {
	public static void main(String[] args) throws Exception {
		File dir = new File("D:\\javaAPI\\study\\day21\\src");
		File file = new File(dir, "ddd.txt");
		
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		Object obj = ois.readObject();
		A10 ap = (A10)obj;
		System.out.println("ap.a = " + ap.a);
		System.out.println("ap.a = " + ap.b);
		System.out.println("ap.a = " + ap.c);
	}
}
