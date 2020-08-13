package com.dxctraining.service;

import com.dxctraining.entities.Item;

public interface IItemService {
	public Item findItem(int id);
    Item updateItem(Item item);
    void deleteItem(Item item);

}
