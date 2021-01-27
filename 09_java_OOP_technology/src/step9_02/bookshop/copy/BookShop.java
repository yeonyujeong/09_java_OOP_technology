package step9_02.bookshop.copy;

import java.util.Date;

public class BookShop {

	public static void main(String[] args) {
		
		BookList bookList =  new BookList();
		
		BookVO book1 = new BookVO("자바1", "홍길동", "코리아출판사", new Date(), 18000);
		BookVO book2 = new BookVO("자바2", "홍길자", "코리아출판사", new Date(), 21500);
		BookVO book3 = new BookVO("자바3", "홍길숙", "코리아출판사", new Date(), 68400);
		
		bookList.addBook(book1);
		bookList.addBook(book2);
		bookList.addBook(book3);
		
		bookList.addBook(new BookVO("자바4", "홍길희", "코리아출판사", new Date(), 15168));
		bookList.addBook(new BookVO("자바5", "홍길희", "코리아출판사", new Date(), 25168));
		bookList.addBook(new BookVO("자바6", "홍길희", "코리아출판사", new Date(), 25800));
		
		System.out.println(bookList);
	}
}









