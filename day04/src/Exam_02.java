import java.util.Scanner;

public class Exam_02 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.print("���������� �Է� : ");
		int kor = in.nextInt();
		System.out.print("���������� �Է� : ");
		int eng = in.nextInt();
		
		int avg = (kor + eng) / 2;
		System.out.println(avg);
		
		switch(avg/10) {
		case 10 : System.out.println("�� �Դϴ�."); break; 
		case 9 : System.out.println("�� �Դϴ�."); break; 
		case 8 : System.out.println("�� �Դϴ�."); break;
		case 7 : System.out.println("�� �Դϴ�."); break;
		case 6 : System.out.println("�� �Դϴ�."); break;
		default : System.out.println("�� �Դϴ�.");
		}
	}
}
