package chap9;

public class WrapperTest {
	public static void main(String[] args) {
		/*
		int i = 10;
		System.out.println(Integer.toBinaryString(i)); //2진수로 만들어줌 1010
		System.out.println(Integer.toOctalString(i)); //8진수로 만들어줌  
		System.out.println(Integer.toHexString(i)); //16진수로 만들어줌 		
		*/
		
		//타입고수
		Integer in = new Integer(10); // 10정수 ,메소드이용
		int i =10; //10정수 ,연산자이용
		
		//jdk 1.5추가 -auto boxing , auto unboxing 문법 
		int i2 = new Integer(10);
		Integer in2 =10;
		
		//jdk 1.9추가 Integer생성사 사용자제권고 
	}

}
