package generic2;

import java.util.ArrayList;

class Solid{
	public String tellName() {
		return "고체";
	}
}



class Apple extends Solid{
	String origin;

	public Apple(String origin) {
		this.origin = origin;
	}
}


class Paper extends Solid{
	String size;

	public Paper(String size) {
		this.size = size;
	}
	
}



//클래스명 아니다. Type의 약자 -type매개변수
//Box - 원시타입

class Box<T extends Solid>{  //solid 와 solid상속받은 자식클래스로 한정 
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
		Apple a = new Apple("대구");
		Paper p = new Paper("A4");
		Box<Apple> aBox = new Box(a);
		Box<Paper> pBox = new Box(p);
		Box<Solid> sBox = new Box(new Solid());
		
		System.out.println(aBox.contents.origin);
		System.out.println(pBox.contents.size);
		System.out.println(sBox.contents.tellName());
		
		//Box wBox = new Box(new Wine("로제와인"));
		//solid타입이아니여서 못들어감
		
		ArrayList<Solid> list = new ArrayList();
		list.add(a);
		list.add(p);
		//솔리드의 하위타입은 다 가능	

	}
}