package org.dxctraining.ui;

import java.util.*;
import org.dxctraining.dao.*;
import org.dxctraining.entities.*;
import org.dxctraining.exceptions.*;
import org.dxctraining.service.*;

public class BookMain {
	private IBookService service=new BookServiceImpl();
	
	public static void main(String args[]) {
		BookMain demo = new BookMain();
		demo.runApp();
	}

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
			service.add(book1);
			book1.getAuthor();
			String id1 = book1.getId();
			FictionBook book2 = new FictionBook("B-id2", name2,b2, author2, 600,"Lady Macbeth" );
			service.add(book2);
			book2.getAuthor();
			String id2 = book2.getId();
			FictionBook book3 = new FictionBook("B-id3", name3,b3, author3, 700,"Benedict" );
			service.add(book3);
			book3.getAuthor();
			String id3 = book3.getId();
			ItBook book4 = new ItBook("B-id4", name4,b4, author4, 400, "English", 1.0);
			service.add(book4);
			book4.getAuthor();
			String id4 = book4.getId();
			
			service.delete(book4.getBook());
			service.updateCost(book3.getId(), 2000);
			
			Book fetched = service.findById(id1);
			displayBook(fetched);
			
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
		if(book instanceof FictionBook) {
			FictionBook fb = (FictionBook)book;
			System.out.println("Character is "+fb.getCharacterName());
		}
		if(book instanceof ItBook) {
			ItBook ib = (ItBook)book;
			System.out.println("Language is "+ib.getLanguage()+" Version is "+ib.getVersion());
		}
		}

}
