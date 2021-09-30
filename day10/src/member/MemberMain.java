package member;

import java.util.*;

public class MemberMain {
	public static void main(String[]args) {
		MemberPro pro = new MemberPro();
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.print("1.회원가입 2.회원보기 3.회원수정 4.회원삭제 5종료 : ");
			int select = in.nextInt();
			switch(select) {
			case 1 : pro.input(); break;
			case 2 : pro.view(); break;
			case 3 : pro.edit(); break;
			case 4 : pro.delete(); break;
			case 5 : pro.exit(); break;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
}
