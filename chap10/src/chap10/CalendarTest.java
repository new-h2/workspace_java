package chap10;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

	public static void main(String[] args) {
//		Date now = new Date(); 
//		System.out.println(now/*toString*/); //Fri Dec 16 11:23:00 KST 2022
//		System.out.println(now.getYear()); //deprecated메소드 -
		//  소스구현상문제 다른 메소드 충돌 여러가지 이유로 사용자제권고
		// 122(4자리로 안나옴.. 1900년도기준으로 122년흐름) - 2022년 출력 x
	
		// Calender  -추상클래스
		// 구현 자식클래스 제공 -"한국"
		// static메소드 <- Calender객체 생성 리턴메소드
		// locale(os)설정 맞는 시간 날짜 생성 클래스 객체리턴
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		//java.util.GregorianCalendar
		//[time=1671158037100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,dstSavings=0,useDaylight=false,transitions=30,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,
		//YEAR=2022,MONTH=11,WEEK_OF_YEAR=51,WEEK_OF_MONTH=3,DAY_OF_MONTH=16,DAY_OF_YEAR=350,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=11,HOUR_OF_DAY=11,MINUTE=33,SECOND=57,MILLISECOND=100,ZONE_OFFSET=32400000,DST_OFFSET=0]
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; // 11번째월
		int day = cal.get(Calendar.DAY_OF_MONTH); //date요일
		int hour = cal.get(Calendar.HOUR_OF_DAY); 
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.printf("현재 년도 %d , 월=%d, 일=%d, 시간=%d, 분=%d, 초=%d \n ",year,month,day,hour,minute,second);
		
		
		
	}

}
