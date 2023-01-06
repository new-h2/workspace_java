package test;

class Book{
	//1. 책 제목(title)과 가격(price)정보를 저장하는 멤버변수가 있어야 한다.
	//2. 멤버변수는 모두 private 접근제한자를 가져야 한다. 
	private String title;
	private int price;
	
	//4. 멤버변수에 값을 설정하고 리턴하는 setter/getter 메서드가 있어야 한다.
	public String getTitle() { // 다른패키지에 있다면 public선언 필수
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public Book() { // 기본생성자
		
	}
	//3. 멤버변수를 모두 초기화하는 생성자 가 있어야 한다.
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
//		System.out.println(this.title);
//		System.out.println(title);
		
	}
	
}

class BookMgr extends Book{
	Book[] booklist;
		//1. 책(Book) 객체 여러 개를 저장할 수 있는 책 목록(booklist)이라는 배열을 멤버변수로 가져야 한다. 
	public BookMgr(Book[] booklist) {
		//	2. 책 목록(booklist)이라는 배열 변수를 초기화하는 생성자 메서드를 작성해야 한다. 
		this.booklist = booklist;
		
	}
	
	
	public void printBooklist() {
		for(int i =0; i< booklist.length;i++) {
			System.out.println(booklist[i].getTitle());
		//Book b = booklist[i];
		//System.out.println(b.getTitle()+ ":"+b.getPrice());
		}
		
	}
	public void printTotalPrice() {
		int totalPrice = 0; // 지역변수 명시적 초기화
		
		for(int i =0; i< booklist.length;i++) {
			//System.out.println(booklist[i].getPrice());
			totalPrice += booklist[i].getPrice();
		}
		System.out.println(totalPrice);
		
	}

}

	
public class BookStore {
	public static void main(String[] args) {
		Book booklist[] = new Book[5];

		Book book1 = new Book("Java Program", 25000);
		Book book2 = new Book("JSP Program", 15000);
		Book book3 = new Book("SQL Fundamentals", 30000);
		Book book4 = new Book("JDBC Program", 28000);
		Book book5 = new Book(); //  
		book5.setTitle("EJB Program");
		book5.setPrice(34000);
		
		
		booklist[0] = book1;
		booklist[1] = book2;
		booklist[2] = book3;
		booklist[3] = book4;
		booklist[4] = book5;
		//System.out.println(Arrays.toString(booklist));
		
		
		BookMgr mgr = new BookMgr(booklist);
		System.out.println("=== 책 목록 ===");
		mgr.printBooklist();
		System.out.println("=== 책 가격의 총합 ===");
		mgr.printTotalPrice();
	}
}
