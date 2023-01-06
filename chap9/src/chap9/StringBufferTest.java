package chap9;

public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer("초기값");
		StringBuffer sb3 = new StringBuffer(100);
		
		System.out.println("sb1의 용량= "+ sb1.capacity()); //초기생성시 저장공간용량
		System.out.println("sb2의 용량= "+ sb2.capacity()); 
		System.out.println("sb3의 용량= "+ sb3.capacity()); 
		
		System.out.println("sb1문자열갯수="+sb1.length());
		System.out.println("sb2문자열갯수="+sb2.length()); //3
		System.out.println("sb3문자열갯수="+sb3.length());
		sb2.append("추가한값");//4개추가
		sb2.append("추가한값");
		sb2.append("추가한값");
		sb2.append("추가한값");
		sb2.append("추가한값");
		sb2.append("추가한값");
		
		System.out.println("문자열 추가 후 sb2문자열갯수="+sb2.length()); //4
		System.out.println("문자열 추가 후 sb2의 용량= "+ sb2.capacity()); 
		
		sb2.delete(0, 10); // (0-9개, 10개 문자사라짐) 
		System.out.println("삭제후 sb2문자열갯수="+sb2.length()); 
		System.out.println("삭제후 sb2의 용량= "+ sb2.capacity()); 
		
		System.out.println(sb2.reverse()); //값한가추값한가추값한가추값한가추값 -역순으로 출력
		
//		String s2 = new String("초기값");
//		System.out.println(s2.length());
//		System.out.println(s2 +"추가한값");
//		System.out.println(s2.length());
		
		
	}

}
