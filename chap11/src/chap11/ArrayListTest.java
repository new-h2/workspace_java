package chap11;

import java.util.ArrayList;


class Employee{
	int id;
	String name;
	double pay;
	public Employee(int id, String name, double pay) {
		this.id = id;
		this.name = name;
		this.pay = pay;
	}
	
	@Override
	public String toString() {
		//id - name - pay
		return id + "-" + name +"-"+ pay;
	}
	
}

public class ArrayListTest {

	public static void main(String[] args) {
		// 배열과 차이점 - 동일 타입데이터만 들어가야함, newt String[4] 길이정하면 수정불가
		// ArrayList - 서로다른타입가능, 생성+동적 크기 수정가능
		
		ArrayList list = new ArrayList(5); //() default 10개 
		list.add("java"); //값추가 
		list.add(10);
		list.add(3.14);
		Employee e1 = new Employee(100, "이사원", 1000000);
		Employee e2 = new Employee(200, "박대리", 1500000);
		Employee e3 = new Employee(300, "김부장", 2000000);
		list.add(e1);
		list.add(e2);
		list.add(e3); //5번인덱스
		//list.set(5, "new문자열"); //5번인덱스, 값변경
		//list.remove(1); //1번인덱스 삭제 
		list.add(e3);
	
		System.out.println(list.size()); // 현재 리스트안에 객체 갯수 //동적으로 늘어난다
		System.out.println(list.contains("java"));//리스트안에 포함되어있니 True/false
		System.out.println(list.indexOf("java"));// 몇번인덱스에 있는지 
		
		for(int i=0; i< list.size(); i++) {
			System.out.print(list.get(i).getClass().getName()+" : "); 
			//get으로 가져와야함
			//System.out.println(list.get(i)); /*toString => 주소값 출력*/
			//to String 오버라이딩 : id - name - pay
			System.out.println(i+"번째 위치 = "+list.get(i));
			
		}
	}

}
