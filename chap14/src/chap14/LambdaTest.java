package chap14;

class MyThread implements Runnable {

	@Override
	public void run() {
		System.out.println("Runnable 구현 자식클래스 실행");
	}

}

public class LambdaTest {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
		t.start();

		// 2.
		class MyInnerThread implements Runnable {
			@Override
			public void run() {
				System.out.println("Runnable 구현 내부클래스 실행");
			}

		}// MyInnerThread
		Thread t2 = new Thread(new MyInnerThread());
		t2.start();

		// 무명클래스
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Runnable 구현 익명(무명)클래스 실행");
			}
		}).start();
		
//		Thread t3 = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("Runnable 구현 익명(무명)클래스 실행");
//			}
//		});
//		t3.start();
		
// 3. 무명클래스 정의 동시 객체 생성
//		Runnable r3 = new Runnable(){
//			@Override
//			public void run() {
//				System.out.println("Runnable 구현 익명(무명)클래스 실행");		
//			}
//			
//		}; //무명클래스
//		Thread t3 = new Thread(r3);
//		t3.start();
		
		
		
		// 람다식 - 함수형 인터페이스 (추상메소드 1개만) 
		// 구현해야할 인터페이스이름, 객체생성, 오버라이딩이름 생략
		Runnable r4 = () -> { System.out.println("람다식 실행");};
		//러너블의 런메소드 실행한다는뜻.
		Thread t4 = new Thread(r4);
		t4.start();
		
		
	}

}
