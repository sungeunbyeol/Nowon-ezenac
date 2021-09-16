import java.util.Scanner;

public class Exam_07 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.print("국어점수는? ");
		int kor = in.nextInt();
		System.out.print("영어점수는? ");
		int eng = in.nextInt();
		
		int avg = (kor+eng)/2;
		System.out.println(avg);
		if(avg>=90) {
			System.out.println("수");
		} else if(avg>=80) {
			System.out.println("우");
		} else if(avg>=70) {
			System.out.println("미");
		} else if(avg>=60) {
			System.out.println("양");
		} else {
			System.out.println("가");
		}
	}
}
