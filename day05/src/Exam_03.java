import java.util.Scanner;

public class Exam_03 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		int time=0;
		int co = 0;
		while(true) {
			System.out.print("���� �Է� : ");
			time = in.nextInt();
			if(time == 0) {
				break;
			} else if(time < 0) {
				System.out.println("������ ���� �� �����ϴ�.");
			} else {
				System.out.printf("%d�ð� %d�� �Դϴ�.\n", time/60, time%60);
			}
		}
		System.out.println("���α׷��� �����մϴ�.");
	}
}
