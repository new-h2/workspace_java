package chap10;

import java.util.Calendar;
import java.util.Date;

public class DateCalendarCastingTest4 {

	public static void main(String[] args) {
	
		Calendar now = Calendar.getInstance(); //현재시간
		Calendar end = Calendar.getInstance(); //종료일
		end.set(2023,2,3); //2023년도 3월 3일
		
		// 두날짜사이 간격 구하기
		// 1/1000초 단위
		long nowmil = now.getTimeInMillis(); // epoch
		long endmil = end.getTimeInMillis();
		
		System.out.println(Math.abs(endmil - nowmil)+" (1/1000)초단위"); //무조건 양수
		System.out.println((Math.abs(endmil - nowmil))/1000 +" 초단위"); 
		System.out.println(((Math.abs(endmil - nowmil))/1000)/(60*60*24) +" 일단위"); 
		//월단위 계산 -숙제 
		
		long second = (Math.abs(endmil - nowmil))/1000;
		long day = second/(24*60*60);
		
		/*
		 * 초 ?/1000
		 * 1분 60초, 1시간 60분
		 * 1시간 - 60 * 60초
		 * 1일 -24시간 - 24*60*60초
		 * */

		//경매사이트
		//1개월 1일 2시간 11분 남았습니다. 활용가능
		
		System.out.println(day); 
	}
}
