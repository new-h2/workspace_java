package chap7;

	interface I1{ //인터페이스도 내부클래스처럼사용가능
		void m1();
	}

	interface I2{
		void m2();
	}

public class AnonymousTest {

	public static void main(String[] args) {
		//Ano a = new Ano(); //객체생성
		//인터페이스는 객체생성 불가 a.new I1();

		
		//I1 인터페이스 상속 무명 클래스 정의 + 객체 생성 문장
		
		I1  i1 = new I1() { //무명클래스
			public void m1() {
				System.out.println("m1 호출");
			} // M1메소드
		}; // new1

		new I1() { //무명클래스
			public void m1() {
				System.out.println("m1 호출");
			} 
		}.m1(); 		
		
		i1.m1();
		
		
		
		
		
		I2 i2 = new I2() { //객체
			public void m2() {
				System.out.println("m2호출");
			}
		} ;// 문장끝;
		
		new I2() { //무명클래스 
			public void m2() {
				System.out.println("2");
			}
		}.m2();
		
		
		i2.m2();
	}

}
