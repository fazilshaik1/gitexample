package org.dxctraining.dao;

import java.util.HashMap;
import java.util.Map;

import org.dxctraining.entities.Book;
import org.springframework.stereotype.Repository;
@Repository
public class BookLib {
	private static Map<String, Book> store = new HashMap<>();
	public static Map<String, Book> getStore(){
		return store;
	}

}
