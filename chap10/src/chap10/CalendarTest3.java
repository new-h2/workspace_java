package chap10;

import java.util.Calendar;

import java.util.Date;

public class CalendarTest3 {

	public static void main(String[] args) {
		
		//Calendar객체를 Date로 변환
		
		Calendar cal = Calendar.getInstance();
		Date calDate =cal.getTime();
		System.out.println(calDate);
		System.out.println(calDate.getClass().getName()); //java.util.Date
		
		
		//Date를 Calendar로 변환
		Date da = new Date();
		cal.setTime(da);
		System.out.println(da);
		
	}
}
