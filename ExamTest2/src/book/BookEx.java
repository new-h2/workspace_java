package book;

public class BookEx {
	public static void main(String[] args) {
//		- Book, Magazine 클래스 객체 6개를 저장한 배열 생성
//		- 아래 그림과 같이 값을 저장하여 초기화
//		- 아래 그림과 같이 데이터 출력

		//Book bk = new Book();
		//Magazine mz = new Magazine();
		Book list[] = new Book[6];
		
		list[0] = new Book("BOO1 ","자바프로그래밍	","홍길동	", "2021	","30000	","서울출판사");
		list[1] = new Book("BOO2 ","데이터베이스	","이몽룡	", "2020	","25000	","대한출판사");
		list[2] = new Book("BOO3 ","HTML/CSS	","성춘향	", "2022	","18000	","민국출판사");
		list[3] = new Magazine("MOO1 ","자바 월드	","홍길동	", "2021	","3000	","서울출판사	","5");
		list[4] = new Magazine("MOO2 ","웹 월드	","이몽룡	", "2021	","2500	","서울출판사	","7");
		list[5] = new Magazine("MOO3 ","게임 월드	","성춘향	", "2022	","1800	","서울출판사	","9");
		//String bookNo, bookNo, bookAuthor, bookYear, bookPrice, bookPublisher;

		System.out.println("도서번호	도서명	저자	출판년도	가격	출판사	발행월");
		System.out.println("--------------------------------------------------------");
		for(int i =0; i< list.length; i++) {
			System.out.println(list[i].toString()); 
			
		}
	}
}
