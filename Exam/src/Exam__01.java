import java.util.Scanner;

public class Exam__01 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		int sum = 0 ;
		int co = 0 ; 
		int num = 0;
		
		while(true) {
			System.out.print("수를 입력해주세요 : ");
			num = in.nextInt();
			if(num<=0){
				break;
			} else {
				sum += num;
				++co;
			}
		}
		System.out.printf("합은 %d, 평균은 %.2f 입니다.", sum, sum/(float)co);
		
	}
}
