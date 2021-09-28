
public class Exam_05 {
	public static void main(String[]args) {
		int start = 0, end = 4, co = 0;
		int[][]arr = new int[5][5];
		while(true) {
			for(int i = start; i<=end; ++i) arr[start][i] = ++co;
			for(int i=start+1; i<=end; ++i) arr[i][end] = ++co;
			for(int i=end-1; i>=start; --i) arr[end][i] = ++co;
			for(int i=end-1; i>=start+1; --i) arr[i][start] = ++co;
			++start; --end;
			if(start>end) break;
		}
		for(int i=0; i<5; ++i) {
			for(int j=0; j<5; ++j) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
