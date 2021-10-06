import java.io.IOException;
import java.util.Scanner;

public class Exam_01 {
	public static void main(String[]args) throws IOException{
		Scanner in = new Scanner(System.in);
		System.out.print("숫자를 입력 : ");
		int num = in.nextInt();
		
		System.out.print("연산자를 입력 : ");
		char op = (char)System.in.read();
	}
}
