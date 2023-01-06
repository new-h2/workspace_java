package chap11;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest {
	public static void main(String[] args) { //int 배열 실습해보기
		String[] animals = {"lion","tiger","Snake","dog"}; 
		// 사전 순서 
		//(작다)  숫자> 특수문자일부 > 대문자 > 소문자> 한글  (크다) 오름차순
		
		//[dog, lion, snake, tiger]
		//[0-lion, :snake, dog, tiger]
		//[Snake, dog, lion, tiger]
		Arrays.sort(animals); //오름차순정렬
		System.out.println(Arrays.toString(animals));
		
		//정렬할때 대소문자구분안한다
		//[dog, lion, Snake, tiger]
		//Arrays.sort(animals, String.CASE_INSENSITIVE_ORDER);
		//System.out.println(Arrays.toString(animals)); 
		
		
		// 내부클래스 
		// 내림차순
		class MyComparator implements Comparator{ //java.util
			@Override
			public int compare(Object o1, Object o2) { 
				if(!(o1 instanceof String && o2 instanceof String)) {
					return -1; // 비교할게없다
				}
				String s1 = (String)o1;
				String s2 = (String)o2;
//				return s1.compareTo(s2);
				return s1.compareTo(s2)* -1; //음수양수 반대로 바꾸기
				
			} 
			
		}
		//메인 내부 지역
		MyComparator mc = new MyComparator();
//		System.out.println(mc.compare("abc", "def"));  // -3 음수 (첫번째가 작다)
//		System.out.println(mc.compare("def", "abc")); // 3 양수 (첫번째가 크다)
//		//def가 뒤에 나온다 = 크다 
//		System.out.println(mc.compare("abc", "abc"));//0  
		
		System.out.println(mc.compare("abc", "def")); //양수
		System.out.println(mc.compare("def", "abc")); //음수
		System.out.println(mc.compare("abc", "abc")); //0  
		
		Arrays.sort(animals,mc); // 오름차순인데, 기준값 추가 (-마이너스)
		System.out.println(Arrays.toString(animals));
		//[tiger, lion, dog, Snake]
		
		
//		compare 
//		o1 < o2  1
//		o1 > o2 -1
//		 = 0 
 	} 
}
