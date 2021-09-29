import java.util.Scanner;

public class Exam_02 {
	
	public static void main(String[]args) {
		int num1 = input();
		int num2 = input();
		
		int bigsu = absBigsu(num1, num2);
		System.out.printf("%d %d 중에서 큰 절대값은? %d\n", num1, num2, bigsu);
	}
	
	public static int absBigsu(int a, int b) {
		if(a<0) a *= -1;
		if(b<0) b*=-1;
		if(a>b) return a;
		else return b;
	}
	
	public static int absSu(int a) {
		if(a<0) a*= -1;
		return a;
	}
	
	public static int input() {
		Scanner in = new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		int su = in.nextInt();
		return su;
	}

}

