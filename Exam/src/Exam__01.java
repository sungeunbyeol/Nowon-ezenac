import java.util.Scanner;

public class Exam__01 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		int sum = 0 ;
		int co = 0 ; 
		int num = 0;
		
		while(true) {
			System.out.print("���� �Է����ּ��� : ");
			num = in.nextInt();
			if(num<=0){
				break;
			} else {
				sum += num;
				++co;
			}
		}
		System.out.printf("���� %d, ����� %.2f �Դϴ�.", sum, sum/(float)co);
		
	}
}
