package chap6;
//자바 클래스명 = 자바파일명
//아닌 경우 가능- public키워드 1개 클래스만 선언(main)






//회사원
public class EmployeeArrayTest {
	// 변수들
	// 메소드
	// 자바 어플리케이션 클래스(특정기능부여)-"대장"-main
	public static void main(String[] args) {
		// 배열 -Employee객체 10개
		Employee arr[] = new Employee[2];
		
		Employee e1 = new Employee(); //el 은 참조형변수
		e1.id =100; 	// 객체주소참조변수명/ 객체변수명
		e1.name="이사원";
		e1.title="사원";
		e1.dept="it개발부";
		e1.salary=10000;
		arr[0] = e1;
		
		
		// 소수점 둘쨋자리까지, 아무것도 입력안했을때null
		
		Employee e2 = new Employee();
		e2.id = 200;
		e2.name = "박대리";
		e2.title = "대리";
		e2.dept = "인재개발부";
		e2.salary = 15000;
		arr[1]=e2;
		
		
		for(int i =0; i < arr.length; i++) {
			System.out.printf("사번 %d 이름 %s 직급 %s 부서명 %s 급여 %.2f입니다.\n",
			arr[i].id, arr[i].name, arr[i].title, arr[i].dept, arr[i].salary);
		}
		
	}
}
