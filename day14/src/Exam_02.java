import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

class A02{
	public void disp(int su) throws IOException{
		System.out.println("�Է��Ͻ� �� : " + su);
	}
}
public class Exam_02 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		A02 ap = new A02();
		try {
			System.out.print("���� �Է� : ");
			int su1 = in.nextInt();
			System.out.print("���� �Է� : ");
			int su2 = in.nextInt();
			int tot = su1/su2;
			ap.disp(100);
		}catch(IOException e) {
			System.out.println("disp�޼ҵ� ȣ���� ���� �߻�!!");
		}catch(InputMismatchException e) {
			System.out.println("���ڸ� �Է��ϼž� �մϴ�.");
		}catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
	}
}
