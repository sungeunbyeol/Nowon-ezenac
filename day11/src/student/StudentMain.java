import java.util.*;

public class StudentMain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StudentInter sti = new StudentImpl(); //��ĳ����
		while(true) {
			System.out.print("1.�л���� 2.�л����� 3.�л����� 4.�л����� 5.���� : ");
			int select = in.nextInt();
			switch(select) {
			case 1 : sti.input(); break;
			case 2 : sti.view(); break;
			case 3 : sti.delete(); break;
			case 4 : sti.edit(); break;
			case 5 : sti.exit(); break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�!");
			}
		}
	}
}
