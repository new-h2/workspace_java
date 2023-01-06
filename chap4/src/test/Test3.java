package test;

public class Test3 {

	public static void main(String[] args) {

		int books=100;	//도서수
		int cntOfStu = 12; // 학생수
		
		// 12명의 학생에게 xx권씩 나누어 줍니다.
		// 남은 도서가 있으면 _남은책은 xx권 입니다.
		// 남은 도서가 없으면 _ 출력 x
		
		int sharebook = books/cntOfStu;
		int nambook = books%cntOfStu;
		
		//System.out.println(sharebook);
		
	
		if(nambook > 0) {
			System.out.printf("%d명의 학생에게 %d권씩 나누어 줍니다.",cntOfStu,sharebook);
			System.out.printf("남은책은 %d권입니다.",nambook);
		}else {
			System.out.printf("%d명의 학생에게 %d권씩 나누어 줍니다.",cntOfStu,sharebook);
			//System.out.println("남은책이 없습니다~");
		}
	
	
	}

}
