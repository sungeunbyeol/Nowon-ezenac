
public class Exam_03 {
	public static void main(String[]args) {
		
		
		/* 9��° ����
		int a = 100000;
		String s = String.valueOf(a);//�Ű����� ���� String���� ��ȯ
		*/
	
		/* 8��° ����
		String str2 = "                   Hello, java!!         ";
		System.out.println(str.trim()); //���ڿ� �յ��� ���� ����
		*/
		
		//String str = "Hello, JAVA!!";
		
		/*7��° ����
		//substring(7, 11); ��?
		//7��° ��ġ���� 11��°�� �Ǳ� ������ ��� ��
		String subStr = str.substring(7, 11);
		System.out.println(subStr);
		
		String subStr2 = str.substring(7);
		//substring(7);
		//7��° ��ġ���� ������ ��� ��
		System.out.println(subStr2);
		*/
		
		/* 6��° ����
		//indexOf ��?
		//�ش��ϴ� ���� ���°�� �ֽ��ϱ�? �ϰ� ���� ��
		System.out.println(str.indexOf("JAVA"));
		*/
		
		/*5��° ����
		byte[] by = str.getBytes(); //���ڿ��� byte�迭�� �ٲپ� �ְڴ�
		//for(int i=0; i<by.length; ++i) {
			//System.out.println(by[i]);
		//}
		String str2 = new String(by); //byte�迭�� ���� ���ڿ��� ��ȯ�����ش�
		*/
		
		/*4��° ����
		//equalsIgnoreCase�� ��ҹ��� ������� ���ض� ��� ��
		if(str.equalsIgnoreCase("HELLO, JAVA!!")) { 
			System.out.println("aaa");
		}
		*/
		
		/*3��° ����
		if(str.endsWith("!!")) {
			System.out.println("�½��ϴ�.");
		}
		
		*/
		/*2�� ����
		//��ü ���ڸ� �ϳ��� ������ ���ؼ� for���� ���
		for(int i=0; i<str.length(); ++i) {//length() : ���ڿ��� ���̸� ��ȯ
			System.out.println(str.charAt(i));
		}
		*/
		//charAt�� ? 
		//index�� �ش��ϴ� ���� char������ �����ش�.
		//System.out.println(str.charAt(0));
		
		
		
		/*1�� ����
		String a = "aaa";
		String b = "aaa";
		String c = new String("aaa");
		String d = new String("aaa");
		
		//equals�� ? 
		//a�� ����Ű�� ���� �����Ϳ� b�� ����Ű�� ���� �����͸� ���Ͽ� true�� false�� �˷��ش�.
		System.out.println(a.equals(b));
		*/
	}
}
