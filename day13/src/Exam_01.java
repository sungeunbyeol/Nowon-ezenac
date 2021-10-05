import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Exam_01 {
	public static void main(String[]args) {
		ArrayList<String> list = new ArrayList<String>();
		String[] sports = new String[]
			//{"유재석", "하하", "김종국", "송지효", "전소민", "지석진", "양세찬"};
			{"Soccer", "Baseball", "Tennis", "Football",
			"Basketball", "Ski", "Hochey", "Aerobics"};

		for(int i=0; i<sports.length; ++i) {
			list.add(sports[i]);
		}
		
		//다른 기준으로 정렬하겠다 라고 할때 comparator를 사용
		Comparator<String> len = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		};
		
		//Collections.sort(list); //ArrayList에 있는 데이터를 sort하는 것
		Collections.sort(list,len);
		for(String name : list) {
			System.out.println(name);
		}
		/*
		Arrays.sort(name); //배열을 정렬하겠습니다. 하는 뜻(오름차순)
		
		for(int i=0; i<name.length; ++i) {
			System.out.println(name[i]);
		}
		*/
		
	}
}
