class A01 extends Thread{
	public void run() {
		System.out.println("A01Ŭ���� ����!!");
	}
}

public class Exam_01 {
	public static void main(String[]args) {
		System.out.println("main �ä���!!");
		A01 ap = new A01();
		ap.start();
		System.out.println("main ��");
	}
}
