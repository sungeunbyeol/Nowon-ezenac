import java.util.Scanner;

public class Exam_09 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] sum = new int[5];
		
		for(int i=0; i<5; ++i) {
			System.out.print(i+1+"��° �л��� �̸���? ");
			name[i] = in.next();
			System.out.print(i+1+"��° �л��� ����������? ");
			kor[i] = in.nextInt();
			System.out.print(i+1+"��° �л��� ����������? ");
			eng[i] = in.nextInt(); 
			sum[i] = kor[i] + eng[i];
		}
		
		for(int i = 0; i<5; ++i) {
			System.out.println(name[i]+ "�л��� " + sum[i] + "�Դϴ�.");
		}
	
	}
}
