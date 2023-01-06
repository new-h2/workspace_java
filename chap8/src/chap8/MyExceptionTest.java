package chap8;
//cheacked 예외 - 컴파일러 예외처리 구문 

class MyException extends Exception{
	int error_code;
	public MyException(String message, int error_code) {
		super(message);
		this.error_code= error_code;
	}
	public int getError_code() {
		return error_code;
	}
	

}

class Subject{
	void search(String input) throws MyException {
		String []  names = {"spring", "jsp", "servlet", "java"};
		//input변수가 names 1개 일치하면 "수강신청되셨습니다."
		//input변수가 names 1개 일치하지않으면 MyException 의도적 발생

		boolean isSearch = false;
		
		for(int i =0 ; i < names.length; i++) {
			if(names[i].equals(input)) {
				isSearch = true;
				break;
			}
			
		}
	
		if(isSearch == false) {
			throw new MyException(input + "과정 개설전이다.", 404);
		}
		System.out.println("수강신청되셨습니다.");
	}
}
public class MyExceptionTest {

	public static void main(String[] args) {
		try {
			new Subject().search("spring");
		} catch (MyException e) {
			System.out.println(
					e.getError_code() + ":"+ e.getMessage());
		}
		
	}

}
