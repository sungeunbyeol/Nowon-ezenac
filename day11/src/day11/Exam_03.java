interface A03{
	//멤버필드 : 상수만 가능
	public static final int A = 10; 
	public static int B = 20;	//public static final 로 인식
	public final int C = 30;	//public static final 로 인식
	public int D = 40;			//public static final 로 인식
	int F = 50;					//public static final 로 인식
	//private int G = 60;		public 자리에 private이 있어서 오류 발생!!
	//멤버메소드 : public 추상메소드만 가능
	public abstract void disp();
	public void disp2();		//무조건 추상메소드만 가능, 알아서 abstract를 붙혀준다
	void disp3();
	//private void disp4();
	/*
	 * public void disp5() { 
	 * 	System.out.println("인터페이스"); 
	 * }
	 */
	static class In01{}
	class In02{}			//알아서 static을 붙혀준다
}
class B03{
	public static int B = 20;
}
public class Exam_03 {
	public static void main(String[] args) {
		A03.In02 ai = new A03.In02();
		//A03.B = 100;
		//B03.B = 100;
		System.out.println(A03.C);
	}
}
