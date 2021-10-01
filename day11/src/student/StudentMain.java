import java.util.*;

public class StudentMain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StudentInter sti = new StudentImpl(); //업캐스팅
		while(true) {
			System.out.print("1.학생등록 2.학생보기 3.학생삭제 4.학생수정 5.종료 : ");
			int select = in.nextInt();
			switch(select) {
			case 1 : sti.input(); break;
			case 2 : sti.view(); break;
			case 3 : sti.delete(); break;
			case 4 : sti.edit(); break;
			case 5 : sti.exit(); break;
			default : System.out.println("잘못 입력하셨습니다!");
			}
		}
	}
}
