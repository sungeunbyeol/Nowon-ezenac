import java.util.Scanner;

public class Exam_01 {
	public static void main(String[]agrs) {
		Scanner in = new Scanner(System.in);
		System.out.print("���������� ? ");
		int kor = in.nextInt();
		
		if(kor>=60) {
			System.out.println("�հ�");
		} else {
			System.out.println("���հ�");
		}
	}
}
