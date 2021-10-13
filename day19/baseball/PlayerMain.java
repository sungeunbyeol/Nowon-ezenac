package baseball;

import java.util.*;

public class PlayerMain {
	public static void main(String[] args) {
		new BaseBallGUI("야구선수관리");
		/*
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
			default : System.out.println("잘못누르셨습니다. 다시 입력해 주세요!!");
			}
		}
		*/
	}
}
