import java.util.Scanner;

public class Exam_05 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);

		int sum =0;
		int[] num = new int[5];
		for(int i=0; i<num.length; ++i) {
			System.out.print(i+1+"���ڸ� �Է��ϼ��� : ");
			num[i] = in.nextInt();
			sum += num[i];			
		}
		
		for(int i=0; i<num.length; ++i) {
			System.out.printf("%d ", num[i]);
		}
		System.out.println(" ");
		System.out.println("���ڵ��� ���� ? " + sum);
		
	}
}
