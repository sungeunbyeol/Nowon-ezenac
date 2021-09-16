import java.util.Scanner;

public class Exam_04 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("첫번째 수: ");
		int num1 = in.nextInt();
		System.out.print("두번째 수: ");
		int num2 = in.nextInt();
		
		if(num1>num2) {
			System.out.println("첫번째 수가 더 큽니다.");
		} else if(num1<num2) {
			System.out.println("두번째 수가 더 큽니다.");
		} else {
			System.out.println("두 수가 같습니다.");
		}
		
	}
}
