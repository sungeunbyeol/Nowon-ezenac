import java.util.Scanner;

public class Exam_11 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      System.out.print("방의 갯수 : ");
      int roomSu = in.nextInt();
      
      boolean[] room = new boolean[roomSu];//true : 사용중, false : 빈방
      
      while(true) {
         System.out.print("1.입실 2.퇴실 3.보기 4.종료 : ");
         int select = in.nextInt();
         int selectNum;
         switch(select) {
         case 1 :   do {
                     System.out.print("입실하실 방의 번호 : ");
                     selectNum = in.nextInt();
                  }while(selectNum<1 || selectNum>roomSu);
                  if (room[selectNum-1]) {
                     //사람들은 1호실, 2호실... 컴퓨터는 0호실, 1호실...
                     System.out.println(selectNum+"호실은 사용중입니다.");
                  }else {
                     room[selectNum-1] = true;
                     System.out.println(selectNum+"호실에 입실하셨습니다.");
                  }
                  break;
         case 2 :   do {
                     System.out.print("퇴실하실 방의 번호 : ");
                     selectNum = in.nextInt();
                  }while(selectNum<1 || selectNum>roomSu);
                  if (room[selectNum-1]) {
                     room[selectNum-1] = false;
                     System.out.println(selectNum+"호실에서 퇴실하셨습니다.");
                  }else {
                     System.out.println(selectNum+"호실은 빈방입니다.");
                  }
                  break;
         case 3 :   for(int i=0; i<roomSu; ++i) {
                     if (room[i]) {
                        System.out.println(i+1+"호실 : 사용중");
                     }else {
                        System.out.println(i+1+"호실 : 빈방");
                     }
                  }
                  break;
         case 4 :   System.out.println("프로그램을 종료합니다.");
                  	System.exit(0);//프로그램을 종료하겠습니다.
         default :    System.out.println("잘못입력하셨습니다.");
         }
      }
   }
}