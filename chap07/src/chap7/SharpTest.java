package chap7;


abstract class Shape{
	abstract void area(); //면적
	abstract void circum(); //둘레
	
	void print() { //자식 클래스 오버라이딩 불필요 
		System.out.println("면적과 둘레 출력 ");
	}
}

class Ractangle extends Shape{
	int width, height;

	@Override
	void area() {
		System.out.println("가로 =" + width + ",세로 =" + height +"인 사각형의 면적 = " +width*height);
	}

	@Override
	void circum() {
		System.out.println("가로 =" + width + ",세로 =" + height +"인 사각형의 둘레 = " +2*(width*height));
	}
	
	public Ractangle(String width, String height) {	
		this.width = Integer.parseInt(width);
		this.height = Integer.parseInt(height);
		
	}
	
}

class Circle extends Shape{
	int radius; 
	final static double pi = 3.14; 
	
	@Override
	void area() {
		System.out.println("반지름 =" + radius +"인 원의 면적 = "+ radius * radius * pi );
	}
	@Override
	void circum() {
		System.out.println("반지름 =" + radius +"인 원의 둘레 = "+ radius * 2 * pi );
	}
	
	public Circle(String radius) {
		this.radius = Integer.parseInt(radius);
	
	}
}


public class SharpTest {

	public static void main(String[] args) {
		// 명령행 매개변수 입력
		// rect 6 8 - 3개 입력 첫번째"rect"문자열이면 사각형 
		// Rectangle 객체생성
		// 면적 area()호출 - 두, 세번째값 가로 ,세로, 면저 출력

		
		// cir 5 - 2개 입력 첫번째 문자열이"cir"이면
		// Circle객체생성
		// 두번째 반지름, 면적 둘레 
		// "면적"과 "둘레"를 구할 수 있어야한다.  구현필수 
		Shape s = null;
		
		if(args.length == 3 && args[0].equals("rect")) {
			s = new Ractangle(args[1],args[2]);
			
		}else if(args.length == 2 && args[0].equals("cir")){
			s = new Circle(args[1]);
			
		}else {
			System.out.println("지원되지 않는 도형입니다.");
		}
		
		// Shape타입 이면 2개 필수 포함 서로 다른 내용 실행 
		s.area();
		s.circum();
	}
}

