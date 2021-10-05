package student;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		StudentPro pro = new StudentProImpl();
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.print("1.학생등록 2.학생보기 3.학생수정 4.학생삭제 5.종료 : ");
			int select = in.nextInt();
			switch(select) {
			case 1 :	pro.input(); break;
			case 2 :	pro.view(); break;
			case 3 :	pro.edit(); break;
			case 4 :	pro.delete(); break;
			case 5 :	pro.exit(); break;
			default :
				System.out.println("잘못입력하셨습니다. 다시 입력해 주세요!!");
			}
		}
	}
}
