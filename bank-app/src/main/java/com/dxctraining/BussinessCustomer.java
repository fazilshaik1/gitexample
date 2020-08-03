package com.dxctraining;

public class BussinessCustomer extends Customer {
	private String bussinessAddress;

	public BussinessCustomer(String id, String name, Account account, String bussinessAddress) {
		super(id, name, account);
		this.bussinessAddress= bussinessAddress;
	}

	public String getBussinessAddress() {
		return bussinessAddress;
	}

	public void setBussinessAddress(String bussinessAddress) {
		this.bussinessAddress = bussinessAddress;
	}
	

}
