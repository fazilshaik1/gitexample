package com.dxctraining.ui;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dxctraining.entities.Item;
import com.dxctraining.service.IItemService;

@Component
public class ItemUi {
	@Autowired
	private IItemService service;
	
	@PostConstruct
	public void runApp() {
		try {
		Item item1 = new Item(001, "iphone X");
		Item item2 = new Item(002, "Oneplus 8");
		Item item3 = new Item(003, "hp elitebook");
		
		Item fetched = service.findItem(item1.getId());
		System.out.println("Id is "+fetched.getId()+" item name is "+fetched.getName());
		
	}catch (Exception e ) {
		e.printStackTrace();
	}
	}

}
