
public class Exam_01 {
	public static void main(String[]args) {
		int[][] arr = new int[5][5];
		
		int co = 0;
		for(int i=0; i<5; ++i) {
				for(int j=0; j<5; ++j) {
				++co;
				arr[i][j] = co;
			}
		}

		
		
		for(int i=0; i<5; ++i) {
			for(int j =0; j<5; ++j) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("\n\n");
		for(int i=0; i<5; ++i) {
			for(int j=4; j>=0; --j) {
				System.out.print(arr[j][i] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("\n\n");
		for(int i=4; i>=0; --i) {
			for(int j=4; j>=0; --j) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("\n\n");
		for(int i=4; i>=0; --i) {
			for(int j=0; j<5; ++j) {
				System.out.print(arr[j][i] + "\t");
			}
			System.out.println();
		}

	}
}
