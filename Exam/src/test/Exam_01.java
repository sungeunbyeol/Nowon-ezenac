package test;

class A01{
	String name;
	String tel;
	A01(){
		name = "ȫ�浿";
		tel = "1234";
	}
	A01(String n, String t){
		name = n; tel=t;
	}
	void init(String n, String t){
		name = n; tel=t;
	}
	void disp() {
		System.out.println(name + "���� ��ȭ��ȣ" + tel);
	}
}


public class Exam_01 {
	public static void main(String[]args) {
		int a;
		int[]arr = new int[3];
		
		A01 ap = new A01();
		A01 bp = new A01("ȫ�浿", "1234");
	}

}
