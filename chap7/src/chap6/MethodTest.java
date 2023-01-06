package chap6;

import java.lang.reflect.Array;
import java.util.Arrays;

class B{
	int m1() {
		int local =10;
		return local*10;
	}

	int m2(int param) {
		return param* 10;
	}
	
	String m3 (int param1, int param2) {
		return param1* param2 +"결과를 리턴합니다";
	}
	
//	int[] m4(int[] ar){
//		// ar 배열 각 요소에 * 10 배열 저장 리턴
//		
//		int[] result = new int[ar.length];
//		
//		for(int i =0; i< ar.length; i++) {
//			result[i] = ar[i]*10;
//		}
//		return result;
//	}

	void m4(int[] ar){
		
		int[] result = new int[ar.length];
		
		for(int i =0; i< ar.length; i++) {
			ar[i] = ar[i]*10; // 
		}
	}
	
//	int[] m4(int[] ar){
//		
//		int[] result = new int[ar.length];
//		
//		for(int i =0; i< ar.length; i++) {
//			ar[i] = ar[i]*10;
//		}
//		return ar;
//	}
	
	
	
	 void m5(){
		 System.out.println("B클래스에서 메소드를 테스트합니다.");
		 //  리턴문이 없는 메소드
		 // return; 종료
 	}

}

public class MethodTest {

	public static void main(String[] args) {
		B b1 = new B();
		int result1 = b1.m1();
		System.out.println(result1);
		System.out.println("b1.m2(5) : "+ b1.m2(5));
		System.out.println(b1.m2(50));
		
		System.out.println(b1.m3(6,8)); //String 리턴
		
		//int[] main_result = b1.m4(main_ar);
		//System.out.println("Arrays.toString(main_result)"+ Arrays.toString(main_result));
		// 반복문없이 배열출력 

		int main_ar[] = {10, 20, 45, 1, 99};
		b1.m4(main_ar);
		System.out.println(Arrays.toString(main_ar));
		//b1.m5();
	}

}
