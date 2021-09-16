import java.util.Scanner;

public class Exam_01 {
	public static void main(String[]agrs) {
		Scanner in = new Scanner(System.in);
		System.out.print("국어점수는 ? ");
		int kor = in.nextInt();
		
		if(kor>=60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	}
}
