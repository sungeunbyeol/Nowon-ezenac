import java.util.*;

public class Exam_09 {
	public static void main(String[] args) {
		String str = "ȫ�浿@100@���缮@80@��ȣ��@70@�̼���@50@�̰��@100@������@80";
		Scanner in = new Scanner(str).useDelimiter("\\s*@\\s*");
		//@�� �߽����� ���� �����µ� �տ� ���鿡 0���̻� �ڿ� ���� 0�� �̻� ���� �����ڶ�� ��
		while(true) {
			try {
				String name = in.next();
				int res = in.nextInt();
				System.out.println(name+"���� ���� : " + res);
			}catch(NoSuchElementException e) {
				System.out.println("������ ó�� ��!!");
				break;
			}
		}
		/*
		StringTokenizer st = new StringTokenizer(str, "@");
		//����Ŭ���� : �������� ����� �Ǿ�����, ����� �����ϴ� Ŭ����
		              ���� �ڵ带 �̿��� ���α׷� ���߽� ��ȯ���̳� ��Ÿ���..
		              �� Ŭ������ ����� �ؾ� �Ҷ��� ���  
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		/*
		String[] name = str.split("@");//""���� ���� �������� ������ ������
		
		for(int i=0; i<name.length; ++i) {
			System.out.println(name[i]);
		}
		*/
	}
}
