import java.util.Scanner;

public class Exam_05 {
	public static void main(String[]agrs) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("ù ��° ��: ");
		int num1 = in.nextInt();
		System.out.print("�� ��° ��: ");
		int num2 = in.nextInt();
		System.out.print("�� ��° ��: ");
		int num3 = in.nextInt();
		
		//ū ���� ã�Ƽ� num1�� �ֱ�
		if(num2>num1 && num2>num3) {
			int imsi = num1;
			num1 = num2;
			num2 = imsi;
		} else if(num3>num1 && num3>num2) {
			int imsi = num3;
			num3 = num1;
			num1 = imsi;
		} // �̷��� �������� num1�� ���� ū ���� ������.
		
		// �� ��°�� ū ���� ã�Ƽ� num2�� �ֱ�
		if(num3>num2) {
			int imsi = num3;
			num3 = num2;
			num2 = imsi;
		}
		
		System.out.println(num1 +  ">=" + num2 +  ">=" + num3);
		
	}
}
