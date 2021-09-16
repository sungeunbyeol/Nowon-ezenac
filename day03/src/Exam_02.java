import java.util.Scanner;

public class Exam_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("임의의 수가 짝수입니까? 홀수입니까? ");
		int num = in.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
	}
}
