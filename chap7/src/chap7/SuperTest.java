package chap7;

class A extends Object{ 
	int i;
//	A(){// 오버로딩 생성자추가}
	A(String s){ 
		//super(); 오브젝트 자동정의
		i= 10;
		System.out.println("A생성자 호출");
	}
}

class B extends A{
	int j;
	B(){
		//super(); A 자동정의 
		super("test");
		j=20;
		System.out.println("B생성자 호출");
	}
}

public class SuperTest {
	public static void main(String[] args) {
		
		B b1 = new B();
		
		System.out.println(b1.i);
		System.out.println(b1.j);
	}

}
