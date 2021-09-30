class A04{
   public void aaa() {
      System.out.println("aaa메소드 실행!!");
   }
   public void bbb() {
      System.out.println("ddd메소드 실행!!");
   }
   public void ccc() {
      System.out.println("ccc메소드 실행!!");
   }
}
public class Exam_04 {
   public static void main(String[] args) {
      A04 ap = new A04() {
    	  public void bbb() {
    		  System.out.println("bbb메소드 실행!!!");
    	  }
      };
      ap.aaa();
      ap.bbb();
      ap.ccc();
   }
}