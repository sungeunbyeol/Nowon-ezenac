import java.util.Scanner;

public class Exam_06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("������ ����? ");
		int num = in.nextInt();
		
		if(num%3==0) {
			if(num%5==0) {
				System.out.println("3�� 5�� ����Դϴ�.");
			} else {
				System.out.println("3�� ��� �Դϴ�.");
			}
		}else if(num%5==0) {
			System.out.println("5�� ��� �Դϴ�.");
		}else {
			System.out.println("�� ����� �ƴմϴ�.");
		}
		
	}
}
