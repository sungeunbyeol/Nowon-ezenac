import java.io.File;
import java.io.FileOutputStream;

public class Exam_03 {
	public static void main(String[]args) throws Exception{
		File dir = new File("C:\\javaAPI\\study\\day21\\src");
		File file = new File(dir, "aaa.txt");
		
		FileOutputStream fos = new FileOutputStream(file, true);
		// FileNotFoundException => IOException => Exception
		//객체생성시 2번째 매개변수로 true를 넣으면 append, false를 넣으면 rewrite
		fos.write('A');
		fos.write(66);
		String str = "Hello, JAVA!!";
		byte[] by = str.getBytes();
		fos.write(by);
		fos.write(by,7,4);//byte배열, 시작위치, 갯수
	}
}
