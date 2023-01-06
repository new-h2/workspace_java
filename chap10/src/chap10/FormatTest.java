package chap10;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FormatTest {

	public static void main(String[] args) {
		double d = 3.14 *10;
		//d =1234.5678;
		//d = -12.5678;
		d = 1234567.89;
		System.out.println(d); //31.400000000000002
		
		// # - 1자리 10진수
		//DecimalFormat df = new DecimalFormat("##.#"); // 정수.소수점 첫째자리리까지만 
//		DecimalFormat df = new DecimalFormat("##.##"); // 31.4
//		DecimalFormat df = new DecimalFormat("##.00"); //  둘째자리까지만 31.40	
//		DecimalFormat df = new DecimalFormat("000.00"); //  031.40
		
//		DecimalFormat df = new DecimalFormat("0##.#0"); //  IllegalArgumentException오류
//		DecimalFormat df = new DecimalFormat("000.00"); 
//		DecimalFormat df = new DecimalFormat("000.00+;000.00-"); //-12.5678 // 012.57-
//		DecimalFormat df = new DecimalFormat("###.00+;000.00-"); 
		DecimalFormat df = new DecimalFormat("###,###.00");  //1234567.89 //1,234,567.89
		
		//1234.5678 
		//1234.57 정수 반올림해서 보여준다...
		String dStr = df.format(d);
		System.out.println(dStr);
		
		
		/* y -연도 M-월  d-일(월) D(연도) H-24시간 m-분 s-초 E-요일*/
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd / DDD / HH-mm-ss E");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년도 MM월 dd일 DDD(1년중 몇번째일) HH시 mm분 ss초 E요일");
		Calendar date = Calendar.getInstance();
		String dateStr  = sdf.format(date.getTime()); // 캘린더로 시간으로바꿔주기
		
		System.out.println(sdf); //java.text.SimpleDateFormat@39680363
		System.out.println(dateStr);  //2022/12/16 / 350(365일중) / 14-37-24 금
		
		
		// 데이터입력 - 2023 1 2 3 4 5
		// 2023년 1월 2일 3시 4분 5초 Calendar 생성
		// 1년중 몇주(w)째인지 출력
		// 해당월 의 몇주(W)째인지 출력
		// 요일(E) 출력
		
		if(args.length < 6) {
			return;
		}
		
		int[] argsInt = new int[args.length];
		for(int i = 0; i<args.length; i++) {
			argsInt[i]= Integer.parseInt(args[i]);
		}
		
		Calendar date2 = Calendar.getInstance();
		date2.set(argsInt[0],argsInt[1]-1,argsInt[2],argsInt[3],argsInt[4],argsInt[5]);
		//SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년도 MM월 dd일 HH시 mm분 ss초");
		//System.out.println(sdf2);

		SimpleDateFormat sdf2 = new SimpleDateFormat
				("yyyy년도의 w번째 주이고 MM월의 W번째 주, E요일입니다.");
		System.out.println(sdf2.format(date.getTime()));
		//2022년도의 51번째 주이고 12월의 3번째 주, 금요일입니다.
		
		
		
	}
}
