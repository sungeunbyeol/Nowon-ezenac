class A04{
   public void aaa() {
      System.out.println("aaa�޼ҵ� ����!!");
   }
   public void bbb() {
      System.out.println("ddd�޼ҵ� ����!!");
   }
   public void ccc() {
      System.out.println("ccc�޼ҵ� ����!!");
   }
}
public class Exam_04 {
   public static void main(String[] args) {
      A04 ap = new A04() {
    	  public void bbb() {
    		  System.out.println("bbb�޼ҵ� ����!!!");
    	  }
      };
      ap.aaa();
      ap.bbb();
      ap.ccc();
   }
}