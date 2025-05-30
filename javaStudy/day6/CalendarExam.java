package javaStudy.day6;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class CalendarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.UK);
		Locale locale = Locale.getDefault();
		
		
		System.out.println(locale);
		
		for(Locale locale2 : locale.getAvailableLocales()) {
			System.out.println(locale2);
		}
		//en_GB
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		Calendar gb = Calendar.getInstance(locale);
		System.out.println(gb);
		
//		TimeZone zone = null;
		TimeZone zone =TimeZone.getTimeZone("Europe/London");
//		for (String z : TimeZone.getAvailableIDs()) {
//			System.out.println(z);
//		}
		Calendar uk = Calendar.getInstance();
		uk.setTimeZone(zone);
		
		Calendar gb1 = Calendar.getInstance();
		gb1.setTimeZone(zone);
		
		System.out.println(gb1);
		
		int y =now.get(Calendar.YEAR);
		int m =now.get(Calendar.MONTH);
		int date = now.get(Calendar.DATE);
		int apm = now.get(Calendar.AM_PM);
		int h =now.get(Calendar.HOUR);
		int min = now.get(Calendar.MINUTE);
		
		System.out.println("" + y + m + date +(apm == 0? "오전" : "오후") + h + min);
		
		Calendar xmas = Calendar.getInstance();
		xmas.set(Calendar.MONTH, 11);
		xmas.set(Calendar.DATE, 25);
		System.out.println(xmas);
		
		int remain = xmas.get(Calendar.DAY_OF_YEAR)- now.get(Calendar.DAY_OF_YEAR);
		
		System.out.println(remain);
		
		//현재를 millis 로 리턴 받아서 변수에 담아보세요
		
		long nowMillis = now.getTimeInMillis();
		
		//위 값을 기준으로 DATE 객체를 생성합니다.
		Date nowDate = new Date(nowMillis);
		
		//now 에서 Date.객체를 리턴하는 메서드를 찾아보세요.
		
		
		//날짜의 값을 특정 포맷으로 변경해주는 클래스 simpleDateFormat 을 API 로 찾아보세요.
		//java.text
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy 년 MM 월 dd 일 a h: mm분 입니다.");
		String r = sdf.format(nowDate);
		
		System.out.println(r);
		
		//LocalDatetime 객체 얻어내기
		LocalDateTime ldtNow = LocalDateTime.now();
		
		System.out.println(ldtNow);
//		sdf = new SimpleDateFormat("yy:MM.dd. HH:mm.");
		
		LocalDate date1 = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy 년 MM 월 dd 일 a HH.mm");
//		String text = date1.format(formatter);
//		LocalDate parsedDate = LocalDate.parse(text, formatter);
		
		System.out.println(ldtNow.format(formatter));
		
	}

}
