package chap3;

public class OperatorTest {

	public static void main(String[] args) {
		//산술연산자 + - * / % , ++, --
		
		int avgInt =10 / 3;
		//double avgDouble = 10.0 /3;
		double avgDouble = 10/  (double)3;
		
		System.out.println(avgInt);
		System.out.println(avgDouble);
		
		
		int a = 10;
		int b = 20;
		a += b; //a = a + b    += -= *= 가능
		
		
		/* 연산의 우선순위
		 * 1. 가로  ()
		 * 2. 곱셉 나눗셈 
		 * 3. 더하기 빼기
		 * 4. = 제일마지막 
		 */		
		
		/* 단항연산자(a++), 이항연산자(a+b)
		 * 형변환연산자 - (데이터타입) - 단항
		 * 산술연산자 ++ -- (단항)  +-* /% (이항) 
		 * 비교연산자 == != > >= < <=
		 * 논리연산자 &&  ||  !
		 * 대입연산자 == += -=
		 * 조건삼항연산자 (?:)
		 * 조건식(t/f)? true 연산결과 : false 연산결과
		 * 자바언어 = typeof 연산자 없음
		 * 데이터타입변환 연산자 있음 
		 * 
		 * 연산자 순위 (1)가로 : 단항 : 이항(산술>비교>논리) : 삼항 :  = 
		 * (char)i 형변환
		 * (char)++i i의값 먼저 증가후 형변환
		 * (char)i++ 형변환먼저 i의값 증가
		 *  */
		
		
	}

}
