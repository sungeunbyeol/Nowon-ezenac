package member;

import java.util.*;

public class MemberMain {
	public static void main(String[] args) {
		MemberPro pro = new MemberProImpl();
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.print("1.ȸ������ 2.ȸ������ 3.ȸ������ 4.ȸ������ 5.���� : ");
			int select = in.nextInt();
			switch(select) {
			case 1 :	pro.input(); break;
			case 2 :	pro.view(); break;
			case 3 :	pro.edit(); break;
			case 4 :	pro.delete(); break;
			case 5 :	pro.exit(); break;
			default :
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���!!");
			}
		}
	}
}
