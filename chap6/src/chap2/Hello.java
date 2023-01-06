package chap2;

// 소스 파일(수동 ) - 컴파일(자동) - 실행(수동)-main 내부 문장 실행
// java application program
public class Hello {

	public static void main(String[] args) {
		System.out.println("hello 자바"); //line 줄바꿈
		System.out.print("두번째줄입니다.");  // 줄바꿈없이
		System.out.println("--두번째줄 뒤에 붙입니다.");
	
		System.out.println("두번째 줄입니다 "+ "-- 두번째줄뒤에 붙입니다");
		System.out.println("두번째 줄입니다 "+ 100+200);
		// + 연산자 출력 "자주"사용
		// + 연산자 기능 두가지
		// 1. 문자열_ 문자열 또는 문자열 +다른타입 => 문자열결합
		// 2. 정수, 실수+정수 , 실수 => 덧셈
		// 3. 왼쪽부터 연산
		// 4.() 우선순위
		
		
		
		
	}
}
