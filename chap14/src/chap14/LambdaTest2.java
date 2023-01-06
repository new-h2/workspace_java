package chap14;

import java.util.Arrays;

@FunctionalInterface
interface Calculable{
//함수형 인터페이스 (**1개만있는것)
	int sum(int a, int b);
}
@FunctionalInterface
interface Myfunction{
	public int getValue(int x, int y);
}
@FunctionalInterface
interface GenericInterface<T>{
	public T getValue(T x, T y);
}


public class LambdaTest2 {
	
	
	static int test(Myfunction fu, int a, int b) {
		return fu.getValue(a, b);
	}

	public static void main(String[] args) {

		//test3 제너릭을통해 여러가지 타입을 받을 수 있다.
		
		GenericInterface <String> gen = (str1, str2) ->  str1+str2; 
		GenericInterface <Integer> gen2 = (str1, str2) ->  str1+str2; 
		String result = gen.getValue("람다", "식");
		int result2 = gen2.getValue(10,20);
		System.out.println("result " + result );
		System.out.println("result2 " + result2 );
		
		
		
		//test2 
		Myfunction mf = (x,y) -> x>y?x:y;
		//x와y중 비교해서 x가크면 x리턴 
		
		int maxValue = test(mf, 10, 5);
		System.out.println("maxValue의 값"+maxValue);
		
		
		
		
		
		//test1
		//람다식
		//무명메소드 = 함수형이 아니여도 만들수있고,람다는 함수형 인터페이스만 가능
		Calculable calc = null;
		calc  = new Calculable() { 
		//1. 함수형 인터페이스 무명 클래스 구현	
			@Override
			public int sum(int a, int b) {
				
				return a+b;
			}
		};
		System.out.println("무명클래스 "+calc.sum(11, 22));
		
		
		//2. 람다식
		
		//매겨변수 타입 유추, 생략
		calc  =(int a, int b) ->{ return a+b; };
		System.out.println("람다식 "+calc.sum(11, 47));
		
		// {} return키워드 생략
		calc = (a, b) ->  a+b ;
		System.out.println("람다식 "+calc.sum(11, 47));
		
		
		
	}
	
	
	
}
