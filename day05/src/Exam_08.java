import java.util.Scanner;

public class Exam_08 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		String[] name = new String[5];
		String[] tel = new String[5];
		
		for(int i=0; i<5; ++i) {
			System.out.print(i+1+"번째 회원의 이름 : ");
			name[i] = in.next();
			System.out.print(i+1+"번째 회원의 전화번호 : ");
			tel[i] = in.next();
		}
		
		for(int i=0; i<5; ++i) {
			System.out.printf("%d번째 회원의 이름은 %s 이고, 전화번호는 %s입니다.\n",
					i+1, name[i], tel[i]);
		}
	}
}
