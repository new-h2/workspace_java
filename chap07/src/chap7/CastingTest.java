package chap7;

class Parent{
	int su =10;
	void print( ) {
		System.out.println(su); //10
	}
	void mp() {
		System.out.println("Parent 클래스"); // non- overriding메소드
	}
}

class Child1 extends Parent{ 
	//int su =10;
	int su =20;
	void print( ) {
		System.out.println(su); //20 오버라이딩한 메소드
		System.out.println("super="+super.su); //10
	}
	
	void mc() {
		System.out.println("child1클래스"); //자식추가 
	}
}

class Child2 extends Parent{
	int su =30;
	void print() {
		System.out.println(super.su +su);
	}
	void mc2() {
		System.out.println("child2");  
	}
}



public class CastingTest {

	public static void main(String[] args) {
		Parent p1 = new Parent(); // 형변환x
		System.out.println(p1.su);
		p1.print();
		p1.mp();
		//p1.mc(); 메모리에도 없음
		
		Child1 c1 = new Child1(); // 형변환x
		System.out.println(c1.su);
		c1.print();
		c1.mp();
		c1.mc();
		
		Parent p2 = new Child1(); // 형변환o
		System.out.println("p2 ="+ p2.su); // 10 
		p2.print(); //20  오버라이딩한 자식print
		p2.mp();
		//p2.mc();  메모리에는 있음 
		//mc - 원래 자식 클래스 포함 메소드
		//Child1 c2 = (Child1)p2 //명시적 형변환발생
		//c2.mc();
		//((Child2)p2).mc2(); casting 오류
		if(p2 instanceof Child1) {//형변환이 가능한지 체크 
			((Child1)p2).mc();
			System.out.println("((Child1)p2).mc()가능");
		}else {
			System.out.println("p2는 Child타입 형변환 불가");
		}
		
		
		Parent p3 = new Child2(); // 자동형변환발생
		System.out.println(p3.su); //사용변수 -Parent
		p3.print(); // 오버라이딩 메소드 Child2
		//((Child1)p3).mc(); casting 오류 
		
		if(p3 instanceof Child2) {
			((Child2)p3).mc2();
			System.out.println("((Child2)p3).mc2()가능");
		}else {
			System.out.println("p3 Child2 타입 형변환불가");
		}
		
		//instanceof typeof
		// if(변수명instanceof클래스명) true/false
		 
	}

}
