package chap13;

import java.util.Date;
import java.util.function.Function;
import java.text.SimpleDateFormat;

//1개 서버 - 다수개 클라이언트 요청 - 처리
public class Server {
	public static void main(String[] args) {
		LoginClient c1 = new LoginClient("java", "java");
		LoginClient c2 = new LoginClient("java", "1234");
		RegisterClient c3 = new RegisterClient(new Date());
		BoardClient c4 = new BoardClient();

//		c1.start();
//		c2.start();
//		c3.start();
//		c4.start();
		
		//리턴타입, 매개변수 없는 람다식활용
		Thread c5 = new Thread( () -> {System.out.println("람다쓰레드");});
		c5.start();
		// 리턴타입, 매개변수 있는 람다식
		// 날짜포맷 매개변수 전달하면 
		Function<String, String> mydate =
			str -> new SimpleDateFormat(str).format(new Date());
			String now = mydate.apply("yyyy년 MM월 dd일"); // 람다apply 메소드 **
			System.out.println(now);
	}
}

//2.생성자 정의/ 필드변수 정의
class LoginClient extends Thread {
	String id, pw;

	public LoginClient(String id, String pw) {

		/*
		 * main 전달 id=java, pw=java 로그인아이디xxxx를 입력받습니다 로그인암호를 확인합니다 pw=java이면 로그인암호 맞습니다
		 * 아니면 로그인암호 올바르지 않습니다
		 */
		super();
		this.id = id;
		this.pw = pw;
	}

	public void run() {
		System.out.printf("로그인 아이디 %s를 입력받습니다\n로그인암호를 확인합니다 \n", id);
		if (pw.equals("java")) {
			System.out.println("로그인 암호가 맞습니다");
		} else {
			System.out.println("로그인 암호가 올바르지 않습니다.");
		}

	}

}

class RegisterClient extends Thread {
	/*
	 * main 전달 Date 객체 xxx년도 xx월 xx일에 회원가입요청합니다 회원가입요청 처리중입니다 3초 일시 중지 회원가입요청
	 * 처리완료입니다
	 */

	String datestr;

	public RegisterClient(Date date) {
		datestr = new SimpleDateFormat("yyyy년도 MM월 dd일").format(date);
	}
	@Override
	public void run() {
		System.out.println(datestr + "에 회원가입요청합니다.\n회원가입 요청 처리중입니다.");
		try {
			Thread.sleep(3000); // 3초 일시정지
		} catch (InterruptedException e) {
		}
		System.out.println("회원가입요청 처리완료입니다.");
	}
}
	class BoardClient extends Thread {

		@Override
		// 1.어노테이션 modifier 같거나 더 넓고 리턴타입이름 매개변수 일치.
		// 2.부모클래스 throws예외보다 더 많은 종류예외 throws불가
		public void run() {
			for (int i = 1; i <= 6; i++) {
				System.out.printf("게시물 %d번 작성합니다 \n",i);
				try {
					Thread.sleep(5000);
				} catch (Exception e) {
				}
			}

		}

	}

/* 5번 반복 : 0.5초마다 게시물 x번작성합니다 */

/*
 * 실행예시 로그인아이디java를 입력받습니다 로그인암호를 확인합니다 게시물 1 번작성합니다 로그인아이디java를 입력받습니다 로그인암호를
 * 확인합니다 로그인암호 올바르지 않습니다 2022년도 12월 20일에 회원가입요청받았습니다 게시물 2 번작성합니다 로그인암호 맞습니다 게시물
 * 3 번작성합니다 회원가입요청 처리중입니다 게시물 4 번작성합니다 게시물 5 번작성합니다 게시물 5개 작성 종료합니다. 회원가입요청
 * 처리완료입니다
 */
