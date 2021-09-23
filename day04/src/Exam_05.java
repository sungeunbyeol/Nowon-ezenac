import java.util.Scanner;

public class Exam_05 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.print("임의의 수는? ");
		int a = in.nextInt();
		int sum = 0;
		for(int i=1; i<=a; ++i) {
			if(i%2==0) {
				sum += i;
			}
		}
		System.out.printf("1~ %d의 수의 짝수의 합은? %d\n", a, sum);
	}
}
