package salary;

class Employee{
	
	int id;
	String name;
	int baseSalary;
	int generalFee;
	int totalSalary;
	
	Employee(){}
	
	void calcSalary() {
		totalSalary = baseSalary +generalFee;
	}
	
	public Employee(int id, String name, int baseSalary, int generalFee) {
		super();
		this.id = id;
		this.name = name;
		this.baseSalary = baseSalary;
		this.generalFee = generalFee;
	}
	
}

class Manager extends Employee{
	int manFee;
	public Manager(int id, String name, int baseSalary, int generalFee,  int manFee) {
		super(id, name, baseSalary, generalFee);
		this.manFee = manFee;
	}
	@Override
	void calcSalary() {
		// TODO Auto-generated method stub
		super.calcSalary();
		totalSalary += manFee;
	}

}

class Engineer extends Employee{
	int techFee,certiFee;//기술수당 자격수당

	public Engineer(int id, String name, int baseSalary, int generalFee, int techFee, int certiFee) {
		super(id, name, baseSalary, generalFee);
		this.techFee = techFee;
		this.certiFee = certiFee;
	}

	@Override
	void calcSalary() {
		super.calcSalary();
		totalSalary += techFee+ certiFee;
	}
 
	
}

class Secretary extends Employee{
	int secFee;

	public Secretary(int id, String name, int baseSalary, int generalFee, int secFee) {
		super(id, name, baseSalary, generalFee);
		this.secFee = secFee;
	}

	@Override
	void calcSalary() {
		super.calcSalary();
		totalSalary += secFee;
	}
	
}


public class SalaryTest2 {
	
	
	public static void main(String[] args) {
		Employee e [] = new Employee[4];
		// 1.상속 2.생성자(타입 순서 갯수....)
		e[0] = new Employee(1000,"이사원",10000,5000);
		e[1] = new Manager(2000,"김간부",20000,10000,10000);
		e[2] = new Engineer(3000,"박기술",15000,7500,5000,5000);
		e[3] = new Secretary(4000,"최비서",15000,7000,10000);
		
		for(int i =0; i< e.length; i++) {
			e[i].calcSalary(); // 4개 객체 모두 오버라이딩
			System.out.println("사번 : 이름 : 본봉 : 총급여 ");
			System.out.println(e[i].id+":"+e[i].name+":"+e[i].baseSalary+":"+e[i].totalSalary);
		
		if(e[i] instanceof Engineer) {
			System.out.println("기술직 사원인 경우 : "+((Engineer)e[i]).techFee+","+((Engineer)e[i]).certiFee);
	
		}
		
		}
		
	}

}
