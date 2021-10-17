import java.util.*;

public class Exam_09 {
	public static void main(String[] args) {
		String str = "홍길동@100@유재석@80@강호동@70@이수근@50@이경규@100@정형돈@80";
		Scanner in = new Scanner(str).useDelimiter("\\s*@\\s*");
		//@를 중심으로 글을 나누는데 앞에 공백에 0개이상 뒤에 공백 0개 이상 까지 구별자라는 뜻
		while(true) {
			try {
				String name = in.next();
				int res = in.nextInt();
				System.out.println(name+"님의 점수 : " + res);
			}catch(NoSuchElementException e) {
				System.out.println("데이터 처리 끝!!");
				break;
			}
		}
		/*
		StringTokenizer st = new StringTokenizer(str, "@");
		//유산클래스 : 예전에는 사용이 되었으나, 현재는 사용안하는 클래스
		              예전 코드를 이용한 프로그램 개발시 반환형이나 기타등등..
		              이 클래스가 사용을 해야 할때만 사용  
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		/*
		String[] name = str.split("@");//""안의 값을 기준으로 데이터 나누기
		
		for(int i=0; i<name.length; ++i) {
			System.out.println(name[i]);
		}
		*/
	}
}
