package chap13;


class NumThread extends Thread {
	NumThread(String name){
		super(name); //Thread(String)생성자 호출 - 이름
		
	}
	@Override
	public void run() {
		// 1초마다 1-10숫자 출력
		for (int i = 1; i <= 10; i++) {
			System.out.println(getName()+" : "+ i);
			try {
				Thread.sleep(1000); // 1초 쉰다
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadTest3 {
// main + nt(sleep) 
	public static void main(String[] args) {
		NumThread nt1 = new NumThread("nt1"); // 어떤값인지 이름 넘겨서 
		NumThread nt2 = new NumThread("nt2");
		nt1.start(); // 동시실행 요청
		nt2.start();

	}

}
