import java.io.File;
import java.io.FileOutputStream;

public class Exam_03 {
	public static void main(String[]args) throws Exception{
		File dir = new File("C:\\javaAPI\\study\\day21\\src");
		File file = new File(dir, "aaa.txt");
		
		FileOutputStream fos = new FileOutputStream(file, true);
		// FileNotFoundException => IOException => Exception
		//��ü������ 2��° �Ű������� true�� ������ append, false�� ������ rewrite
		fos.write('A');
		fos.write(66);
		String str = "Hello, JAVA!!";
		byte[] by = str.getBytes();
		fos.write(by);
		fos.write(by,7,4);//byte�迭, ������ġ, ����
	}
}
