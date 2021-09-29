import java.util.*;
class RoomMg{
	//����ʵ� : ����
	Scanner in;
	boolean room[];
	int roomSu;
	
	//������ : ����ʵ��� �ʱⰪ ����
	RoomMg(){
		in = new Scanner(System.in);
		System.out.print("���� ���� : ");
		roomSu = in.nextInt();
		room = new boolean[roomSu];
	}
	//����޼ҵ� : ���
	//Ŭ������ ������� �Ҷ� ����� ���� ���� ����� �ش�.
	//�Խ��ϴ� �޼ҵ�, ����ϴ� �޼ҵ�, ����¸� �����ִ� �޼ҵ�, ���α׷��� �����Ű�� �޼ҵ�
	void input() {
		int roomNum;
		do {
			System.out.print("�Խ��Ͻ� ���� ��ȣ : ");
			roomNum = in.nextInt();
		}while(roomNum<1 || roomNum>roomSu);
		if (room[roomNum-1]) {
			System.out.println("�̹� ������� ���Դϴ�.");
		}else {
			room[roomNum-1] = true;
			System.out.println(roomNum+"ȣ�ǿ� �Խ��ϼ̽��ϴ�.");
		}
	}
	void output() {
		int roomNum;
		do {
			System.out.print("����Ͻ� ���� ��ȣ : ");
			roomNum = in.nextInt();
		}while(roomNum<1 || roomNum>roomSu);
		if (!room[roomNum-1]) {
			System.out.println("�� ���Դϴ�.");
		}else {
			room[roomNum-1] = false;
			System.out.println(roomNum+"ȣ�ǿ��� ����ϼ̽��ϴ�.");
		}
	}
	void disp() {
		for(int i=0; i<roomSu; ++i) {
			if (room[i]) {
				System.out.println(i+1+"ȣ���� �����");
			}else {
				System.out.println(i+1+"ȣ���� ���");
			}
		}
	}
	void exit() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
	}
}
public class Exam_05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		RoomMg room = new RoomMg();
		
		while(true) {
			System.out.print("1.�Խ�  2.���  3.����  4.���� : ");
			int select = in.nextInt();
			
			switch(select) {
			case 1 :	room.input(); break;
			case 2 :	room.output(); break;
			case 3 :	room.disp(); break;
			case 4 :	room.exit(); break;
			default :	System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���!!");
			}
		}
	}
}
