import java.util.ArrayList;

public class Exam_02 {
	public static void main(String[] args) {
		int c = 10;
		Integer a = c;	//auto-boxing
		Integer b = new Integer(10); //boxing : 일반자료형의 값을 Wrapper Class형태로 바꾸는 것
		
		int e = a;		//auto-unboxing
		int d = b.intValue();	//unboxing : Wrapper Class의 값을 일반 자료형으로 바꾸는 것
		/*
		ArrayList<Integer> list = new ArrayList<>();
		Integer a = new Integer("10");
		Integer b = new Integer(10);
		int c = 10;
		list.add(a);
		list.add(b);
		list.add(c);
		for(Integer in : list) {
			System.out.println(in);
		}
		/*
		//byte, short, int, long, float, double
		String price = "1000";
		int iprice = Integer.parseInt(price);
		//정수타입의 문자열을 정수로 변환하기 : Integer.parseInt()
		System.out.println(iprice*1.1);
		//Integer a = new Integer(10);
		//Integer b = new Integer("10");
		//System.out.println(a);
		//System.out.println(b);
		//int c = 10;
		//if (a == c) {
		//	System.out.println("aaa");
		//	}
		/*
		boolean t = true;
		Boolean a = new Boolean(t);
		String s = "true";
		Boolean b = new Boolean(s);
		
		if (Boolean.TRUE) {
			System.out.println("b = " + b);
		}
		*/
	}
}
