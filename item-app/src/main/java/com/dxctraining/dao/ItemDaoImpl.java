package com.dxctraining.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import com.dxctraining.entities.Item;
import com.dxctraining.exceptions.ItemNotFoundException;

@Repository
public class ItemDaoImpl implements IItemDao {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Item findItem(int id) {
		Item item = entityManager.find(Item.class, id);
		if(item == null) {
			throw new ItemNotFoundException("Id is null");
		}
		return item;
	}

	@Override
	public Item updateItem(Item item) {
		item = entityManager.merge(item);
		return item;
	}

	@Override
	public void deleteItem(Item item) {
		Object id = entityManager.hashCode();
		item = entityManager.find(Item.class, id);
		entityManager.remove(item);
		
	}

}
