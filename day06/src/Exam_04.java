import java.util.*;

// 업다운 게임. 이번에는 컴퓨터가 내 숫자를 맞추는 거
public class Exam_04 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("1~100까지의 숫자를 생각하세요.");
		System.out.println("Enter키를 누르면 게임이 시작됩니다!");
		in.nextLine();
		int num = 0;
		int Max = 100;
		int Min = 1;
		
		while(true) {
			int comsu = (int)(Math.random()*Max)+Min;
			System.out.println(comsu + "가 맞습니까?");
			System.out.println("1.up 2.down 3.BINGO!!!!");
			num = in.nextInt();
 
			switch(num) {
			case 1 : Max = Max - (comsu-Min+1);
					 Min = comsu+1;
					 break;
			case 2 : Max = comsu-Min;
					 break;
			case 3 : System.out.println("BINGO!!!! 게임을 종료합니다.");
					 System.exit(0);
			default : System.out.println("잘못입력하셨습니다.");
			}
		}
		
	}
}
