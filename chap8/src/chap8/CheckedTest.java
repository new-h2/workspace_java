package chap8;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedTest {

	public static void main(String[] args) {
		// sample.txt 입력용 사용 오픈 허락
		try {
			FileReader fr = new FileReader("sample.txt");
		}catch(FileNotFoundException e){
//			e.printStackTrace(); 자세히 나옴, 위치 ~
			System.out.println(e.getMessage()); 
			//sample.txt (지정된 파일을 찾을 수 없습니다)

		}
		//1. 존재여부 체크..
		
		
		//FileNotFoundException발생-컴파일러 경고 예외 
		//반드시 try-catch 해야해 => checkedException
		//FileNotFoundException extends Exception
		//RuntimeException extends Exception
		
		
		//ArithmeticException발생 -컴파일러 경고안한다. -실행 => uncheackedException
		//ArithmeticException extends RuntimeException
		System.out.println(10/0); 
	
	
	}

}
