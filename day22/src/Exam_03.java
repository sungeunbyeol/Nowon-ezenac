import java.net.InetAddress;
import java.net.UnknownHostException;

public class Exam_03 { //InetAddress ����
	public static void main(String[]args) {
		InetAddress[] ia = null; //������ �ּҸ� �����ϴ� Ŭ����
		try {
			ia = InetAddress.getAllByName("www.naver.com");
			for(int i = 0; i<ia.length; ++i) {
				System.out.println("ȣ��Ʈ�̸� : " + ia[i].getHostName());
				System.out.println("ȣ��Ʈ�ּ� : " + ia[i].getHostAddress());
			}
		}catch(UnknownHostException e) {
			System.out.println("ã���ô� �ּҰ� �����ϴ�.");
		}
	}
}
