package chap6;
//자바 클래스명 = 자바파일명
//아닌 경우 가능- public키워드 1개 클래스만 선언(main)



//회사원 변수를 담은 클래스정의( 지역변수x, 지역변수x 매개변수x)
class Employee { 
	int id; //
	String name;
	String title;
	String dept;
	double salary;
	void printInform(String name) {
		int id = 1000;
		System.out.printf("사번 %d 이름 %s 직급 %s 부서명 %s 급여 %.2f입니다.\n",
				id, this.name, title, dept, salary);
		//지역변수와 객체중 가까운게 먼저 됨
		// id 만쓰면 = printInform에 값> 메인안에 id값 = this.id
		// this를쓰고 밑에 값을 안주면 0 
		
	}
	
}




//회사원
public class EmployeeTest {
	// 변수들
	// 메소드
	// 자바 어플리케이션 클래스(특정기능부여)-"대장"-main
	public static void main(String[] args) {
		// 배열 -Employee객체 10개
		Employee arr[] = new Employee[10];
		
		Employee e1 = new Employee(); //el 은 참조형변수
		//e1.id =100; 	// 객체주소참조변수명/ 객체변수명
		e1.name="이사원";
		e1.title="사원";
		e1.dept="it개발부";
		e1.salary=10000;
		
		e1.printInform("1");		
		
		//System.out.printf("사번 %d 이름 %s 직급 %s 부서명 %s 급여 %.2f입니다.\n",
		//e1.id, e1.name, e1.title, e1.dept, e1.salary);
		
		// 소수점 둘쨋자리까지, 아무것도 입력안했을때null
		
		Employee e2 = new Employee();
		e2.id = 200;
		e2.name = "박대리";
		e2.title = "대리";
		e2.dept = "인재개발부";
		e2.salary = 15000;
		
		e2.printInform("2");
		//System.out.printf("사번 %d 이름 %s 직급 %s 부서명 %s 급여 %.2f입니다.\n",
		//	e2.id, e2.name, e2.title, e2.dept, e2.salary);
		
		
	}
}
