package chap8;

public class ExceptionTest {

	public static void main(String[] args) {
		//명령행인덱스 2개 이상 필요 , 정수 변경가능한 값
		// 정수/0 불가니까 두번째값은 0이 아니여야함
		
		//100 100 - 예외 없음 -끝
		//숫자 1개만 입력했을때 : java.lang.ArrayIndexOutOfBoundsException
		//Index 1 out of bounds for length 1
		//100 0  - 0으로 나눌수없다
		//Exception in thread "main" java.lang.ArithmeticException: / by zero 산수오류		//백 백 - 숫자가 아닌경우
		//java.lang.NumberFormatException: For input string: "백"
		int k =0; //자동초기화안됨
		
		try {
			int i = Integer.parseInt(args[0]);
			int j = Integer.parseInt(args[1]);
			k = i/j; 
			// 자동 ArithmeticException()
			// try중단
			//  catch 이동 -첫번째
		}catch (ArithmeticException e) { // 자식 예외처리 우선
			System.out.println("0은 입력하실 수 없습니다.");
		}finally {
			System.out.println("finally 항상 출력됩니다."); // 예외가 발생되지 않아도 실행
		}
//		catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
//			System.out.println("2개 이상의 값을 입력하지 않았거나 숫자값이 아닙니다.");
//		}
//		catch (Exception e) { // 부모 예외처리 나중
//			System.out.println("예외종류에 상관없이 동일처리");
//			
//		}
		
		/*catch (ArithmeticException e) { // 예외종류 
			// 예외발생시 대체문장
			System.out.println("0은 입력하실 수 없습니다.");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("2개 이상의 값을 입력하셔야합니다.");
		}catch(NumberFormatException e) {
			System.out.println("정수로 변경가능한 값을 입력하셔야합니다.");
			//e.printStackTrace(); // 오류 발생원인 출력해줘(자세히 알려준다)
			//e.getMessage(); // 오류 원인출력   
		}*/
		
		System.out.println("나누기 결과 = "+ k);
		System.out.println("main 종료");
		
	}

}
