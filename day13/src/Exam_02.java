import java.util.ArrayList;

public class Exam_02 {
	public static void main(String[] args) {
		int c = 10;
		Integer a = c;	//auto-boxing
		Integer b = new Integer(10); //boxing : �Ϲ��ڷ����� ���� Wrapper Class���·� �ٲٴ� ��
		
		int e = a;		//auto-unboxing
		int d = b.intValue();	//unboxing : Wrapper Class�� ���� �Ϲ� �ڷ������� �ٲٴ� ��
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
		//����Ÿ���� ���ڿ��� ������ ��ȯ�ϱ� : Integer.parseInt()
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
