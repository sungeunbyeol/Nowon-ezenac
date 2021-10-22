class A09{
	int a = 10;
}

public class Test00 {
	public static void main(String[] args) {
		String msg = "aaa";
		
		//Object obj = msg;
		Object obj = new A09();
		
		
		if (obj instanceof String) {//다형성연산자  / obj가 string 형으로 변환되나? 하고 묻는거
			String aaa = (String)obj;
			System.out.println(aaa);
		}else {
			A09 ap = (A09)obj;
			System.out.println(ap.a);
		}
	}
}
