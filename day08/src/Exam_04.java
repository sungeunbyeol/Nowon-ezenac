import java.util.Scanner;

public class Exam_04 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("�˰���� �Ǻ���ġ ������ ��ġ��? ");
		int su = in.nextInt();
		
		int res = pi(su);
		System.out.printf("%d ��°�� �Ǻ���ġ ���� : %d �Դϴ�. \n", su, res);
	}
	
	public static int pi(int n) {
		if(n<=2) return 1;
		return pi(n-2) + pi(n-1);
	}
}
