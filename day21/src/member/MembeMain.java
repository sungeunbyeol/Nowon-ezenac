package member;

import java.util.*;

public class MembeMain {
	public static void main(String[] args) {
		MemberPro pro = new MemberProImpl();
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.print("1.회원가입 2.회원보기 3.회원수정 4.회원삭제 5.파일저장 6.파일꺼내기 7.종료 : ");
			int select = in.nextInt();
			switch(select) {
			case 1 :	pro.input(); break;
			case 2 :	pro.view(); break;
			case 3 :	pro.edit(); break;
			case 4 :	pro.delete(); break;
			case 5 :	pro.save(); break;
			case 6 :	pro.load(); break;
			case 7 :	pro.exit(); break;
			default :
				System.out.println("잘못입력하셨습니다. 다시 입력해 주세요!!");
			}
		}
	}
}
