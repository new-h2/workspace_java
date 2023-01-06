package chap4;

public class WhileTest {
	public static void main(String[] args) {
		
		
		while(true) {
			int test = (int)(Math.random()*100)+1;
			if(test == 50)continue; // 50만 출력안함 
			if(test % 3 == 0) break; //3의배수 멈춰 
			System.out.println(test); 
		}

//		while(true) {
//			int test = (int)(Math.random()*100)+1;
//			System.out.println(test);
//			if(test == 50) {
//			System.out.println("==중단합니다==");
//			break; // 반복종료
//			}
//		}
		// if문 뒤에 한문장만 포함하고 있따면 {}생략가능
		// for ,while,do -while 블록 내부 1문장만 포함시 {}생략가능
		
		
		
//		
//		int test = (int)(Math.random()*100)+1;
//		System.out.println(test);
//		// int i = 1;
//		// test변수가 50이면 중단 
//		while(test != 50) {
//			test = (int)(Math.random()*100)+1;
//			System.out.println(test);
//			//i++;
//		}
	}
}
