package org.dxctraining.ui;

import java.util.List;

import javax.annotation.PostConstruct;

import org.dxctraining.entities.Author;
import org.dxctraining.entities.Book;
import org.dxctraining.entities.FictionBook;
import org.dxctraining.entities.ItBook;
import org.dxctraining.exceptions.BookNotFoundException;
import org.dxctraining.exceptions.InvalidBookArgumentException;
import org.dxctraining.service.BookServiceImpl;
import org.dxctraining.service.IBookService;
import org.springframework.stereotype.Component;

@Component
public class BookUi {
	private IBookService service=new BookServiceImpl();
	
	@PostConstruct
	public void runApp() {
		try {
			Author author1= new Author("A1","Herbert");
			Author author2= new Author("A2","Shakespeare");
			Author author3= new Author("A3","Conan Doyle");
			Author author4= new Author("A4","Balaguruswamy");
			Book b1 = new Book(11);
			Book b2 = new Book(123);
			Book b3 = new Book(234);
			Book b4 = new Book(372);
			final String name1="Core Java", name2="Macbeth", name3="Sherlock Holmes", name4="Programming in Ansi C";
			ItBook book1 = new ItBook("B-id1", name1,b1, author1, 500, "English", 8.0);
			service.addBook(book1);
			book1.getAuthor();
			FictionBook book2 = new FictionBook("B-id2", name2,b2, author2, 600,"Lady Macbeth" );
			service.addBook(book2);
			book2.getAuthor();
			FictionBook book3 = new FictionBook("B-id3", name3,b3, author3, 700,"Benedict" );
			service.addBook(book3);
			book3.getAuthor();
			ItBook book4 = new ItBook("B-id4", name4,b4, author4, 400, "English", 1.0);
			service.addBook(book4);
			book4.getAuthor();
			
			service.deleteBook(book4.getBook());
			service.updateBookCost(book3.getId(), 2000);
			
			
			System.out.println("*****Displaying all the books*****");
			displayAll();
			
		}catch (BookNotFoundException e) {
			e.printStackTrace();
			System.out.println("Book Not Found");
		}catch (InvalidBookArgumentException e) {
			System.out.println("Book id null");
		}
		
	}

	public void displayAll() {
		List<Book> list = service.findAll();
		for(Book book:list) {
			displayBook(book);
			}
		
	}

	public void displayBook(Book book) {
		String name = book.getName();
		String id = book.getId();
		double cost = book.getCost();
		System.out.println("Book name is "+name+" Id is "+id+" cost is "+cost);
		Author author = book.getAuthor();
		System.out.println("Author name is "+author.getName()+" Id is "+author.getId());
		}
		
	}
