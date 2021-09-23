import java.util.Scanner;

public class Exam_01 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		int co = 0;
		
		while(true) {
			System.out.print("수를 입력해주세요 : ");
			num = in.nextInt();
			if(num<=0) {
				break;
			} else {
				sum += num;
				++co;
			}
		}
		System.out.printf("입력수의 합 : %d, 평균 : %.2f\n ", sum, (float)sum/co);
	}
}
