package chap15;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			int first;
			int second;
			int num;
			
			System.out.print("계산기를 시작합니다 \n종료하려면 5를 입력하세요. \n메뉴 \n1. 덧셈 \r\n"
					+ "2. 뺄셈 \r\n"
					+ "3. 곱셈 \r\n"
					+ "4. 나눗셈 \r\n"
					+ "5. 프로그램 종료 ");
			
			System.out.print("선택번호입력 :");
			num = sc.nextInt();
			
			if(num == 5){
				System.out.println("프로그램종료");
				break;
			}else if(num == 1 ){
				System.out.print("덧셈할 데이터1 입력: ");
				first = sc.nextInt();
				System.out.print("덧셈할 데이터2 입력 : ");
				second = sc.nextInt();
				System.out.println("결과 : "+(first + second));
			}else if(num == 2 ){
				System.out.print("뺄셈할 데이터1 입력: ");
				first = sc.nextInt();
				System.out.print("뺄셈할 데이터2 입력: ");
				second = sc.nextInt();
				System.out.println("결과 : "+(first - second));
			}else if(num == 3 ){
				System.out.print("곱셈할 데이터1 입력: ");
				first = sc.nextInt();
				System.out.print("곱셈할 데이터2 입력: ");
				second = sc.nextInt();
				System.out.println("결과 : "+(first * second));
			}else if(num == 4 ){
				System.out.print("나눗셈할 데이터1 입력: ");
				first = sc.nextInt();
				System.out.print("나눗셈할 데이터2 입력: ");
				second = sc.nextInt();
				System.out.println("결과 : "+(first / second));
			}
		}
		
		
//		while(sc.hasNextInt()) {
//			System.out.print("선택번호입력 :");
//			first = sc.nextInt();
//			second = sc.nextInt();
//			
//			System.out.println(first+second);
//		}
		
	}
}
