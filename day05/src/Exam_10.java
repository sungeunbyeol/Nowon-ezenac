import java.util.Scanner;

public class Exam_10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("�ο����� �Է� : ");
		int inwon = in.nextInt();
		
		String[] name = new String[inwon];
		int[] kor = new int[inwon];
		int[] eng = new int[inwon];
		int[] sum = new int[inwon];
		int[] rank = new int[inwon];
		
		for(int i=0; i<inwon; ++i) {
			System.out.print(i+1+"��° �л��� �̸��� ? ");
			name[i] = in.next();
			System.out.print(i+1+"��° �л��� ���������� ? ");
			kor[i] = in.nextInt();
			System.out.print(i+1+"��° �л��� ���������� ? ");
			eng[i] = in.nextInt();
			sum[i] += kor[i] + eng[i];
		}
		
		//���� ���ϴ� ���α׷�
		for(int i=0; i<inwon; ++i) { //i�� ��
			rank[i] = 1;
			for(int j=0; j<inwon; ++j) { //j�� �츮�� ģ��
				if(sum[i] < sum[j]) { // �� ������ �츮���л� �������� ������
					++rank[i]; // �� ������ �ϳ� �ø���.
				}
			}
		}
		
		for(int i = 0; i<inwon; ++i) {
			System.out.println(name[i]+"�� ������ ���� " + sum[i] + "�̰�" + rank[i] + "�� �Դϴ�.");
		}
		
	}
}
