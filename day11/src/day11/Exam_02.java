import java.util.*;
interface �����佺{
	public abstract void ����();		//�߻�޼ҵ�
	public abstract void �̵�();
}
class ���� implements �����佺{
	public void ����(){
		System.out.println("������ ������ �մϴ�.");
	}
	public void �̵�() {
		System.out.println("������ �̵��� �մϴ�.");
	}
}
class �巡�� implements �����佺{
	public void ����(){
		System.out.println("�巡���� ������ �մϴ�.");
	}
	public void �̵�() {
		System.out.println("�巡���� �̵��� �մϴ�.");
	}
}
public class Exam_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		�����佺 pro; 
		�����佺 pro1 = new �����佺() {
			public void ����() {
				
			}
			public void �̵�() {
				
			}
		};
		System.out.print("1.����  2.�巡�� : ");
		int select1 = in.nextInt();
		System.out.print("1.����  2.�̵� : ");
		int select2 = in.nextInt();
		
		if (select1 == 1) {
			pro = new ����();
		} else {
			pro = new �巡��();
		}
		if (select2 == 1) {
			pro.����();
		}else {
			pro.�̵�();
		}
	}
}







