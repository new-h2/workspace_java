package chap8;

import java.io.FileNotFoundException;
import java.io.FileReader;

class Test {
	void m1(int i) throws FileNotFoundException { /* ArithmeticException */
		System.out.println(10 / i);
//		Arithmetic - 반드시 처리구문x
		FileReader fr = new FileReader("none.txt");
//		FileNotFoundException 반드시 처리
	}

	void m2() {
		try {
			m1(0);
		} catch (ArithmeticException e) {
			try {
				m1(10);
			} catch (FileNotFoundException e2) {
				System.out.println("파일명이나 경로명을 확인하세요."); // 내가 원하는대로 처리하겠다
			}
		} catch (FileNotFoundException e1) {
			System.out.println("파일명이나 경로명을 확인하세요.");
		}

	}//m2
	
	void m3() throws FileNotFoundException{
		m1(10);
	}
}

public class ThrowsTest { 
	public static void main(String[] args) throws FileNotFoundException { // 넘기겠다
		// 메인을 호출한 메소드로 전달 -> 자바 시스템 으로 전달- (기본 예외 처리기) 예외메세지만 출력(처리된게 x)
		// Arithmetic - Runtime 반드시 처리구문x
		Test t = new Test();
		t.m2();
		t.m3();
	}

}
