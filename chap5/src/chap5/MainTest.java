package chap5;

public class MainTest {
	public static void main(String[] args) {
		System.out.println("입력한 변수의 갯수=" + args.length);
		System.out.println("입력한 내용은 다음과 같습니다.");
		for(int i =0; i< args.length; i++) {
			System.out.println(args[i]);
		}
		//입력변수 갯수 +1 크기를 가진 배열 생성
//		String userarray[] = new String[args.length+1];
//		
//		
//		for(int i =0; i < args.length; i++) {
//			userarray[i] = args[i]; // 입력받은 변수 복사
//			System.out.println(userarray[i]);
//			
//		}
//		
//		System.out.println("========================");
//		userarray[args.length] ="내가 추가한 문자열";
//		
//		for(int i =0; i < userarray.length; i++) {
//			System.out.println(userarray[i]);
//			
//		}
		
		//100 45 정수이고싶은데 String 타입이다
		// Integer.ParseInt
		// Integer.MAX_VALUE
		System.out.println(args[0]+ args[1]); //10045
		System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));//145
		//Double.parseDouble(args[0]); 실수형이고 실수로 바꾸고싶을때
		
		
		String s1 = "java";
		String s3 = new String("java");
		String s2 = "java";
		String s4 = new String("java");
		
		s2 ="jsp";
		//명령형매개변수, 문자열 1번 메모리 생성 되어지는 순간
		
		if(s1 == s2) { //true
			System.out.println("s1 == s2 주소값 같다 ");
		}
		
		if(s3 != s4) { 
			System.out.println("s3 != s4 결과같지않다. ");
		}
		
		if(s1.equals(s2)) {
			System.out.println("s1 equals s2 결과같다. ");
		}
		if(s3.equals(s4)) {
			System.out.println("s3 equals s4 결과같다. ");	
			}
		
	}

}
