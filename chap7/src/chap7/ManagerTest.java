package chap7;

// 자바 자동 포함 -생성자, 상속
// java.lang.Object 클래스 라이브러리 
// java.lang.Object 클래스 변수나 메소드 자바 모든 클래스 자동포함 사용가능 

class Employee /* extends java.lang.Object  조상 */{ 
//	private String title= "사원";
	String title= "사원";
	int id;
	String name;
	String dept ="개발팀";
	double salary;
	
	void calcSalary(int salary) {
		this.salary = salary *2;
	}
	void printAll() { /*default */
		
		System.out.printf("사번 = %d 이 름=  %s 부서명 = %s 급여 = %.2f\n"
				,id, name, dept, salary);
	}
}

class Manager extends Employee{ //관리직 직원
	/*int id;
	String name;
	String dept;
	double salary;  상속받으면 필요없게 됨 */  
	//String title ="관리직";
	
	String job;
	
	public Manager(int id, String name, String dept, String job) {
		this.id =id;
		this.name = name;
		this.dept = dept;
		this.job = job;
	}


	void test() { // 상속x 오버라이드x 현재추가 메소드
		
		//String title = "test메소드 내부";
		System.out.println(title); // 자신의것 지역변수"test메소드" ,
		System.out.println(this.title); // 자신 위에있는 Manager "관리직"
		System.out.println(super.title); // 상속받은 "사원 "
		// 구분이 필요할때가 아니면 언급 x
		
	}
	

	@Override //'@엣사인'자바컴파일러 알려주는 주석문
	 void printAll() {
//		protected public void printAll() { 가능
	  //calcSalary , printAll 메소드 상속받아 사용
	  //메소드 내용 수정필요
	  //상속후에 하위클래스에서 매소드 내용 재정의 - 메소드overriding
	  super.printAll();
	  System.out.printf("printAll(%d \n)", job);
	}
}
 
//class A { // 인터페이스 - 클래스 돌연변이사용하면 다중상속가능
//	
//	int i =10;
//}
//
//class B{
//	int j =20;
//	
//}
//
//class C extends A, B{ // 2개 이상 클래스 동시 상속 가능 가정
//	int k =30;
//	
//}


public class ManagerTest /*java. lang.objecct*/ {
	 
	
	public static void main(String[] args) {
		Manager m = new Manager(100,"홍길동","영업부","영업관리");
		//m.id = 100; 
		//m.name = "홍길동"; 
		//m.dept = "영업부";
		//m.job = "영업관리";
		m.calcSalary(500000); //상속받은 그대로 
//		super.printAll(); // 상속 오버라이드 
//		System.out.printf("사번 %d 이름 %s 부서명 %s 관리직종 %s \n",m.id, m.name, m.dept, m.job);
		m.test(); // 
		}

	}
