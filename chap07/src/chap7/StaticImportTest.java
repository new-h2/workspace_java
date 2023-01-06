package chap7;

//import static java.lang.Math; Math변수와 메소드 사용허락
import static java.lang.Math.*; // Math static 변수와 메소드 사용허락
import static java.lang.Integer.*;

public class StaticImportTest {

	public static void main(String[] args) {	
//		int ran =(int)(random()*100)+1; //1에서 100까지
		int ran =(int)(random()*100)+1; //1에서 100까지
		System.out.println(ran);
//		System.out.println(Integer.MAX_VALUE);
		System.out.println(MAX_VALUE);
	}

}
