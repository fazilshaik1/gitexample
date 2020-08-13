package com.dxctraining.dao;

import com.dxctraining.entities.Item;

public interface IItemDao {
	public Item findItem(int id);
	Item updateItem(Item item);
	void deleteItem(Item item);

}
