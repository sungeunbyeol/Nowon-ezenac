// �Ϲ����� <up / down> ����

import java.util.*;

public class Exam_03 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int comsu = (int)(Math.random()*100)+1; //��ǻ�Ͱ� �������� ���ϱ�
		//System.out.println(comsu); //�̰� ����Ȯ���ϴ� �뵵�� ��� ����
		
		int num = 0;
		int co = 0;
		while(true) {
			System.out.print("���� �Է� : ");
			num = in.nextInt();
			++co;
			if(num==comsu) {
				break;
			} else if(num<comsu) {
				System.out.println("up!");
			} else {
				System.out.println("down!");
			}
		}
		
		System.out.print(co + "������ ������ϴ�.");
		
	}
}
