import java.util.*;

public class Exam_01 {
	public static void main(String[]args) {
		Hashtable map = new Hashtable();
		
		//key�� �ߺ���� �Ұ�. ���� �ߺ��Ǹ� ������ �ȴ�.
		map.put("���缮", "���׸�");
		map.put("������", "���׸�");
		map.put("��ȣ��", "1��2��");
		map.put("�輱ȣ", "1��2��");
		
		Set set = map.keySet();
		//System.out.println(set);
		String[] name = new String[set.size()];
		set.toArray(name);
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			String key = (String)obj;
			System.out.printf("%s ���� ������ ���� : %s\n", key,map.get(key));
		}
		
		 for(int i=0; i<name.length; ++i){
			 System.out.printf("%s ���� ������ ���� : %s\n", name[i], map.get(name[i]));
		 }
		 
		 map.remove("�輱ȣ");
		 //map.clear();
		 System.out.println("map�� ũ�� : " + map.size());
		
		 Enumeration enu = map.keys();
		 while(enu.hasMoreElements()) {//set�� hasNext()�� ����
			 Object obj = enu.nextElement(); //set�� next()�� ����
			 String key = (String)obj;
			 System.out.printf("%s ���� ������ ���� : %s\n", key, map.get(key));
		 }
		 System.out.println("���缮�� ������ ���� : " + map.get("���缮"));
	}
}
