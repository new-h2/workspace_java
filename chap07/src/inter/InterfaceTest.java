package inter;

class StudentWorker implements Student, Worker{
	// 인터페이스 상속하면 오버라이딩해서 사용해야한다.


	///*public final static */String dept = "전산학"; 
	//double score =3.5;
	String title="조교";

	@Override
	public void work() { // 학생인터페이스에 public void
		System.out.println("학교 일하다");
	}

	@Override
	public void study() {
		System.out.println("도서관에서 공부하다");
	}

	@Override
	public void lunch() {
		System.out.println("학생식당이나 교직원식당에서 점심먹다");
	}
	
	void team() {
		System.out.println("조교모임 참석하다 ");
		
	}
	
}


public class InterfaceTest {//221214
	
	public static void main(String[] args) {
		//Worker w = new Worker();
		//Student s = new Student(); 불가
		
		StudentWorker sw = new StudentWorker();
		sw.study();
		sw.lunch();
		sw.work();
		sw.team();
		
		sw.title="조교아님";
		//sw.dept="국문학";  인터페이스 (public final static)는 final이여서 read only 값 변경 할수 없다
		
		System.out.println(sw.title);
		
		//System.out.println(sw.dept);
		System.out.println(Worker.dept);
		
		//System.out.println(sw.score); //public 이라 가능
		System.out.println(Student.score); //같은표현
		
		Worker w = new StudentWorker();
		/*
		1. 자동형변환 이후
		2. w. override 메소드 -> StudentWorker 클래스
		3. Worker 인터페이스 포함 -> StudentWorker
		4. lunch와 work만 사용가능
		 */
		//w.study();
		w.lunch();
		w.work();
		//w.team();
		Student s = new StudentWorker();
		/*
		1. 자동형변환 이후
		2. s.override 메소드 -> StudentWorker 클래스
		3. Student 인터페이스 포함 -> StudentWorker
		4. lunch와 study만 사용가능
		 */
		s.study();
		s.lunch();
		//s.work();
		//w.team();
		
		
		
		//볼륨 값 조정해야해서 각각 볼레벨
		
		
		
		
		
		
		
	}

}
