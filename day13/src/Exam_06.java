import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exam_06 {
	public static void main(String[]args) {
		Calendar cal = Calendar.getInstance();
		//System.out.println(cal);
		
		//cal.set(Calendar.YEAR, 2020);
		//cal.set(Calendar.MONTH, 1);
		cal.set(2020, 1,20);
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		System.out.println("year = " + year);
		System.out.println("month = " + month);
		System.out.println("day = " + day);
		
		//이달의 마지막 날을 구한다
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(lastDay);
		
		/*
		Date date = new Date(); //날짜를 출력시킬때 사용하는 클래스
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		//y : 년도, yy 2자리, yyyy 4자리로 나타낸다
		//M : 월, d : 일, H : 시간(0~23시) 소문자로 쓰면 오전오후로 나누어서..
		//m : 분, s : 초, S : 밀리세컨드, a : 오전오후마크
		System.out.println(sdf.format(date));
		*/
	}
}
