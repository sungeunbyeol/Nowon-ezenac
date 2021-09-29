import java.util.*;
class RoomMg{
	//멤버필드 : 선언
	Scanner in;
	boolean room[];
	int roomSu;
	
	//생성자 : 멤버필드의 초기값 설정
	RoomMg(){
		in = new Scanner(System.in);
		System.out.print("방의 갯수 : ");
		roomSu = in.nextInt();
		room = new boolean[roomSu];
	}
	//멤버메소드 : 기능
	//클래스를 만들고자 할때 기능을 많이 많이 만들어 준다.
	//입실하는 메소드, 퇴실하는 메소드, 방상태를 보여주는 메소드, 프로그램을 종료시키는 메소드
	void input() {
		int roomNum;
		do {
			System.out.print("입실하실 방의 번호 : ");
			roomNum = in.nextInt();
		}while(roomNum<1 || roomNum>roomSu);
		if (room[roomNum-1]) {
			System.out.println("이미 사용중인 방입니다.");
		}else {
			room[roomNum-1] = true;
			System.out.println(roomNum+"호실에 입실하셨습니다.");
		}
	}
	void output() {
		int roomNum;
		do {
			System.out.print("퇴실하실 방의 번호 : ");
			roomNum = in.nextInt();
		}while(roomNum<1 || roomNum>roomSu);
		if (!room[roomNum-1]) {
			System.out.println("빈 방입니다.");
		}else {
			room[roomNum-1] = false;
			System.out.println(roomNum+"호실에서 퇴실하셨습니다.");
		}
	}
	void disp() {
		for(int i=0; i<roomSu; ++i) {
			if (room[i]) {
				System.out.println(i+1+"호실은 사용중");
			}else {
				System.out.println(i+1+"호실은 빈방");
			}
		}
	}
	void exit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}
}
public class Exam_05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		RoomMg room = new RoomMg();
		
		while(true) {
			System.out.print("1.입실  2.퇴실  3.보기  4.종료 : ");
			int select = in.nextInt();
			
			switch(select) {
			case 1 :	room.input(); break;
			case 2 :	room.output(); break;
			case 3 :	room.disp(); break;
			case 4 :	room.exit(); break;
			default :	System.out.println("잘못입력하셨습니다. 다시 입력해 주세요!!");
			}
		}
	}
}
