package book;

public class Magazine extends Book {
	String month;

	public Magazine() {
	}

	public Magazine(String bookNo, String bookTitle, String bookAuthor, String bookYear, String bookPrice,
			String bookPublisher, String month) {
		super(bookNo, bookTitle, bookAuthor, bookYear, bookPrice, bookPublisher);
		this.month = month;
	}

	@Override
	public String toString() {
		return bookNo + bookTitle + bookAuthor + bookYear + bookPrice + bookPublisher + month;
	}

}
