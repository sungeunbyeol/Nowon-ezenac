import java.util.Scanner;

public class Exam_10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("인원수를 입력 : ");
		int inwon = in.nextInt();
		
		String[] name = new String[inwon];
		int[] kor = new int[inwon];
		int[] eng = new int[inwon];
		int[] sum = new int[inwon];
		int[] rank = new int[inwon];
		
		for(int i=0; i<inwon; ++i) {
			System.out.print(i+1+"번째 학생의 이름은 ? ");
			name[i] = in.next();
			System.out.print(i+1+"번째 학생의 국어점수는 ? ");
			kor[i] = in.nextInt();
			System.out.print(i+1+"번째 학생의 영어점수는 ? ");
			eng[i] = in.nextInt();
			sum[i] += kor[i] + eng[i];
		}
		
		//순위 구하는 프로그램
		for(int i=0; i<inwon; ++i) { //i는 나
			rank[i] = 1;
			for(int j=0; j<inwon; ++j) { //j는 우리반 친구
				if(sum[i] < sum[j]) { // 내 총점이 우리반학생 총점보다 작으면
					++rank[i]; // 내 순위를 하나 올린다.
				}
			}
		}
		
		for(int i = 0; i<inwon; ++i) {
			System.out.println(name[i]+"의 점수의 합은 " + sum[i] + "이고" + rank[i] + "등 입니다.");
		}
		
	}
}
