package chap6;

class Data {
	int k = 10;
}

class C {
	void add(int i) { // 매개변수 = 입력변수
		System.out.println(i++);
		System.out.println("C의 j의 값:" + i);

	}

	void addData(Data d) { // 참조형 매개변수
		System.out.println(d.k++);
	}

}

public class CallByValueTest {

	public static void main(String[] args) {

		C c1 = new C();
		int j = 10;
		c1.add(j); // 인수 = 실제로 매개변수로 전달값
		System.out.println("main add종료 후 j의 값:" + j);

		Data main_d = new Data();
		c1.addData(main_d);
		System.out.println("main에서 addData 종료후 main_d = " + main_d.k);

	}

}
