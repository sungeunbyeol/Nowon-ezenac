import java.util.*;

public class Exam_02 {
	public static void main(String[]args) {
		ArrayList list = new ArrayList();
		//10���� �����͸� ������ ����
		
		list.add("���缮");
		list.add("����");
		list.add("������");
		list.add("������");
		list.add("����ȿ");
		
		list.add(2, "�缼��");
		for(int i=0; i<list.size(); ++i) {
			Object obj = list.get(i);
			String name = (String)obj;
			System.out.println(name);
		}
	}
}
