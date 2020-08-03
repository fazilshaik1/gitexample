package com.dxctraining;

public class RegularCustomer extends Customer {
	private String homeAddress;

	public RegularCustomer(String id, String name, Account account, String homeAddress) {
		super(id, name, account);
		this.homeAddress= homeAddress;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	

}
