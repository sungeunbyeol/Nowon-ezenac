class A02{
	//멤버필드
	private int a;
	private static int b;
	static {
		b = 20;
	}
	//생성자
	public A02() {
		a = 10;
	}
	//멤버메소드
	public void disp() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	//중첩클래스
	class Inner02{//일반중첩클래스 : default 클래스, 아무것도 설정이 되어 있지 않다.
		private int c;
		public Inner02() {
			c = 30;
		}
		public void disp_in() {//바깥 클래스의 멤버를 가져다 사용할 수 있다.
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








