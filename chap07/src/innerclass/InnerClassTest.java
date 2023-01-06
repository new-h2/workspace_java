package innerclass;


class Outer { //외부클래스 
	int i =10; //멤버변수 
	void mo(){
//		System.out.println(i.new innder().j);
		System.out.println(i);
		//외부 클래스의 메소드는 내부클래스의 요소애 접근불가 
	}
	
	class Inner{ //내부클래스 멤버변수 유사취급
		int j =20;
		
		void mi(){
			System.out.println(i-j); // 내부 클래스 메소드는 외부클래스 요소 접근가능 
		}
	}
}

public class InnerClassTest {

	public static void main(String[] args) {
		Outer o = new Outer(); // 아우터 객체 만들고
		//Outer.Inner inner =o.new Inner(); // 아우터에서 이너꺼내서 
		Outer.Inner inner =new Outer().new Inner(); // 아우터에서 이너꺼내서 
		//Inner inner = new Inner(); 하고싶은데
		System.out.println("o.i"+o.i); 
		//System.out.println("o.i"+new Outer().i);
		System.out.println("inner.j"+inner.j);
		

	}

}
