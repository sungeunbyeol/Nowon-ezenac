package baseball;

import java.util.*;

public class PlayerMain {
	public static void main(String[]args) {
		PlayerMg mg = new PlayerMgImpl();
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.print("1.선수등록 2.선수보기 3.트레이드 4.종료 : ");
			int select = in.nextInt();
			switch(select) {
			case 1 : mg.input(); break;
			case 2 : mg.view(); break;
			case 3 : mg.trade(); break;
			case 4 : mg.exit(); break;
			default : System.out.println("잘못입력했으니까 다시입력해라");
			}
		}
	}
}
