package test;

class Bird{
	 protected String name;  //꽥
	 private int legs;
	 private int lenght;
	 private String type;   //오리
	
	
	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	void fly(){
		
		}
	
	void sing() {
		System.out.printf("%s(%s)가 소리내어 웁니다.\n",type,name);	
		
	}
	
	public void setName(String name) {
		this.name= name;
	}
	
	void print() {
			System.out.printf("%s의 이름은 %s입니다.\n",type,name);
		}
		
}

class Duck extends Bird{
	
	private int web;

	public Duck(String name, int legs, int lenght, String type) {
		this.setName(name);  //꽥
		this.setLegs(legs);
		this.setLenght(lenght);
		this.setType(type);
		this.web=2;
		
	}
	@Override
	void fly() {
		System.out.printf("%s(%s)는 날지 않습니다.\n",getType(),getName());	
	}
	void swim() {
		System.out.printf("%s(%s)가 %d개의 물갈퀴로 수영합니다.\n",getType(),getName(),web);
		
	}
}

class Sparrow extends Bird{
	private String friend;
	
	public Sparrow(String name, int legs, int lenght, String type) {
		this.setName(name);  //짹
		this.setLegs(legs);
		this.setLenght(lenght);
		this.setType(type);
		this.friend="허수아비";
	}

	void makeFriend() {
		System.out.printf("%s의 친구는 %s입니다.\n",getType(),friend);
	}
	
	@Override
	void fly(){
		System.out.printf("%s(%s)가 날아다닙니다.\n",getType(),getName());	
	}
	
}

public class PlayBird {

	public static void main(String[] args) {
		
		Duck d = new Duck("꽥꽥이",2,2,"오리");
		d.fly();
		d.sing();
		d.swim();
		d.print();
		
		Sparrow s = new Sparrow("짹짹",2,2,"참새");
		s.fly();
		s.sing();
		s.makeFriend();
		s.print();
	}

}
