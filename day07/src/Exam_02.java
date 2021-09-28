
public class Exam_02 {
	public static void main(String[]args) {
		int[][] arr = new int[5][5];
		int co =0;
		
		
		for(int i=0; i<5; ++i) {
			if(i%2==0) {
				for(int j=0; j<5; ++j) {
					++co;
					arr[i][j] = co;
				}
			}else {
				for(int j=4; j>=0; --j) {
					arr[i][j] = ++co;
				}
			}
		}

		for(int i=0; i<5; ++i) {
			for(int j=0; j<5; ++j) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}

