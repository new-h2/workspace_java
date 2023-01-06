package chap15;

import java.util.ArrayList;
import java.util.Scanner;

class Suprint {
	int su1, su2;
	String operator;
	
	public Suprint(int su1, int su2, String operator) {
		super();
		this.su1 = su1;
		this.su2 = su2;
		this.operator = operator;
	}

	@Override
	public String toString() {
			int result = 0 ;
			if(operator.equals("+")) {result = su1 + su2;}
			else if(operator.equals("-")) {result = su1 - su2;}
			else if(operator.equals("*")) {result = su1 * su2;}
			else if(operator.equals("/")) {result = su1 / su2;}
			
			return su1 + operator + su2 +" = "+ result;
		}
	}


public class Calc_teacher {

	public static void main(String[] args) {
		ArrayList<String> menu = new ArrayList<String>();
		menu.add("덧셈"); // 1번 ,인덱스 0번
		menu.add("뺄셈"); // 2번 ,인덱스1번
		menu.add("곱셈");
		menu.add("나눗셈");
		menu.add("프로그램 종료");
		
		// 반복해서 계속보여줄부분
		while(true) {
		System.out.println("계산기를 시작합니다. \n종료하려면 q를 입력하세요. \n메뉴");
		
//		for(String m :menu) {
//			System.out.println(m); //한번에 출력
//		}
		for(int i =0; i<menu.size(); i++) {
			System.out.println((i+1) + "." + menu.get(i));
		}
		System.out.print("선택번호 입력 : ");
		//
		Scanner key = new Scanner(System.in);
		String num = key.next();
		if(num.equals("5")|| num.equals("q")||num.equals("quit")|| num.equals("exit")) {
			System.out.println("프로그램 종료");
			//q도 입력받으려면 String
			//return; // 현재 메소드 종료 
			//System.exit(0); // 프로그램 종료
			break;
		}else {
			System.out.print(menu.get(Integer.parseInt(num) - 1) + "할 데이터1 입력 : ");
			int first = key.nextInt();
			System.out.print(menu.get(Integer.parseInt(num) - 1) + "할 데이터2 입력 : ");
			int second = key.nextInt();
			String operator = null;
			if(num.equals(1)) { operator ="+" ;}
			else if(num.equals(2) ) {operator ="-";}
			else if(num.equals(3) ) {operator ="*";}
			else if(num.equals(4) ) {operator ="/";}
			Suprint calc = new Suprint(first, second, operator);
			System.out.println(calc);
		}
	}
	} // main
}
