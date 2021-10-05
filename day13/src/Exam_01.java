import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Exam_01 {
	public static void main(String[]args) {
		ArrayList<String> list = new ArrayList<String>();
		String[] sports = new String[]
			//{"���缮", "����", "������", "����ȿ", "���ҹ�", "������", "�缼��"};
			{"Soccer", "Baseball", "Tennis", "Football",
			"Basketball", "Ski", "Hochey", "Aerobics"};

		for(int i=0; i<sports.length; ++i) {
			list.add(sports[i]);
		}
		
		//�ٸ� �������� �����ϰڴ� ��� �Ҷ� comparator�� ���
		Comparator<String> len = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		};
		
		//Collections.sort(list); //ArrayList�� �ִ� �����͸� sort�ϴ� ��
		Collections.sort(list,len);
		for(String name : list) {
			System.out.println(name);
		}
		/*
		Arrays.sort(name); //�迭�� �����ϰڽ��ϴ�. �ϴ� ��(��������)
		
		for(int i=0; i<name.length; ++i) {
			System.out.println(name[i]);
		}
		*/
		
	}
}
