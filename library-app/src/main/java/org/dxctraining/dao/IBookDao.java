package org.dxctraining.dao;

import org.dxctraining.entities.*;
import java.util.*;

public interface IBookDao {
	Book findById(String id);
	List<Book> findAll();
	Book updateCost(String id,double cost);
	void add(Book book);
	Book update(Book book);
	void delete(Book book);

}
