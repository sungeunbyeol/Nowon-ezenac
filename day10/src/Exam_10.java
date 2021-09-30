import java.util.*;

public class Exam_10 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      System.out.print("당신의 이름은 : " );
      String name = in.next();
      
      if (name.equals("홍길동")) { //문자열의 비교는 ==가 아니라 equals()라는 메소드를 사용한다.
         System.out.println("당신은 홍길동 이군요!!");
      }else {
         System.out.println("당신은 홍길동이 아니군요!!");
      }
   }
}