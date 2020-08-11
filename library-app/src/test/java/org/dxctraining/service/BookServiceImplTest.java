package org.dxctraining.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;
import java.util.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.dxctraining.entities.*;
import org.dxctraining.exceptions.*;
import org.dxctraining.dao.*;

class BookServiceImplTest {
	BookServiceImpl service;
	
	@BeforeEach
	public void init() {
		service = new BookServiceImpl();
	}
	
	@AfterEach
	public void clear() {
		Map<String,Book> store = BookLib.getStore();
				store.clear();
	}

	@Test
	public void test_1() {
		Executable executable=()->service.addBook(null);	
		 Assertions.assertThrows(InvalidBookArgumentException.class, executable);
		
	}
	@Test
	public void test_2() {
		 Author author1=new Author("A6","O henry");
		 Book b1=new Book(33);
		 String id="B-id6";
		 String name="After 20 years";
		 Book book1=new ItBook(id, name, b1, author1, 2020, "English", 3.0);
		 service.addBook(book1);
		 String savedId = book1.getId();
		 Map<String, Book> store = BookLib.getStore();
		 Collection<Book> collection = store.values();
		 Iterator<Book> iterator=collection.iterator();
		 Book savedBook=iterator.next();
		 String actualId=savedBook.getId();
		 Author actualAuthor=savedBook.getAuthor();
		 Assertions.assertEquals(savedBook.getId(),savedId);
		 Assertions.assertEquals(id,actualId);
		 Assertions.assertEquals(name,savedBook.getName());
		 Assertions.assertEquals(author1,actualAuthor);
	}

}
