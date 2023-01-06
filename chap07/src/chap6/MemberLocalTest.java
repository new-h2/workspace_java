package chap6;


class A {
	
	int i; // 클래스 내부 변수 클래스(속성 = 프로퍼티)= member variable 
	// int i =10;
	
	public void test() {
		int j = 20; 
		// 메소드의 지역변수local variable
		for(int k = 0; k < 10; k++) {
			
		}
		System.out.println(i+j);
//		System.out.println(i+j+k); k도 불가
	}
	
	public void test2() {
		System.out.println(i);
	}
	
}


public class MemberLocalTest {
	//메인 클래스 있는건  파일명과 클래스명일치
	public static void main(String[] args) {
		A a1 = new A();
		a1.i =10;
		System.out.println(a1.i);// int 0 초기화값
		a1.test();
		//a1.j=200;불가불가
		
		
	}
}
