package book;

public class Book {
	String bookNo, bookTitle, bookAuthor, bookYear, bookPrice, bookPublisher;

	public Book() {
	}

	public Book(String bookNo, String bookTitle, String bookAuthor, String bookYear, String bookPrice,
			String bookPublisher) {
		super();
		this.bookNo = bookNo;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookYear = bookYear;
		this.bookPrice = bookPrice;
		this.bookPublisher = bookPublisher;
	}

	@Override
	public String toString() {
		return bookNo + bookTitle + bookAuthor + bookYear + bookPrice + bookPublisher;
	}

}
 