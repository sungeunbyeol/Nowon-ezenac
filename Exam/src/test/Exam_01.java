package test;

class A01{
	String name;
	String tel;
	A01(){
		name = "È«±æµ¿";
		tel = "1234";
	}
	A01(String n, String t){
		name = n; tel=t;
	}
	void init(String n, String t){
		name = n; tel=t;
	}
	void disp() {
		System.out.println(name + "´ÔÀÇ ÀüÈ­¹øÈ£" + tel);
	}
}


public class Exam_01 {
	public static void main(String[]args) {
		int a;
		int[]arr = new int[3];
		
		A01 ap = new A01();
		A01 bp = new A01("È«±æµ¿", "1234");
	}

}
