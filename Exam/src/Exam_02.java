import java.util.Scanner;

public class Exam_02 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int time = 0;

		while(true) {
			System.out.print("���� �Է��ϼ��� :");
			time = in.nextInt();
			
			if(time<0) {
				 System.out.println("������ �Է��� �� �����ϴ�.");
			} else if(time==0) {
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			} else {
				System.out.printf("%d�ð� %d�� �Դϴ�.\n",time/60, time%60);
			}
		
		}
		
	}
}
