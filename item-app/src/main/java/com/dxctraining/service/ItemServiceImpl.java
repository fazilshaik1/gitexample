package com.dxctraining.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxctraining.dao.*;
import com.dxctraining.entities.Item;
import com.dxctraining.exceptions.InvalidItemException;

@Transactional
@Service
public class ItemServiceImpl implements IItemService {
	@Autowired
	private IItemDao dao;

	@Override
	public Item findItem(int id) {
		checkId(id);
		Item item = dao.findItem(id);
		return item;
	}

	private void checkId(int id) {
		if(id<0) {
			throw new InvalidItemException("Id should not be negative");
		}
		
	}

	@Override
	public Item updateItem(Item item) {
		item = dao.updateItem(item);
		return item;
	}

	@Override
	public void deleteItem(Item item) {
		int id = dao.hashCode();
		item = dao.findItem(id);
		dao.deleteItem(item);
		
	}
	

}
