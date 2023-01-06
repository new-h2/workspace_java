package chap11;


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



class Box{
	Object contents;

	
	public Box(Object contents) {
		this.contents = contents;
	}


	public Object getContents() {
		return contents;
	}


	public void setContents(Object contents) {
		this.contents = contents;
	}
	
	
	
}


public class nonGenericTest {

	public static void main(String[] args) {
		//제너릭 미사용
		Apple a = new Apple("대구");
		Paper p = new Paper("A4");
		Box aBox = new Box(a);
		Box pBox = new Box(p);
		
		System.out.println(((Apple)aBox.contents).origin);
		System.out.println(((Paper)pBox.contents).size);
		
		
	}

}
