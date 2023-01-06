package chap9;

import java.util.Random;

public class RandomClassTest {

	public static void main(String[] args) {

//		(int)(Math.random()*범위) +1  1~100
		int mathran =(int)(Math.random()*100) +1;
		
		System.out.println("Math.random()정수 ="+mathran);
//		Random ran = new Random();
//		System.out.println("Random 정수 ="+ ran.nextInt(100));
//		System.out.println("Random 실수 ="+ ran.nextDouble(100));
		
		Random ran = new Random();
		for(int i=1; i<=5; i++) {
			System.out.println("Random 정수 =" + ran.nextInt(100));
	
		}
		System.out.println("===================================");
		
		Random ran2 = new Random(2); //2
		for(int i=1; i<=5; i++) {
			System.out.println("Random 실수 ="+ ran2.nextInt(100));
			
		}
		
	}

}
//Random 실수 =8
//Random 실수 =72
//Random 실수 =40
//Random 실수 =67
//Random 실수 =89
