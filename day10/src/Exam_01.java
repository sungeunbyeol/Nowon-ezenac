class A01{
	//멤버필드
	private int a;
	private static int b;
	static {
		b = 20;
	}
	//생성자
	public A01() {
		a = 10;
	}
	//멤버메소드
	public void disp() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	//중첩클래스
	class Inner01{//일반중첩클래스 : default 클래스, 아무것도 설정이 되어 있지 않다.
		private int c;
		public Inner01() {
			c = 30;
		}
		public void disp_in() {//바깥 클래스의 멤버를 가져다 사용할 수 있다.
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








