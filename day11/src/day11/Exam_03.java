interface A03{
	//����ʵ� : ����� ����
	public static final int A = 10; 
	public static int B = 20;	//public static final �� �ν�
	public final int C = 30;	//public static final �� �ν�
	public int D = 40;			//public static final �� �ν�
	int F = 50;					//public static final �� �ν�
	//private int G = 60;		public �ڸ��� private�� �־ ���� �߻�!!
	//����޼ҵ� : public �߻�޼ҵ常 ����
	public abstract void disp();
	public void disp2();		//������ �߻�޼ҵ常 ����, �˾Ƽ� abstract�� �����ش�
	void disp3();
	//private void disp4();
	/*
	 * public void disp5() { 
	 * 	System.out.println("�������̽�"); 
	 * }
	 */
	static class In01{}
	class In02{}			//�˾Ƽ� static�� �����ش�
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
