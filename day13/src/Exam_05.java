
public class Exam_05 {
	public static void main(String[]args) {
		String str = "Hello, avaj!!";
		//StringŬ������ ������ Ŭ����.. Ư������ �����ϰ� �߰��ϴ� ����� ����.
		//�̷� ������ �ذ��ϱ� ���� StringBuffer, StringBuilder Ŭ������ ���Դ�.
		//�� Ŭ������ ����� �Ȱ�����, 
		//StringBuffer�� ��Ƽ�����忡�� StringBuilder�� ���Ͻ����忡�� ���ȴ�.
		StringBuffer buffer = new StringBuffer(str);
		buffer.delete(10, 11);
		buffer.insert(7,"j");
		
		str = new String(buffer);
		System.out.println(str);
	}
}
