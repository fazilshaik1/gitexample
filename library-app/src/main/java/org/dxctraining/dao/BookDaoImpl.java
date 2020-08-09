package org.dxctraining.dao;

import java.util.*;
import org.dxctraining.entities.*;
import org.dxctraining.exceptions.*;

public class BookDaoImpl implements IBookDao {
	private Map<String,Book> store = new HashMap<>();
	private int generateid;
	
	public String generateid() {
		generateid++;
		String str=String.valueOf(generateid);
		return str;
	}

	@Override
	public Book findBookId(String id) {
		Book book=store.get(id);
		if(book==null) {
			throw new BookNotFoundException("book id is null");
		}
		return book;
	}

	@Override
	public List<Book> findAll() {
		Collection<Book> collection=store.values();
		List<Book> list=new ArrayList<>();
		for(Book books: collection) {
			list.add(books);
		}
		return list;
	}

	@Override
	public Book updateBookCost(String id, double cost) {
		Book book=findBookId(id);
		book.setCost(cost);
		return book;
	}

	@Override
	public void addBook(Book book) {
		String id=book.getId();
		store.put(id, book);
		book.setId(id);
		
	}

	@Override
	public Book updateBook(Book book) {
		String id=book.getId();
		return book;
	}

	@Override
	public void deleteBook(Book book) {
		store.remove(book);
	}
	

}
