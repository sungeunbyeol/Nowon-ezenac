import java.net.InetAddress;
import java.net.UnknownHostException;

public class Exam_03 { //InetAddress 사용법
	public static void main(String[]args) {
		InetAddress[] ia = null; //아이피 주소를 관리하는 클래스
		try {
			ia = InetAddress.getAllByName("www.naver.com");
			for(int i = 0; i<ia.length; ++i) {
				System.out.println("호스트이름 : " + ia[i].getHostName());
				System.out.println("호스트주소 : " + ia[i].getHostAddress());
			}
		}catch(UnknownHostException e) {
			System.out.println("찾으시는 주소가 없습니다.");
		}
	}
}
