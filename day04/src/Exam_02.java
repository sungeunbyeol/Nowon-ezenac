import java.util.Scanner;

public class Exam_02 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.print("국어점수를 입력 : ");
		int kor = in.nextInt();
		System.out.print("영어점수를 입력 : ");
		int eng = in.nextInt();
		
		int avg = (kor + eng) / 2;
		System.out.println(avg);
		
		switch(avg/10) {
		case 10 : System.out.println("수 입니다."); break; 
		case 9 : System.out.println("수 입니다."); break; 
		case 8 : System.out.println("우 입니다."); break;
		case 7 : System.out.println("미 입니다."); break;
		case 6 : System.out.println("양 입니다."); break;
		default : System.out.println("가 입니다.");
		}
	}
}
