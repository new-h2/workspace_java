package constructor;

class Employee { 
	// 자바 자동포함
	
	public Employee(int id, String name, String title, String dept , double salary) {
		//System.out.println("Employee생성자호출");
		//생성자를 통해 객체의 매개변수의 값 초기화
		this.id =id;
		this.name =name;
		this.title =title;
		this.dept=dept;
		this.salary =salary;
		
	}
	public Employee(int id,String name) {
		//System.out.println("Employee생성자호출");
		//생성자를 통해 객체의 매개변수의 값 초기화
		this(id, name, "직급미정","배치이전",-1);
		/* this.id =id;
		this.name =name;
		title ="직급미정";
		dept="배치이전";
		salary =-1; */
		
	}
	
	public Employee() {
		this(-1,"이름미상","직급미정","배치이전",-1); //반드시 첫문장
		/* id= -1;
		name="이름미상";
		title ="직급미정";
		dept="배치이전";
		salary =-1; */
				
	}
	
	int id; 
	String name;
	String title;
	String dept;
	double salary;
	
	void printInform() {
		//int id =1000; 반영안됨
		System.out.printf("사번 %d 이름 %s 직급 %s 부서명 %s 급여 %.2f입니다.\n",
				this.id, this.name, title, dept, salary);
		
	}
	
}


public class EmployeeTest {
	public static void main(String[] args) {
		
//		Employee e1 = new Employee(); 
		Employee e1 = new Employee(100, "이사원", "사원","it개발부",10000); 
		/*e1.id=100;
		e1.name="이사원";
		e1.title="사원";
		e1.dept="it개발부";
		e1.salary=10000;*/
		
		e1.printInform();		
		
		
//		Employee e2 = new Employee(200,"박대리","대리","인재개발부",15000);
		/*e 2.id = 200;
		e2.name = "박대리";
		e2.title = "대리";
		e2.dept = "인재개발부";
		e2.salary = 15000; */
		
		Employee e2 = new Employee(200,"박대리"); // title, dept, salary 
		e2.printInform();
		
		Employee e3 = new Employee(); // 아무 정보없음
		e3.printInform();
		
	}
}
