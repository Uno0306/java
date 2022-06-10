package step01.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ex03TimePackage {

	public static void main(String[] args) {
		// LocalDate 클래스 : 로컬 날짜
		LocalDate currentData = LocalDate.now();
		System.out.println(currentData);
		System.out.println(currentData.getYear());
		System.out.println(currentData.getMonth());
		System.out.println(currentData.getMonthValue());
		System.out.println(currentData.getDayOfWeek());
		System.out.println(currentData.getDayOfMonth());
		System.out.println(currentData.getDayOfYear());
		System.out.println(currentData.isLeapYear());
//				
		System.out.println();

		// LocalTime 클래스 : 로컬 시간
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);
		System.out.println(currentTime.getHour());
		System.out.println(currentTime.getMinute());
		System.out.println(currentTime.getSecond());
//				
//				System.out.println();

		// LocalDateTime 클래스 : 로컬 날짜 + 시간
		LocalDateTime localDataTime1 = LocalDateTime.now();
		System.out.println(localDataTime1);
		System.out.println(localDataTime1.plusYears(1));
		System.out.println(localDataTime1.minusDays(1));

		System.out.println();
		
		// with() : 사용자 정의 변경 - 년, 월, 일, 시, 분, 초
		LocalDateTime localDataTime2 = LocalDateTime.now();
		System.out.println(localDataTime2);

		// 초기화 후 변경
		LocalDateTime localDataTime3 = null;
		System.out.println(localDataTime3);

		localDataTime3 = localDataTime2.withYear(2024).withMonth(2).withDayOfMonth(22).withHour(14).withMinute(22);
		System.out.println(localDataTime3);

		// ZonedDateTime 클래스 : 특정 zone의 날짜, 시간
		ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println(seoulDateTime);
	}

}