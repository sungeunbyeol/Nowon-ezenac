import java.util.Scanner;

public class Exam_03 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("������ �����ϼ��� : ");
		String name = in.next();
		
		switch(name) {
		case "¥���" : System.out.println("4000�� �Դϴ�."); break;
		case "«��" : System.out.println("4500�� �Դϴ�."); break;
		case "������" : System.out.println("6000�� �Դϴ�."); break;
		case "�쵿" : System.out.println("4500�� �Դϴ�."); break; 
		default : System.out.println("�����Ͻ� ������ �������� �ʽ��ϴ�.");
		}
	}
}
