import java.util.*;
public class Exam_05 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
	
		System.out.println("ù ��° ���� �Է� : ");
		num1 = in.nextInt();
		System.out.println("�� ��° ���� �Է� : ");
		num2 = in.nextInt();
	
		if(num1>num2) {
			int imsi = num1;
			num1 = num2;
			num2 = imsi;
		}
		
		int gcd=0;
		
		for (int i =1; i<=num1; i++) {
			if(num2%i ==0) {
				if(num1%i==0) {
					gcd = i;
				}
			}
		}
		System.out.println("�ִ� ����� : " + gcd);
		
		
		
	}
}
