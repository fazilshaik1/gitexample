package com.dxctraining;

public class Customer {
	private String id;
	private String name;
	private Account account;
	
	public Customer(String id, String name, Account account) {
		this.id= id;
		this.name= name;
		this.account= account;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
 
}
