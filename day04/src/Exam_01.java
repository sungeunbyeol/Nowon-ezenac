import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class Exam_01 {
	public static void main(String[]args) throws IOException{
Scanner in = new Scanner(System.in);
		
		System.out.print("ù��° �� : ");
		int num1 = in.nextInt();
		System.out.print("�ι�° �� : ");
		int num2 = in.nextInt();
		System.out.print("��Ģ������ : ");
		char op = (char)System.in.read();
		
		switch(op) { //switch()���� ()�ȿ��� byte, char, short, int, String �ڷ����� ����
		//case�ڿ� �񱳴���� �׻� ����̾�� �Ѵ�. ����� ������ �ʴ� ���̴�.
		case '+' : System.out.printf("%d %c %d = %d", num1, op, num2, num1+num2);
		break;
		case '-' : System.out.printf("%d %c %d = %d", num1, op, num2, num1-num2);
		break;
		case '/' : System.out.printf("%d $c %d = %d", num1, op, num2, num1/num2);
		break;
		case '*' : System.out.printf("%d %c %d = %d", num1, op, num2, num1*num2);
		break;
		default : System.out.println("��ģ�����ڸ� ����� �����մϴ�.");
		break;
		}
		
	}
}
