import java.util.Calendar;
import java.util.Scanner;

public class Exam_07 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.print("�⵵�� �Է� : ");
		int year = in.nextInt();
		System.out.print("���� �Է� : ");
		int month = in.nextInt();
		
		Calendar cal = Calendar.getInstance();
		//�޷� �׸� �� 1�Ϻ��� ���س��� �׸�. �׷��� ����° �ڸ��� 1�� �־��ִ� ������ �� ������
		cal.set(year, month-1, 1); //��,��,���� �������ִ°�
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		for(int i=1; i<week; ++i) {
			System.out.print("\t");
		}
		for(int i=1; i<=lastDay; ++i) {
			System.out.print(i+"\t");
			++week;
			if(week==8) { //week�� 8�̸�
				System.out.println(""); //�ٰ����� �ϰڴ�.
				week = 1; //ù��° �ڸ����� ���� ��� �Է�
			}
		}
	}
}
