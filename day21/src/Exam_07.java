import java.io.*;

public class Exam_07 {
	public static void main(String[] args) throws Exception {
		File dir = new File("C:\\javaAPI\\study\\day21\\src");
		File file = new File(dir, "ccc.txt");
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		pw.print("�ȳ�");
		pw.println("�ϼ���");
		pw.println("�ڹټ����ð��Դϴ�.");
		
		pw.close();
	}
}
