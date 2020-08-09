package org.dxctraining.service;

import java.util.*;
import org.dxctraining.entities.*;

public interface IBookService {
	List<Book> findAll();
	void addBook(Book book);
	Book updateBook(Book book);
	void deleteBook(Book book);
	Book updateBookCost(String id, double cost);
	Book findBookId(String id);
}
