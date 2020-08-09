package org.dxctraining.service;

import java.util.List;
import org.dxctraining.dao.*;
import org.dxctraining.exceptions.*;

import org.dxctraining.entities.Book;

public class BookServiceImpl implements IBookService {
	private IBookDao dao =new BookDaoImpl();

	@Override
	public List<Book> findAll() {
		List<Book> list = dao.findAll();
		return list;
	}

	@Override
	public void addBook(Book book) {
		checkBook(book);
		dao.addBook(book);
		
	}

	@Override
	public Book updateBook(Book book) {
		checkBook(book);
		book =dao.updateBook(book);
		return book;
	}

	@Override
	public void deleteBook(Book book) {
		checkBook(book);
		dao.deleteBook(book);
	}

	private void checkBook(Book book) {
		if(book==null) {
			throw new InvalidBookArgumentException("customer is null");
		}
	}

	@Override
	public Book updateBookCost(String id, double cost) {
		checkId(id);
		checkCost(cost);
		Book book=dao.updateBookCost(id, cost);
		return book;
	}

	private void checkCost(double cost) {
		if (cost<0) {
			throw new InvalidBookArgumentException("cost is negative");
		}
		
	}

	@Override
	public Book findBookId(String id) {
		checkId(id);
		Book book = dao.findBookId(id);
		return book;
	}

	private void checkId(String id) {
		if(id==null || id.isEmpty()) {
			throw new InvalidBookArgumentException("id is null");
				}
	}
	

}
