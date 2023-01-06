package chap12;

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
		return id + "-" + name +"-"+ pay;
	}
	
}

public class ArrayListTest {

	public static void main(String[] args) {
		// 1.여러가지 타입저장/ 동일타입데이터만 저장, 강제적규칙, 동적크기
		// 2.  Employee 타입 ArrayList
		// ArrayList Employee타입 매개변수 유사 전달, ArrayList저장 타입 제한
		// Generics 
		// 1.컴파일 타입 체크 2. 형변환코드 사라진다
		// add(Employee o) / Employee<-get()
		
		//ArrayList list = new ArrayList(5); 아무거나 다 담을 수 있다.
		ArrayList<Employee> list = new ArrayList(5); 
		Employee e1 = new Employee(100, "이사원", 1000000);
		Employee e2 = new Employee(200, "박대리", 1500000);
		Employee e3 = new Employee(300, "김부장", 2000000);
		list.add(e1);
		list.add(e2);
		list.add(e3);
	
		System.out.println(list.size()); 
		
		for(int i=0; i< list.size(); i++) {
			System.out.println(i+"번째 위치 = "+list.get(i).name);
			
			//employee 이름만 출력하고싶은데 
			//list.get  =오브젝트형태여서(Employee)list.get(0).name
			// if(list.get(i) instanceod Employee){
			//System.out.println(i+"번째 위치 = "+(Employee)(list.get(i)).name);
			//}
		
		}
	}

}
