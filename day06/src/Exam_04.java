import java.util.*;

// ���ٿ� ����. �̹����� ��ǻ�Ͱ� �� ���ڸ� ���ߴ� ��
public class Exam_04 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("1~100������ ���ڸ� �����ϼ���.");
		System.out.println("EnterŰ�� ������ ������ ���۵˴ϴ�!");
		in.nextLine();
		int num = 0;
		int Max = 100;
		int Min = 1;
		
		while(true) {
			int comsu = (int)(Math.random()*Max)+Min;
			System.out.println(comsu + "�� �½��ϱ�?");
			System.out.println("1.up 2.down 3.BINGO!!!!");
			num = in.nextInt();
 
			switch(num) {
			case 1 : Max = Max - (comsu-Min+1);
					 Min = comsu+1;
					 break;
			case 2 : Max = comsu-Min;
					 break;
			case 3 : System.out.println("BINGO!!!! ������ �����մϴ�.");
					 System.exit(0);
			default : System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		}
		
	}
}
