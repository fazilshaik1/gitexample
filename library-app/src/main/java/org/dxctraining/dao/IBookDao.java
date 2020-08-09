package org.dxctraining.dao;

import org.dxctraining.entities.*;
import java.util.*;

public interface IBookDao {
	Book findBookId(String id);
	List<Book> findAll();
	Book updateBookCost(String id,double cost);
	void addBook(Book book);
	Book updateBook(Book book);
	void deleteBook(Book book);

}
