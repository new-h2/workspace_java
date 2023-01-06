package chap7;



interface Valume{
	
	// void 오버라이드해서 무조건사용해야하는 메소드
	 void volumeUp(int vol); 
	
	 void volumeDown(int vol);
	
	 
	 // static변경없이 그대로 사용
	 
	 static void print1(String name){
	//static을 추가할수있는버전 jdk1.8
		 System.out.println(name+" 클래스가 볼륨업 수행중입니다.");
	 }
	 static void print2(String name){
		 //static을 추가할수있는버전 jdk1.8
		 System.out.println(name+" 클래스가 볼륨다운 수행중입니다.");
	 }
	
	 // default 
	 default void print3() {
		 System.out.println("뒤늦게 메소드 추가 - 자식클래스 오버라이딩 선택적 ");
	 }
	
}
	
class Speaker implements Valume{
	 int volLevel;
	 Speaker(int vol){
		 volLevel=vol;
		}

		public void volumeUp(int vol) {
			Valume.print1("Speaker");
			volLevel += vol;
			if(volLevel > 100) {
				volLevel =100;
			}
			System.out.println("현재의 speaker의 볼륨 = "+ volLevel);
		}
		public void volumeDown(int vol) {
			Valume.print2("Speaker");
			volLevel -= vol;
			if(volLevel < -100) {
				volLevel = -100;
			}
			System.out.println("현재의 speaker의 볼륨 = "+ volLevel);
		}
		
		public void print3() {
			//퍼블릭 붙어야한다 오버라이딩하려면 값범위가 같거나 넓어야한다?
			System.out.println("Speaker클래스에서 오버라이딩 합니다.");
		}

}


class Radio implements Valume{
	int volLevel;
	Radio(int vol){
		volLevel=vol;
	}

	public void volumeUp(int vol) {
		Valume.print1("Radio");
		volLevel += vol;
		System.out.println("현재의 Radio의 볼륨 = "+ volLevel);
	}
	public void volumeDown(int vol) {
		Valume.print2("Radio");
		volLevel -= vol;
		if(volLevel < 0) {
			volLevel = 0;
		}
		System.out.println("현재의 Radio의 볼륨 = "+ volLevel);
	}

}

class TV implements Valume{
	int volLevel;
	 TV(int vol){
		 volLevel=vol;
		}
		public void volumeUp(int vol) {
			Valume.print1("TV");
			volLevel += vol;
			System.out.println("현재의 Tv의 볼륨 = "+ volLevel);
		}
	 	public void volumeDown(int vol) {
	 		Valume.print2("TV");
			volLevel -= vol;
			if(volLevel < 0) {
				volLevel = 0;
			}
			System.out.println("현재의 Tv의 볼륨 = "+ volLevel);
		}

	 
	
	
}
public class VolTest {
	public static void main(String[] args) {
		// 서로 다른 클래스 관계 맺어준다
		Valume[] v = new Valume[3];
		v[0] = new Speaker(50); 
		v[1] = new TV(40);
		v[2] = new Radio(30);
		
		for(int i=0; i < v.length; i++) {
			v[i].volumeUp(200);
			v[i].volumeDown(300);
		}
		
		
		
		v[1].print3(); // static아니여서 Valume. print3() 호출불가능
		
	}

}
