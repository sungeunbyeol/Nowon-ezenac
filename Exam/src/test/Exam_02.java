package test;

public class Exam_02 {
	public static void main(String[]args) {
		star();
		System.out.println("aaaaaaaaa");
		star(15); star(7);
		System.out.println("bbbbbbbbb");
		star(2,8);
		System.out.println("ccccccccc");
		System.out.println("ddddddddd");
		star(); star(); star(); star();
	}
	
	public static void star() {
		System.out.println("********");
	}
	public static void star(int n) {
		for(int i=0; i<n; ++i) {
			System.out.print("*");
		}
		System.out.println();
	}
	public static void star(int a, int b) {
		for(int i=0; i<a; ++i) {
			for(int j=0; j<b; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
