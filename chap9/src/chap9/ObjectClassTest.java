package chap9;

public class ObjectClassTest {
	public static void main(String[] args) {
		//Object o1 = new Object();
		//Object o2 = new Object();
		
		//리턴값  : getClass().getName() + '@' + Integer.toHexString(hashCode())
		//패키지명.클래스명@16진수(해쉬코드- heap주소를 16진수로)
		// a변수값 + b변수값 출력
		//System.out.println(o1.toString()); //java.lang.Object@8646db9
		//System.out.println(o1);/*toString생략되어있음   o1.toString()와 o1결과 같음 */
		//System.out.println(o2.toString()); //java.lang.Object@37374a5e
		//System.out.println(o2);
 		
		//System.out.println(o1 == o2); // false
		//System.out.println(o1.equals(o2)); //false

		MyObject o3 = new MyObject("myobject");
		MyObject o4 = new MyObject("myobject");

		System.out.println(o3); //chap9.MyObject@42eca56e  
		//toString 오버라이딩하면 주소값x 매개변수 message전달받음
		System.out.println(o4); //chap9.MyObject@52f759d
		
		System.out.println(o3 == o4); // false 연산자 오버라이딩 불가
		System.out.println(o3.equals(o4)); //false 
		//매개변수 받은거 출력
		
		String s3 = new String("myobject");
		System.out.println(o3.equals(s3)); //false
		
	}
}

 class MyObject { /*extends Object*/
	String message;
		
	MyObject(String message){
			this.message = message;
		}

	//toString 오버라이딩
	@Override
	public String toString() {
		return message;
		
	}

	//(o3.equals(o4)) 
	// o4.message
	//equals 오버라이딩
	@Override
	public boolean equals(Object obj) {
		// String equals = 두 문자열의 비교
		// 비교전달 객체는 objMyobject타입이어야 하고 
		// message변수값 같은지 비교 =>true
		//boolean result = message.equals(((MyObject)obj).message); // true
		//return result;
		
		if(obj instanceof MyObject){	 //타입확인
			boolean result = message.equals(((MyObject)obj).message);  
			return message.equals(((MyObject)obj).message);  
		}else {
			return false; //myobject 타입이 아닐때 
		}
	}
	
	
	
	
	
}