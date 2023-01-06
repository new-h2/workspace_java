package chap2;

public class VariableTest {

	public static void main(String[] args) {
		// 점수
		// 정수 0~100사이 
		// byte short 둘다가능
		final int score = 99; // 128 이 넘기에 100 기본값
		//score =score +100;
		//final = 상수
		
		int score2 =95 , score3 =60 ;
		System.out.println(score);

		//평균 -정수 타입 데이터 연산 결과정수
		int avg = (score + score2 + score3) / 3;
		
		//실수평균
		double avgDouble = (score + score2 + score3) / 3.0;
		System.out.println("정수 평균 : "+avg);
		System.out.println("실수 평균 : "+avgDouble);
		
		System.out.println(Math.round(avgDouble));//반올림

		int radius = 5; //반지름
		final double pi = 3.14;
		
		double area = radius * radius * pi;
		radius = 10 ;
		//pi = pi + 1 ;  //4.14 ...
		
		System.out.println(10); //자바 int -3 byte
		System.out.println(10000000000L); //자바 int -3 byte 어느순간 정수타입을 지나가니까 L추가해주면 자동 Long 타입변경
		
		System.out.println(true); // 자바 boolean타입 literal
		System.out.println('a'); // 자바 char타입
		
		char c1 ='a'; // 단일따옴표 char
		String s1 ="java 프로그램";
		String s2 ="a";  //이중 따옴표 String
		
		int a1 = 10;
		int b1 = 20;
		
		System.out.println("a1의 값 =" + a1 +", b1의 값 ="+ b1);
		//a1의 값20 , b1의 값10 으로 바꾸기?
		
		int c = b1;
		b1 = a1;
		a1 = c;
		System.out.println("바꾼 a1의 값 =" + a1 +", 바꾼 b1의 값 ="+ b1);
		
		
		System.out.printf("%d를 표현합니다 \n",10);
		System.out.printf("%f를 표현합니다 \n",10.99);
		System.out.printf("%s를 표현합니다 \n","홍길동"); //문자열
		System.out.printf("%c를 표현합니다 \n",'웅');	
		
		
		String loc = "새싹 용산캠퍼스";
		String title="클라우드기반 웹서버 과정";
		int week = 3;
		System.out.printf("우리는 %s 에서 %s을 수강합니다.\n현재 %d주째 시작합니다\n",loc ,title ,week);
//		우리는 새싹 용산캠퍼스에서 클라우드기반 웹서버 과정을 수강합니다.
//		현재 3주째 시작합니다
		
		byte b =127;  // byte 127 최대값
//		b = 127+1; 컴파일오류
//		b = (byte) (127 + 1); 가능
//		b = 126+1; 	가능
		int ii = b+1;
//		byte+int =>int
		byte b2 = (byte) (b+2);
		System.out.println("int 데이터 " + ii + "\n byte 데이터 " +b2);
		// 타입의 오버 플로우 (컴파일오류는 없지만 128변형) 

	
	}
}
