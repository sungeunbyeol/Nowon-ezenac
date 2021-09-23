import java.util.Scanner;

public class Exam_03 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		int time=0;
		int co = 0;
		while(true) {
			System.out.print("분을 입력 : ");
			time = in.nextInt();
			if(time == 0) {
				break;
			} else if(time < 0) {
				System.out.println("음수는 넣을 수 업습니다.");
			} else {
				System.out.printf("%d시간 %d분 입니다.\n", time/60, time%60);
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
