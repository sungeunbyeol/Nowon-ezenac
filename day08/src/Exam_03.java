import java.util.Scanner;

public class Exam_03 {
	public static void main(String[]args) {
	Scanner in = new Scanner(System.in);
	
	System.out.print("���丮�� �� : ");
	int su = in.nextInt();
	
	int res = factori(su);
	System.out.printf("%d�� ���丮�� ���� ? %d\n", su, res);
	}
	
	public static int factori(int n) {
		if(n==1) return 1;
		return n * factori(n-1);
				
	}
	
	

}
