import java.util.Scanner;

public class Exam_06 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.print("단수를 입력하세요 : ");
		int gugudan = in.nextInt();
		int sum = 0;
		
		for(int i=1; i<=9; ++i) {
			sum = gugudan * i;
			System.out.printf("%d * %d = %d\n", gugudan, i, sum);
		}
		
	}
}
