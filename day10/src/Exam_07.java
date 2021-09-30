class A07{
   int a;   int b;
   A07(){
      a = 10;      b = 20;
   }
}
class B07 extends A07{
   int c;
   B07(){      c = 30;   }
   public void disp() {
      System.out.println("a = " + a);
      System.out.println("b = " + b);
      System.out.println("c = " + c);
   }
}
public class Exam_07 {
   public static void main(String[] args) {
      B07 ap = new B07();
      ap.disp();
   }
}