
public class Exam_12 {
	public static void main(String[]args) {
		int a = 0;
		for(int i=1; i<=9; ++i) {
			if(i<=5) {
				++a;
			} else {
				--a;
			}
			for(int j=1; j<=a; ++j) {
				System.out.print(j);
			}System.out.println();
		} 
	}
}
