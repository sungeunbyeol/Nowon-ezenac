class A02{
	//����ʵ�
	private int a;
	private static int b;
	static {
		b = 20;
	}
	//������
	public A02() {
		a = 10;
	}
	//����޼ҵ�
	public void disp() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	//��øŬ����
	class Inner02{//�Ϲ���øŬ���� : default Ŭ����, �ƹ��͵� ������ �Ǿ� ���� �ʴ�.
		private int c;
		public Inner02() {
			c = 30;
		}
		public void disp_in() {//�ٱ� Ŭ������ ����� ������ ����� �� �ִ�.
			System.out.println("a = " + a);
			System.out.println("b = " + b);
			System.out.println("c = " + c);
		}
	}
	Inner02 in = new Inner02();
}
public class Exam_02 {
	public static void main(String[] args) {
		A01 ap = new A01();
		A01.Inner02 ai = ap.new Inner02();
		ai.disp_in();
		//A01$Inner01
		ap.in.disp_in();
	}
}








