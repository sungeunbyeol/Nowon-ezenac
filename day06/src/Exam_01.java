// ������ ���� �Է¹޾� �����ϱ�.
// select sort, bubble sort, insert sort ���� �ִµ�
// ���� ������ �˰����� ����� ���̰�,
// Arrays.sort(����); �� �������α׷��ӵ��� ���� ����� �� �ִ� ���̴�.
import java.util.*;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] arr = new int[10];
		for(int i=0; i<arr.length; ++i) {
			System.out.print(i+1+"��° �� : ");
			arr[i] = in.nextInt();
		}
		Arrays.sort(arr);
		/*
		//insert sort
		for(int i=1; i<arr.length; ++i) {
			int temp = arr[i];
			int j = i-1;
			while(j>=0) {
				if (temp < arr[j]) {
					arr[j+1] = arr[j];
					--j;
				}else {
					break;
				}
			}
			arr[j+1] = temp;
		}
		/*
		//bubble sort
		for(int i=arr.length-2; i>=0; --i) {
			for(int j=0; j<=i; ++j) {
				if (arr[j] > arr[j+1]) {
					int imsi = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = imsi;
				}
			}
		}
		/*
		//select sort
		for(int i=0; i<arr.length-1; ++i) {
			for(int j=i+1; j<arr.length; ++j) {
				if (arr[i] > arr[j]) {
					int imsi = arr[i];
					arr[i] = arr[j];
					arr[j] = imsi;
				}
			}
		}
		*/
		for(int i=0; i<arr.length; ++i) {
			System.out.print(arr[i]+"  ");
		}
	}
	
}
