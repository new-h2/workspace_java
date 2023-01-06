package chap13;

class TimeThread extends Thread {
	public void run() {
		for (int i = 0; i <= 300; i++) {
			System.out.print("|");
		}
		System.out.println("소요시간1(1000분의 1초) =" + (System.currentTimeMillis() - ThreadTest2.startTime));
	}

	public class ThreadTest2 {
		static long startTime = 0;

		public static void main(String[] args) {

			TimeThread tt = new TimeThread();
			tt.start(); // cpu run실행 요청

			startTime = System.currentTimeMillis(); // 현재시간 / 1/1000초
			// 작업소요시간
			for (int i = 0; i <= 300; i++) {
				System.out.print("-");
			}
			System.out.print("소요시간1(1000분의 1초) = " + (System.currentTimeMillis() - startTime));

		}

	}

}
