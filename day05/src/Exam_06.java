import java.util.Scanner;

public class Exam_06 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int[] su = new int[5];
		int sum = 0;
		for(int i = 0; i<su.length; ++i) {
			System.out.print(i+1+"번째 수를 입력 : " );
			su[i]=in.nextInt();
			sum += su[i];
		}
		
		for(int i=0; i<su.length; ++i) {
			System.out.print(su[i] + " , ");
		}
		System.out.println("합 : "+ sum);
		
	}
}
