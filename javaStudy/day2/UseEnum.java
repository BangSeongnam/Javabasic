package javaStudy.day2;

import java.util.Calendar;

/*
 * Enum 을 이용해서 오늘이 무슨용일인지 알아볼게요.
 * System(OS)로 부터 시간값을 가져오는 API 가 있는데 Calendar 라는 놈입니다.
 * 이 객체를 생성하면 위에 설명한대로 시간값을 가져와서 객체를 생성합니다.
 */
public class UseEnum {

	public static void main(String[] args) {
		// 열거 타입 변수 초기화.
		Week today = null;
//		DayOfWeek dow = null;
		
		//Calendar 객체를 생성해서 시스템의 시간정보 알아내보자
		Calendar now = Calendar.getInstance();
		
		
		//오늘의 요일을 get 해보자...
		int week = now.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		}
		
		if(today == Week.THURSDAY) {
			System.out.println("오늘 수업 끝");
		}
	}

}
