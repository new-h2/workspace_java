package chap6;

class D{
	
	int add(int i, int j){
		return i+j;
	}
	
	String add(String i, String j) {
		return i+j;
	}
	
	double add(double i , double j) {
		return i+j;
	}
}
public class OverloadTest {

	public static void main(String[] args) {
		D d1 = new D();
		
		//같은 이름이고 타입다르지만 각각  
		String result1 = d1.add("spring", "framework");
		double result2 = d1.add(2.5, 1.1);
		int result3 = d1.add(1,2);
		//자동 형변환 int => double 로바뀌어서 3번째 add로 계산됨
		double result4 = d1.add(3.14, 5);
		int result5 = d1.add(3, 'a');
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		System.out.println(result4);
		System.out.println(result5); // 100 ???
		
		int dec = Integer.parseInt("100");
		// "100" -> 10진수 정수변환
		int bin = Integer.parseInt("100", 2);
		//10을 2진수 변환
		//10진수 변환안되는 값 넣으면 numberFormatException
		System.out.println(dec); //100
		System.out.println(bin); //2진수 100은 10진수 4
		
		
	}

}
