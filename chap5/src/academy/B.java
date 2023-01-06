package academy; //B클래스 저장 폴더 설정(첫문장!!!!!)

//import sba.*; 패키지안에 있는 모든 클래스
import sba.A; // A클래스 패키지명 알려줌
import java.util.Date;
import java.util.HashSet;
/*
 * 1.B클래스 같은 패키지에 속한 클래스 자동 import 
 * 2.java.lang. 패키지에 속한 클래스 자동 import
 * */

public class B {

	public static void main(String[] args) {
		//A a1 =  new sba.A();
		//다른패키지명이면 앞에 붙여야한다.
		A a1 = new A();
		Date now = new Date(); //라이브러리 제공클래스
		HashSet set = new HashSet<>();
	}
}
