
public class Exam_03 {
	public static void main(String[]args) {
		int[][] arr = new int[5][5];
		int co = 1;
		
		int i = 0, j=2; 	//1�� ����
		
		while(true) {
			arr[i][j] = co;
			int oldI = i, oldJ = j;
			--i; ++j;		//2�� ����
			if(i<0) i=4;	 	//3�� ����
			if(j>4) j=0; 		//4�� ����
			if(arr[i][j] != 0 ) {	//5�� ����
				i = oldI; 
				j = oldJ;
				++i;
			}
			++co;
			if(co>25) break;	
		}
		for(i=0; i<5; ++i) {
			for(j=0; i<5; ++j) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}
