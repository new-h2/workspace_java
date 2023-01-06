package chap13;

class JoinThread extends Thread {
	int i = 1;

	public void run() {
		i = 10;
		System.out.println("run 메소드 내부 = " + i);
	}
}

public class ThreadTest5 {
	public static void main(String[] args) {
		JoinThread t = new JoinThread();
		System.out.println(t.i); // 1 또는 10
		// 즉각 run실행이 안될수도 있다.
		// run이 될수있도록 (실행가능)상태로 만들어줘 - 바로run아님 + main실행상태

		t.start(); // t:실행가능상태 main:실행상태
		try {
			t.join();
			// t:실행상태 main:실행중단상태
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("main 메소드내부 = " + t.i); // 10
			System.out.println("main종료");
		}
	}
}