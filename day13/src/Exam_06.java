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
		
		//�̴��� ������ ���� ���Ѵ�
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(lastDay);
		
		/*
		Date date = new Date(); //��¥�� ��½�ų�� ����ϴ� Ŭ����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		//y : �⵵, yy 2�ڸ�, yyyy 4�ڸ��� ��Ÿ����
		//M : ��, d : ��, H : �ð�(0~23��) �ҹ��ڷ� ���� �������ķ� �����..
		//m : ��, s : ��, S : �и�������, a : �������ĸ�ũ
		System.out.println(sdf.format(date));
		*/
	}
}
