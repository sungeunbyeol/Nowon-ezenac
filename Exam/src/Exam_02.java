import java.util.Scanner;

public class Exam_02 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int time = 0;

		while(true) {
			System.out.print("분을 입력하세요 :");
			time = in.nextInt();
			
			if(time<0) {
				 System.out.println("음수를 입력할 수 없습니다.");
			} else if(time==0) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			} else {
				System.out.printf("%d시간 %d분 입니다.\n",time/60, time%60);
			}
		
		}
		
	}
}
