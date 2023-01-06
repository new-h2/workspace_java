package chap6;


class Person{
	String name;
	int age;
	static String nation ="대한민국";// Pesrons 객체 공유 , 1개 메모리 할당. 모든객체 공통값
	//멤버 변수에만 static가능 
}

 //run오류검사 - static할당 - main - 객체생성
public class StaticTest {
	public static void main(String[] args) {
		
		//메모리할당전 사용가능 
		System.out.println("모든사람들의 국적은 " + Person.nation + " 입니다.");
		//System.out.println("모든사람들의 국적은 " + p1.nation + " 입니다.");
		//불가능
		Person p1 = new Person();//객체생성
		p1.name = "홍길동";
		p1.age = 22;
		//Person.nation="일"; // 밑에 선언하면 값변화, 하지만 할당전에는 변경불가 
		System.out.println(p1.name + ":" + p1.age + ":"+ Person.nation);

		Person p2 = new Person();
		p2.name = "이철수";
		p2.age = 32;
		
		System.out.println(p2.name + ":" + p2.age + ":"+ p2.nation);
		
		
		
	}
}
