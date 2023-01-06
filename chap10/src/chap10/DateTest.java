package chap10;

import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date now = new Date(); 
		System.out.println(now/*toString*/); //Fri Dec 16 11:23:00 KST 2022
		System.out.println(now.getYear()); //deprecated메소드 -
		//  소스구현상문제 다른 메소드 충돌 여러가지 이유로 사용자제권고
		// 122(4자리로 안나옴.. 1900년도기준으로 122년흐름) - 2022년 출력 x
		

	}

}
