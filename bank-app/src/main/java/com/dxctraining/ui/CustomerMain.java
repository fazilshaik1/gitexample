package com.dxctraining.ui;

import java.util.*;
import com.dxctraining.*;

public class CustomerMain {
	private Map<String, Customer> store = new HashMap<>();
	
	public static void main(String args[]) {
		CustomerMain demo = new CustomerMain();
		demo.runApp();
	}

	private void runApp() {
		try {
			Account account1= new Account(500, "pan001");
			Account account2= new Account(1000,"pan002");
			Account account3= new Account(1500,"pan003");
			Account account4= new Account(2000,"pan004");
			final String name1= "Sravya", name2= "Harsha", name3= "Fazil", name4= "Bubbly";
			RegularCustomer customer1 = new RegularCustomer("id1", name1, account1,"Hyderabad");
			customer1.setAccount(account1);
			BussinessCustomer customer2 = new BussinessCustomer("id2", name2, account2,"Kurnool");
			customer2.setAccount(account2);
			RegularCustomer customer3 = new RegularCustomer("id3", name3, account3,"Bangalore");
			customer3.setAccount(account3);
			BussinessCustomer customer4 = new BussinessCustomer("id4", name4, account4,"Chennai");
			customer4.setAccount(account4);
			
			store.put(customer1.getId(), customer1);
			store.put(customer2.getId(), customer2);
			store.put(customer3.getId(), customer3);
			store.put(customer4.getId(), customer4);
			
			System.out.println("*****Displaying all the customers*****");
			displayAll();
		}catch (InvalidCustomerArgumentException e) {
			System.out.println("Customer is null");
		}catch (CustomerNotFoundException e) {
			System.out.println("Customer not found");
		}
		
	}

	public void displayAll() {
		Set<String> keys = store.keySet();
		for(String key:keys) {
			Customer current = store.get(key);
			boolean isRegCust = current instanceof RegularCustomer;
			if (isRegCust) {
				RegularCustomer rc = (RegularCustomer) current;
				display(rc);
			}
			boolean isBussCust = current instanceof BussinessCustomer;
			if (isBussCust) {
				BussinessCustomer bc = (BussinessCustomer) current;
				display(bc);
		}
		
	}

}


	public void display(RegularCustomer customer) {
		displayCustomer(customer);
		System.out.println("Home Address: "+customer.getHomeAddress());
		
	}
	public void display(BussinessCustomer customer) {
		displayCustomer(customer);
		System.out.println("Bussiness Address: "+customer.getBussinessAddress());
		
	}

	public void displayCustomer(Customer customer) {
		String id = customer.getId();
		String name = customer.getName();
		System.out.println("Id is "+id+" Name is "+name);
		Account account = customer.getAccount();
		System.out.println("Balance is "+account.getBalance()+" Pancard number is "+account.getPancard());
	}
		
		
	}


