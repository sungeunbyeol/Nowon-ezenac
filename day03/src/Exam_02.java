import java.util.Scanner;

public class Exam_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("������ ���� ¦���Դϱ�? Ȧ���Դϱ�? ");
		int num = in.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}
	}
}
