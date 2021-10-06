import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

class A02{
	public void disp(int su) throws IOException{
		System.out.println("입력하신 수 : " + su);
	}
}
public class Exam_02 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		A02 ap = new A02();
		try {
			System.out.print("수를 입력 : ");
			int su1 = in.nextInt();
			System.out.print("수를 입력 : ");
			int su2 = in.nextInt();
			int tot = su1/su2;
			ap.disp(100);
		}catch(IOException e) {
			System.out.println("disp메소드 호출중 예외 발생!!");
		}catch(InputMismatchException e) {
			System.out.println("숫자만 입력하셔야 합니다.");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}
}
