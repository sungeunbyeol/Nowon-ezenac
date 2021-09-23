import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class Exam_01 {
	public static void main(String[]args) throws IOException{
Scanner in = new Scanner(System.in);
		
		System.out.print("첫번째 수 : ");
		int num1 = in.nextInt();
		System.out.print("두번째 수 : ");
		int num2 = in.nextInt();
		System.out.print("사칙연산자 : ");
		char op = (char)System.in.read();
		
		switch(op) { //switch()에서 ()안에는 byte, char, short, int, String 자료형만 가능
		//case뒤에 비교대상값은 항상 상수이어야 한다. 상수는 변하지 않는 수이다.
		case '+' : System.out.printf("%d %c %d = %d", num1, op, num2, num1+num2);
		break;
		case '-' : System.out.printf("%d %c %d = %d", num1, op, num2, num1-num2);
		break;
		case '/' : System.out.printf("%d $c %d = %d", num1, op, num2, num1/num2);
		break;
		case '*' : System.out.printf("%d %c %d = %d", num1, op, num2, num1*num2);
		break;
		default : System.out.println("사친연산자만 계산이 가능합니다.");
		break;
		}
		
	}
}
