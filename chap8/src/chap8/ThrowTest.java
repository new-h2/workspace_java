package chap8;

class Test2{
	void m1(int i) throws NumberFormatException{
		// i소수인지 판단
		// 소수 - 1과 자신의 수로만 나누어지는(나머지 0) 자연수
		// 1(자신수) 나머지 0일 경우 2개 = 소수
		
		if(i <= 0 ) {
			throw new NumberFormatException("자연수만가능합니다(음수불가능)"); 
			// 예외발생하면 중단 되기때문에 
			// 나머지 코드진행x
			// 내가 원하는거 numberformatException 만들어라
		}
		
		int count = 0;
		for(int index = 1 ; index <= i; index++) {
			if(i % index == 0) count++;
//			if(i % index == 0) { // i ,1  
//				count++;
//			}
		}// for end
		if(count == 2) {
			System.err.println(i + "소수 이다.");
		}else {
			System.out.println(i + "소수가 아니다.");
		}
		
	}
}
public class ThrowTest {

	public static void main(String[] args) {
		Test2 t2 = new Test2();
		try {
			//t2.m1(13); // 예외발생하면 try중단, catch로 이동
			//t2.m1(77); // 1
			t2.m1(-13);
		}catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		 t2.m1(13);
	}

}
