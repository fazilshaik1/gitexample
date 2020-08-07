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
		return null;
	}

	@Override
	public void add(Book book) {
		checkBook(book);
		dao.add(book);
		
	}

	@Override
	public Book update(Book book) {
		checkBook(book);
		book =dao.update(book);
		return book;
	}

	@Override
	public void delete(Book book) {
		checkBook(book);
		dao.delete(book);
	}

	private void checkBook(Book book) {
		if(book==null) {
			throw new InvalidBookArgumentException("customer is null");
		}
	}

	@Override
	public Book updateCost(String id, double cost) {
		checkId(id);
		checkCost(cost);
		Book book=dao.updateCost(id, cost);
		return book;
	}

	private void checkCost(double cost) {
		if (cost<1) {
			throw new InvalidBookArgumentException("cost is negative");
		}
		
	}

	@Override
	public Book findById(String id) {
		checkId(id);
		Book book = dao.findById(id);
		return book;
	}

	private void checkId(String id) {
		if(id==null) {
			throw new InvalidBookArgumentException("id is null");
				}
	}
	

}
