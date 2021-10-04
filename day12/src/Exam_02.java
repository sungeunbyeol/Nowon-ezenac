import java.util.*;

public class Exam_02 {
	public static void main(String[]args) {
		ArrayList list = new ArrayList();
		//10개의 데이터를 저장할 공간
		
		list.add("유재석");
		list.add("하하");
		list.add("지석진");
		list.add("김종국");
		list.add("송지효");
		
		list.add(2, "양세찬");
		for(int i=0; i<list.size(); ++i) {
			Object obj = list.get(i);
			String name = (String)obj;
			System.out.println(name);
		}
	}
}
