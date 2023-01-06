package test;


class MySum {
	int first;
	int second;

	MySum(int first, int second) {
		this.first = first;
		this.second = second;
	}

	/* 조건1 */
	@Override
	public String toString() {
		int result = first + second;
		String result2 = String.valueOf(result);
		return result2;
	}

	/* 조건2 */

	@Override
	public boolean equals(Object obj) { //ms2

		if (obj instanceof MySum) { //obj ms1
			// message.equals(((MyObject)obj).message); 
			//ms1.equals(ms2)비교하고싶은데 
			//계산한값이 ms1이고 지역변수라 result사용불가
			//toString하면 값을 가져오니까 변수에 담고
			//넘어온 매개변수 obj를 MySum형변환해서 toString 값가져오고
			//변수에 담아서 equals해서 비교후 return
			String ss1 = /*this.*/toString(); 
			String ss2 = ((MySum)obj).toString();
			boolean result =ss1.equals(ss2);
			
			return true;
		} else {
			return false;
		}

	}

}

public class ObjectTest {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;

		MySum ms1 = new MySum(i, j);
		MySum ms2 = new MySum(i, j);
		String s1 =new String("30");
		
		System.out.println(ms1); 
		System.out.println(ms2);
//		ms1.equals(ms2) 호출 결과는 true입니다. object
//		ms1.equals(s1) 호출 결과는 false입니다. obj != string

		
		if (ms1.equals(ms2)) {
			System.out.println("ms1과 ms2의 합계는 동일합니다.");

		}
	}
}
