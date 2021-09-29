import java.util.Scanner;

public class Exam_04 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("알고싶은 피보나치 수열의 위치는? ");
		int su = in.nextInt();
		
		int res = pi(su);
		System.out.printf("%d 번째의 피보나치 값은 : %d 입니다. \n", su, res);
	}
	
	public static int pi(int n) {
		if(n<=2) return 1;
		return pi(n-2) + pi(n-1);
	}
}
