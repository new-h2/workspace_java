package constructor;

public class VarInitTest {
//객체 변수들 선언 -"자동초기화"
	int a; // int a =10; 가능하다 근데왜 생성자사용? 객체생성될때마다 값달라지려면 생성자이용해야함
	double b;
	String c;

	public VarInitTest( int a , double b) {
		this.a = a;
		this.b = b;
		//c = "생성자 초기화 ";
		//System.out.println(a+b+c); //2보다 먼저 출력
	}
	
	{ //초기화 블럭 _여러객체 생성시 공통변수값 초기화
		c = "초기화 블럭";
	}
	
	public static void main(String[] args) {
		//System.out.println(a);
		//int d; // The local variable d may not have been initialized 지역변수는 자동초기화되지않음
		int d = 0;
		VarInitTest test = new VarInitTest(100, 100.99);
		VarInitTest test2 = new VarInitTest(1000, 1000.99);
		System.out.printf("a = %d , b = %f, c = %s \n", test.a, test.b, test.c); //2번출력
		System.out.printf("a2 = %d , b2 = %f, c2 = %s \n", test2.a, test2.b, test2.c); 
		//System.out.println("d= "+ d);
	}
// static 메서드에서는 static변수만 사용가능하다
}
