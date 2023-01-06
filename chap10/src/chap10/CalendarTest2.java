package chap10;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest2 {

	public static void main(String[] args) {
	
		Calendar cal = Calendar.getInstance(); //현재시간
		//cal.set(2022, 0, 11);  //년도,월,일  //0 =>1월   11 =>12월
		cal.set(Calendar.YEAR, 2024); //2024년 
		cal.add(Calendar.MONTH, 1); // +1 month 13월이 되는데 13이아니라 년도로 바로 올라감
		
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; // 11번째월
		int day = cal.get(Calendar.DAY_OF_MONTH); 
		int hour = cal.get(Calendar.HOUR_OF_DAY); 
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int date =cal.get(Calendar.DAY_OF_WEEK);//date요일
		// 1-일 2-월 3-화 4-수 5- 목, 6- 금, 7-토
		
		//String weekday =" ";
//		if(date == 1 ) {
//			weekday ="일";
//		}
		final String weekday[] = {"", "일", "월","화","수","목","금","토"};
		
		System.out.printf("현재 년도=%d , 월=%d, 일=%d, 시간=%d, 분=%d, 초=%d ,%s요일 \n ",
				year,month,day,hour,minute,second,weekday[date]);
		
		
	}

}
