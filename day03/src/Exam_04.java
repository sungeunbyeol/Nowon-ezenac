import java.util.Scanner;

public class Exam_04 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("ù��° ��: ");
		int num1 = in.nextInt();
		System.out.print("�ι�° ��: ");
		int num2 = in.nextInt();
		
		if(num1>num2) {
			System.out.println("ù��° ���� �� Ů�ϴ�.");
		} else if(num1<num2) {
			System.out.println("�ι�° ���� �� Ů�ϴ�.");
		} else {
			System.out.println("�� ���� �����ϴ�.");
		}
		
	}
}
