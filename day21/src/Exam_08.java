import java.io.*;

public class Exam_08 {
	public static void main(String[] args) throws Exception {
		File dir = new File("C:\\javaAPI\\study\\day21\\src");
		File file = new File(dir, "ccc.txt");
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String str = br.readLine();
			if (str == null) break; //문자열의 EOF는 null 이다.
			System.out.println(str);
		}
	}
}
