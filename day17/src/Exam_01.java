class A01 extends Thread{
	public void run() {
		System.out.println("A01클래스 시작!!");
	}
}

public class Exam_01 {
	public static void main(String[]args) {
		System.out.println("main 시ㅏ작!!");
		A01 ap = new A01();
		ap.start();
		System.out.println("main 끝");
	}
}
