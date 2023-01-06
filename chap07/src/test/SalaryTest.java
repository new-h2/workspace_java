package test;

import salary.Employee;
import salary.Engineer;
import salary.Manager;
import salary.Secretary;

class Employee{
	
	private int id;
	private String name;
	private int sal;
	private int rate;
	private int totalSal;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getTotalSal() {
		return totalSal;
	}
	public void setTotalSal(int totalSal) {
		this.totalSal = totalSal;
	}


	public Employee(int id, String name, int sal, int rate) {
		
	}
	
	void print() {
		System.out.println("totalSal:총급여" +sal + rate);
	}
	
}

class Manager extends Employee{
	int mb1;
	public Manager(int id, String name, int sal, int rate, int mb1){
		super(id, name, sal,rate) ;
		this.setId(id);
		this.setName(name);
		this.setRate(rate);
		this.setSal(sal);
		this.mb1=mb1;
	}
	
	@Override
	void print() {
		System.out.println(" 회사원 총급여 : " +getSal() + getRate()+ mb1);
	}
	
}

class Engineer extends Employee{
	int eb1;
	int eb2;

	public Engineer(int id, String name, int sal, int rate, int eb1, int eb2) {
		super(id, name, sal,rate) ;
		this.setId(id);
		this.setName(name);
		this.setRate(rate);
		this.setSal(sal);
		this.eb1 =eb1;
		this.eb2 =eb2;
	}
	
	@Override
	void print() {
		//super.print();
		System.out.println("엔지니어 총급여 :" +getSal() + getRate()+ eb1);
		
	}

	
}

class Secretary extends Employee{
	int sb1;

	public Secretary(int id, String name, int sal, int rate, int l) {
		super(id, name, sal,rate) ;
		this.setId(id);
		this.setName(name);
		this.setRate(rate);
		this.setSal(sal);
		this.sb1=sb1;
	}
	
	
	@Override
	void print() {
		//		super.print();
		System.out.println("비서직 총급여 :" +getSal() + getRate()+ sb1);
		
	}
}


public class SalaryTest {
	
	
	public static void main(String[] args) {
		Employee e [] = new Employee[4];
		// 1.상속 2.생성자(타입 순서 갯수....)
		e[0] = new Employee(1000,"이사원",10000,5000);
		e[1] = new Manager(2000,"김간부",20000,10000,10000);
		e[2] = new Engineer(3000,"박기술",15000,7500,5000,5000);
		e[3] = new Secretary(4000,"최비서",15000,7000,10000);

		
	}

}
