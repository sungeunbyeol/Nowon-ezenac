import java.util.Scanner;

public class Exam_01 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		int co = 0;
		
		while(true) {
			System.out.print("���� �Է����ּ��� : ");
			num = in.nextInt();
			if(num<=0) {
				break;
			} else {
				sum += num;
				++co;
			}
		}
		System.out.printf("�Է¼��� �� : %d, ��� : %.2f\n ", sum, (float)sum/co);
	}
}
