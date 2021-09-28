
public class Exam_16 {
	public static void main(String[]args) {
		int a=0;
		for(int i=1; i<=9; ++i) {
			if(i<=5) {
				++a;
			} else {
				--a;
			} 
			for(int k=1; k<=6-a; ++k) {
				System.out.print("*");
			} for(int j=1; j<=a+a-1; ++j) {
				System.out.print(" ");
			}//for(int k=1; k<=6-a; ++k) {
				System.out.print("*");
			//} 
			System.out.println();
		}
	}
}
