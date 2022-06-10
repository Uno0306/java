package step01.api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex02UtilPackage {

	public static void main(String[] args) {
		// Date 클래스
		Date date = new Date();
		System.out.println(date);

		// SimpleDateFormat() : 특정 문자열 포맷으로 변환
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy MM dd");
		System.out.println(simpleDateFormat.format(date));

		// "yyyy년 MM월 dd일"
		simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(simpleDateFormat.format(date));

		// "yyyy-MM-dd"
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(simpleDateFormat.format(date));

		// "yyyy:MM:dd HH:mm:ss"
		simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
		System.out.println(simpleDateFormat.format(date));

		// Calendar 클래스
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH) + 1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
	}

}