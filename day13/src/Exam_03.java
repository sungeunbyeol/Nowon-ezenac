
public class Exam_03 {
	public static void main(String[]args) {
		
		
		/* 9번째 에제
		int a = 100000;
		String s = String.valueOf(a);//매개변수 값을 String으로 변환
		*/
	
		/* 8번째 예제
		String str2 = "                   Hello, java!!         ";
		System.out.println(str.trim()); //문자열 앞뒤의 공백 제거
		*/
		
		//String str = "Hello, JAVA!!";
		
		/*7번째 예제
		//substring(7, 11); 란?
		//7번째 위치부터 11번째가 되기 전까지 라는 뜻
		String subStr = str.substring(7, 11);
		System.out.println(subStr);
		
		String subStr2 = str.substring(7);
		//substring(7);
		//7번째 위치부터 끝까지 라는 뜻
		System.out.println(subStr2);
		*/
		
		/* 6번째 예제
		//indexOf 란?
		//해당하는 값이 몇번째에 있습니까? 하고 묻는 거
		System.out.println(str.indexOf("JAVA"));
		*/
		
		/*5번째 예제
		byte[] by = str.getBytes(); //문자열을 byte배열로 바꾸어 주겠다
		//for(int i=0; i<by.length; ++i) {
			//System.out.println(by[i]);
		//}
		String str2 = new String(by); //byte배열의 값을 문자열로 변환시켜준다
		*/
		
		/*4번째 예제
		//equalsIgnoreCase는 대소문자 상관없이 비교해라 라는 뜻
		if(str.equalsIgnoreCase("HELLO, JAVA!!")) { 
			System.out.println("aaa");
		}
		*/
		
		/*3번째 예제
		if(str.endsWith("!!")) {
			System.out.println("맞습니다.");
		}
		
		*/
		/*2번 예제
		//전체 문자를 하나씩 꺼내기 위해서 for문을 사용
		for(int i=0; i<str.length(); ++i) {//length() : 문자열의 길이를 반환
			System.out.println(str.charAt(i));
		}
		*/
		//charAt은 ? 
		//index에 해당하는 값을 char형으로 꺼내준다.
		//System.out.println(str.charAt(0));
		
		
		
		/*1번 예제
		String a = "aaa";
		String b = "aaa";
		String c = new String("aaa");
		String d = new String("aaa");
		
		//equals는 ? 
		//a가 가르키는 곳의 데이터와 b가 가르키는 곳의 데이터를 비교하여 true와 false를 알려준다.
		System.out.println(a.equals(b));
		*/
	}
}
