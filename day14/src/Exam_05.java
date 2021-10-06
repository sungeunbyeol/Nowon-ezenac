import java.util.*;

class MyException04 extends Exception{	
	private String message;
	public MyException04(String msg) {
		super(msg);
	}
	@Override
	public String getMessage() {
		return super.getMessage() + "������ 0������ 100�� ���̰��� �Է��ؾߵ˴ϴ�.";
	}
}

public class Exam_05 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		try {
			System.out.print("���������� �Է� : ");
			int kor = in.nextInt();
			if(kor<0 || kor>100) {
				throw new MyException04("����");
			}
			System.out.println("�Է��Ͻ� ���������� " + kor + "�� �Դϴ�.");
		}catch(InputMismatchException e){ 
			System.err.println("���ڸ� �Է����ּ���!!");
		}catch(MyException04 e) {
			System.err.println(e.getMessage());
		}
	}
}
