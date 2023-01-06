package test;

import java.util.Arrays;

class Book{
	
	private String title;
	private int price;
	
	public String getTitle() {
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
	
	
	
	public Book() {
		
	}
	
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
//		System.out.println(this.title);
//		System.out.println(title);
		
	}
	
	
	
}


class BookMgr extends Book{
	
	Book[] booklist;
	
	public BookMgr(Book[] booklist) {
		this.booklist = booklist;
		
		
	}
	public void printBooklist() {
//		System.out.println(super.getTitle());

		for(int i =0; i< booklist.length;i++) {
			System.out.println(booklist[i].getTitle());
		}
		
	}
	public void printTotalPrice() {
//		System.out.println(super.getPrice());
		int sum =0;
		for(int i =0; i< booklist.length;i++) {
			//System.out.println(booklist[i].getPrice());
			  sum += booklist[i].getPrice();
		}
		System.out.println(sum);
		
	}

}

	
public class BookStore {
	public static void main(String[] args) {
		Book booklist[] = new Book[5];

		Book book1 = new Book("Java Program", 25000);
		Book book2 = new Book("JSP Program", 15000);
		Book book3 = new Book("SQL Fundamentals", 30000);
		Book book4 = new Book("JDBC Program", 28000);
		Book book5 = new Book();
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
