import java.util.Scanner;

public class Exam_07 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		int[] arr = new int[10];
		int hol = 0;
		int zzak = 0;
		
		for(int i = 0; i<arr.length; ++i) {
			System.out.print(i+1+ "번째 숫자를 입력해주세요 : ");
			arr[i] = in.nextInt();
			if(arr[i]%2==0) {
				zzak += arr[i];
			} else {
				hol += arr[i];
			}
		}
		
		for(int i=0; i<arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		System.out.println( "홀수의 합은? " + hol + " 짝수의 합은? " + zzak);
		
	}
}
