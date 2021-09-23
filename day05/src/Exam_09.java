import java.util.Scanner;

public class Exam_09 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] sum = new int[5];
		
		for(int i=0; i<5; ++i) {
			System.out.print(i+1+"번째 학생의 이름은? ");
			name[i] = in.next();
			System.out.print(i+1+"번째 학생의 국어점수는? ");
			kor[i] = in.nextInt();
			System.out.print(i+1+"번째 학생의 영어점수는? ");
			eng[i] = in.nextInt(); 
			sum[i] = kor[i] + eng[i];
		}
		
		for(int i = 0; i<5; ++i) {
			System.out.println(name[i]+ "학생은 " + sum[i] + "입니다.");
		}
	
	}
}
