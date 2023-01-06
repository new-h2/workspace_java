package test;

/*
 *  교육생 객체 표현 클래스
 *  1. 변수선언 -이름, 과정명, 교육기관, 교육비, 부가금, 환급비 (이름,타입지정해주지않았음)
 *  2. 단, 교육기관은 = 새싹으로 모든교육생동일,  공유 static
 *  3. 단, 부가금 = 5000으로 수정불가능
 *  4. 메소드 - 타입 알아서 calc()  
 *  4-1. 과정명이 "자바" 이면 환급금 = 교육비의 20% + 부가금
 *  4-2. 과정명이 "jsp" 이면 환급금 = 교육비의 15% + 부가금*2
 *  4-3. 과정명이 "spring" 이면 환급금 = 교육비의 10% + 부가금
 *  4-4. 그외의 과정명은 환급금 = 0 
 * 
 * 
 *  실행 main 메소드클래스
 * 
 * */

class Trainee {  
	String name,subject;
	static String location="새싹";
	int fee, returnFee;
	final int addFee=5000;
	
	 void calcRetrunFee() {
		 
		 // equasIgnoreCase (대소문자무시)
		 
		 if(subject.equals("자바")) {
			 returnFee = (int)(fee * 0.20 + addFee);
		 }else if(subject.toLowerCase().equals("Jsp")) {
			 returnFee = (int)(fee * 0.20 + addFee*2);
		 }else if(subject.toLowerCase().equals("spring")) {
			 returnFee = (int)(fee * 0.1 + addFee);
		 }else {
			 System.out.println("과정명은 없습니다.");
		 }
		 
	}
	
	
}





public class Test1_teacher {

	public static void main(String[] args) {
		
/*		교육생 a1 = new 교육생();
		이름, 과정명, 교육비 명령행 매개변수 입력값 할당
		교육생 환급비 계산 메소드 호출
		결과 리턴, 결과 출력
		이름 : xxx
		과정명 : xxx
		교육비 : xxx
		교육기관 : 새싹
		부가금 : 5000
		환급비 : 
	String name,subject;
	static String location="새싹";
	int fee, returnFee;
	final int addFee=5000;
	
*/		

	
		Trainee a1 = new Trainee();
		a1.name= args[0];
		a1.subject = args[1];
		a1.fee =Integer.parseInt(args[2]);
		a1.calcRetrunFee();
	
		
		System.out.printf("이름 : %s \n과정명 : %s \n교육비 : %s \n교육기관 : %s \n부가금 :%d \n환급금 :%d \n"
				,a1.name,a1.subject,a1.fee,a1.location,a1.addFee,a1.returnFee);
		
		
		
	}

}
