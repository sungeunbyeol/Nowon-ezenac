import java.util.*;

public class Exam_04 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.print("���ڿ��� �Է� : ");
		String str = in.next();
		
		int[]alpha = new int[26];
		//A, a�� ������ alpha[0]�� 1���� ����
		
		int co = 0;
		
		for(int i=0; i<str.length(); ++i) {
			char a = str.charAt(i);
			if(a>='A' && a<='Z') {
				++alpha[a-65];
			}else if(a>='a' && a<='z') {
				++alpha[a-97];
			}
		}
		
		for(int i=0; i<alpha.length; ++i) {
			if(alpha[i] != 0) {
				System.out.printf("%c - %d\n", (char)65+i, alpha[i]);
			}
		}
	}
	
}
