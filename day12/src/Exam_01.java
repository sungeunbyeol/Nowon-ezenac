import java.util.*;

public class Exam_01 {
	public static void main(String[]args) {
		Hashtable map = new Hashtable();
		
		//key는 중복허용 불가. 만약 중복되면 수정이 된다.
		map.put("유재석", "런닝맨");
		map.put("김족국", "런닝맨");
		map.put("강호동", "1박2일");
		map.put("김선호", "1박2일");
		
		Set set = map.keySet();
		//System.out.println(set);
		String[] name = new String[set.size()];
		set.toArray(name);
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			String key = (String)obj;
			System.out.printf("%s 님이 나오는 프로 : %s\n", key,map.get(key));
		}
		
		 for(int i=0; i<name.length; ++i){
			 System.out.printf("%s 님이 나오는 프로 : %s\n", name[i], map.get(name[i]));
		 }
		 
		 map.remove("김선호");
		 //map.clear();
		 System.out.println("map의 크기 : " + map.size());
		
		 Enumeration enu = map.keys();
		 while(enu.hasMoreElements()) {//set의 hasNext()와 동일
			 Object obj = enu.nextElement(); //set의 next()와 동일
			 String key = (String)obj;
			 System.out.printf("%s 님이 나오는 프로 : %s\n", key, map.get(key));
		 }
		 System.out.println("유재석이 나오는 프로 : " + map.get("유재석"));
	}
}
