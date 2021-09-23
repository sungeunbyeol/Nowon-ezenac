import java.util.Scanner;

public class Exam_02 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		int sum = 0;
		int co = 0;
		while(true) {
			System.out.print("수를 입력 : ");
			int su = in.nextInt();
			if(su <= 0) {
				break;
			}
			sum += su;
			++co;
		}
		System.out.printf("입력수의 합 : %d, 평균 : %.2f\n ", sum, (float)sum/co);
	}
}
