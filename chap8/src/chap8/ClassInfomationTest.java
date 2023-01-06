package chap8;

public class ClassInfomationTest {

	public static void main(String[] args) {
		// Class.forName(args[0]); // static (String 타입) //~라는 클래스 있니?
		
		
		// Class.forName("java.lang.Object"); -존재
		// Class.forName("chap8.CheckedTest"); -존재
		// Class.forName("chap8.A"); - 존재하지않음

		
		
//		try {
//			findClass();
//			System.out.println("존재해");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//			System.out.println("존재하지않습니다.");
//
//		}
//
//	}
//
//	public static void findClass() throws ClassNotFoundException {
//		Class.forName("java.lang.String");
//		Class.forName("클래스명");
//
//	}
	
		try {
			Class.forName(args[0]);
			System.out.println(args[0] + "-존재합니다");
		} catch (ClassNotFoundException e) {
			System.out.println(args[0] + "-존재하지않습니다");
		}
		
		
	}	
}
