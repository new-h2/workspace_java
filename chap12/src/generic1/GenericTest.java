package generic1;


class Apple{
	String origin;

	public Apple(String origin) {
		this.origin = origin;
	}
}


class Paper{
	String size;

	public Paper(String size) {
		this.size = size;
	}
	
}



//클래스명 아니다. Type의 약자 -type매개변수
//Box - 원시타입

class Box<T>{ 
	T contents;

	
	public Box(T contents) {
		this.contents = contents;
	}


	public T getContents() {
		return contents;
	}


	public void setContents(T contents) {
		this.contents = contents;
	}
	
	
	
}

class Wine{
	String kind;

	public Wine(String kind) {
 		this.kind = kind;
	}
	
}




public class GenericTest {

	public static void main(String[] args) {
		//제너릭  미리 타입 지정
		Apple a = new Apple("대구");
		Paper p = new Paper("A4");
		Box<Apple> aBox = new Box(a);
		Box<Paper> pBox = new Box(p);
		
		System.out.println(aBox.contents.origin);
		System.out.println(pBox.contents.size);
		
		Box wBox = new Box(new Wine("로제와인"));
	}

}
