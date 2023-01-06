package innerClass2;


class Outer { //외부클래스 
	int i =10; //멤버변수 
	void mo(){
		System.out.println(i+ new Inner().j);
		//외부 클래스의 메소드는 내부클래스의 요소애 접근불가 
	}
	
	
	
	/* 멤버변수에 붙을 수있는 머디파이어 붙일수있다. 
	 * 
	 * 
	 * public /protected /
	 * private/
	 * static 하면 모든것에 static */
	
	
	
	class Inner{ //내부클래스 멤버변수 유사취급
		//	private class Inner{ //내부클래스 멤버변수 유사취급 하면 아우터클래스 syso에 
		//	System.out.println(i + newInner().j);

		int j =20;
		
		static void mi(){
			System.out.println(i-j); // 내부 클래스 메소드는 외부클래스 요소 접근가능 
		}
		static class Inner{ //내부클래스 멤버변수 유사취급
			//	private class Inner{ //내부클래스 멤버변수 유사취급 하면 아우터클래스 syso에 
			//	System.out.println(i + newInner().j);
			
			static int j =20;
			
			static void mi(){
				System.out.println(i-j);  // static내부메소드에서는 외부클래스 static요소 접근가능
			}
	}
}

public class InnerClassTest2 {

	public static void main(String[] args) {
		//Outer o = new Outer(); // 아우터 객체 만들고
		//Outer.Inner inner =o.new Inner(); // 아우터에서 이너꺼내서 
		//Outer.Inner inner =new Outer().new Inner(); // 아우터에서 이너꺼내서 
		//Inner inner = new Inner(); 하고싶은데
		//System.out.println("o.i"+o.i); 
		//System.out.println("o.i"+new Outer().i);
		//System.out.println("inner.j"+inner.j);
		Outer.Inner.mi();

		}
	}
}
