import java.util.*;

public class Exam_10 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      System.out.print("����� �̸��� : " );
      String name = in.next();
      
      if (name.equals("ȫ�浿")) { //���ڿ��� �񱳴� ==�� �ƴ϶� equals()��� �޼ҵ带 ����Ѵ�.
         System.out.println("����� ȫ�浿 �̱���!!");
      }else {
         System.out.println("����� ȫ�浿�� �ƴϱ���!!");
      }
   }
}