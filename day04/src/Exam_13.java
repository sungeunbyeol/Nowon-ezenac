
public class Exam_13 {
	public static void main(String[]args) {
		for(int i=5; i>=1; i--) {
			//ฐ๘น้
			for(int k=1; k<=5-i; ++k) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; ++j) {
				System.out.print(j);
			} System.out.println();
		}
	}
}
