import java.util.Scanner;

public class Exam_03 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("음식을 선택하세요 : ");
		String name = in.next();
		
		switch(name) {
		case "짜장면" : System.out.println("4000원 입니다."); break;
		case "짬뽕" : System.out.println("4500원 입니다."); break;
		case "볶음밥" : System.out.println("6000원 입니다."); break;
		case "우동" : System.out.println("4500원 입니다."); break; 
		default : System.out.println("선택하신 음식은 제공되지 않습니다.");
		}
	}
}
