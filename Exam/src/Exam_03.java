import java.util.Scanner;

public class Exam_03 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int kor = 0;
		do {
			System.out.print("���������� �Է��ϼ��� : ");
			kor = in.nextInt();
		} while(kor<0 || kor>100);
			
		System.out.println("�Է��Ͻ� �������� : " + kor);
		
		
	}
}
