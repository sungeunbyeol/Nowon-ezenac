package baseball;

import java.util.*;

public class PlayerMain {
	public static void main(String[]args) {
		PlayerMg mg = new PlayerMgImpl();
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.print("1.������� 2.�������� 3.Ʈ���̵� 4.���� : ");
			int select = in.nextInt();
			switch(select) {
			case 1 : mg.input(); break;
			case 2 : mg.view(); break;
			case 3 : mg.trade(); break;
			case 4 : mg.exit(); break;
			default : System.out.println("�߸��Է������ϱ� �ٽ��Է��ض�");
			}
		}
	}
}
