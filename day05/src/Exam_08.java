import java.util.Scanner;

public class Exam_08 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		String[] name = new String[5];
		String[] tel = new String[5];
		
		for(int i=0; i<5; ++i) {
			System.out.print(i+1+"��° ȸ���� �̸� : ");
			name[i] = in.next();
			System.out.print(i+1+"��° ȸ���� ��ȭ��ȣ : ");
			tel[i] = in.next();
		}
		
		for(int i=0; i<5; ++i) {
			System.out.printf("%d��° ȸ���� �̸��� %s �̰�, ��ȭ��ȣ�� %s�Դϴ�.\n",
					i+1, name[i], tel[i]);
		}
	}
}
