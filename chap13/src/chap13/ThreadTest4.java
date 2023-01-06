package chap13;

import javax.swing.JOptionPane;

class NumberThread extends Thread {
	@Override
	public void run() {
		// 1초마다 1-10숫자 출력
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000); // 1초 쉰다
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadTest4 {
// main + nt(sleep) 
	public static void main(String[] args) {
		NumberThread nt = new NumberThread();
		nt.start();

		String input = JOptionPane.showInputDialog("값 입력해 보세요");
		System.out.println("입력값 = " + input);
	}

}
