import java.util.Scanner;

public class Exam_07 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("������ ���� �Է��ϼ��� : ");
		int num = in.nextInt();
		int a = 0;
		
		System.out.printf("%d�� ��� : ",num);
		for(int i = 1; i<num/2; ++i) {
			if(num%i==0){
				System.out.print(i + ", ");
			}
			
		} 		
		System.out.println(num);
	}
}
