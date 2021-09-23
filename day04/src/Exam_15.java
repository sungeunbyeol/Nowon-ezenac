
public class Exam_15 {
	public static void main(String[]args) {
		
		int a = 0;
		for(int i=1; i<=9; ++i) { //줄 찍는 코드
			if(i<=5) {
				++a;
			} else{
				--a;
			}
			for(int k=1; k<=5-a; ++k) { //공백주는 코드
				System.out.print(" ");
			}
			for(int j=1; j<=a+a-1; ++j) { // 별찍는 코드
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
