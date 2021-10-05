import java.util.Calendar;
import java.util.Scanner;

public class Exam_07 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.print("년도를 입력 : ");
		int year = in.nextInt();
		System.out.print("월을 입력 : ");
		int month = in.nextInt();
		
		Calendar cal = Calendar.getInstance();
		//달력 그릴 때 1일부터 정해놓고 그림. 그래서 세번째 자리에 1을 넣어주는 이유가 그 이유임
		cal.set(year, month-1, 1); //년,월,일을 세팅해주는거
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int i=1; i<week; ++i) {
			System.out.print("\t");
		}
		for(int i=1; i<=lastDay; ++i) {
			System.out.print(i+"\t");
			++week;
			if(week==8) { //week가 8이면
				System.out.println(""); //줄개행을 하겠다.
				week = 1; //첫번째 자리에서 숫자 계속 입력
			}
		}
	}
}
