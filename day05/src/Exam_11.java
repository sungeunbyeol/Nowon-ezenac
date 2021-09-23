import java.util.Scanner;

public class Exam_11 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      System.out.print("���� ���� : ");
      int roomSu = in.nextInt();
      
      boolean[] room = new boolean[roomSu];//true : �����, false : ���
      
      while(true) {
         System.out.print("1.�Խ� 2.��� 3.���� 4.���� : ");
         int select = in.nextInt();
         int selectNum;
         switch(select) {
         case 1 :   do {
                     System.out.print("�Խ��Ͻ� ���� ��ȣ : ");
                     selectNum = in.nextInt();
                  }while(selectNum<1 || selectNum>roomSu);
                  if (room[selectNum-1]) {
                     //������� 1ȣ��, 2ȣ��... ��ǻ�ʹ� 0ȣ��, 1ȣ��...
                     System.out.println(selectNum+"ȣ���� ������Դϴ�.");
                  }else {
                     room[selectNum-1] = true;
                     System.out.println(selectNum+"ȣ�ǿ� �Խ��ϼ̽��ϴ�.");
                  }
                  break;
         case 2 :   do {
                     System.out.print("����Ͻ� ���� ��ȣ : ");
                     selectNum = in.nextInt();
                  }while(selectNum<1 || selectNum>roomSu);
                  if (room[selectNum-1]) {
                     room[selectNum-1] = false;
                     System.out.println(selectNum+"ȣ�ǿ��� ����ϼ̽��ϴ�.");
                  }else {
                     System.out.println(selectNum+"ȣ���� ����Դϴ�.");
                  }
                  break;
         case 3 :   for(int i=0; i<roomSu; ++i) {
                     if (room[i]) {
                        System.out.println(i+1+"ȣ�� : �����");
                     }else {
                        System.out.println(i+1+"ȣ�� : ���");
                     }
                  }
                  break;
         case 4 :   System.out.println("���α׷��� �����մϴ�.");
                  	System.exit(0);//���α׷��� �����ϰڽ��ϴ�.
         default :    System.out.println("�߸��Է��ϼ̽��ϴ�.");
         }
      }
   }
}