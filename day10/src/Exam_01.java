class A01{
	//����ʵ�
	private int a;
	private static int b;
	static {
		b = 20;
	}
	//������
	public A01() {
		a = 10;
	}
	//����޼ҵ�
	public void disp() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	//��øŬ����
	class Inner01{//�Ϲ���øŬ���� : default Ŭ����, �ƹ��͵� ������ �Ǿ� ���� �ʴ�.
		private int c;
		public Inner01() {
			c = 30;
		}
		public void disp_in() {//�ٱ� Ŭ������ ����� ������ ����� �� �ִ�.
			System.out.println("a = " + a);
			System.out.println("b = " + b);
			System.out.println("c = " + c);
		}
	}
	Inner01 in = new Inner01();
}
public class Exam_01 {
	public static void main(String[] args) {
		A01 ap = new A01();
		A01.Inner01 ai = ap.new Inner01();
		ai.disp_in();
		//A01$Inner01
		ap.in.disp_in();
	}
}








