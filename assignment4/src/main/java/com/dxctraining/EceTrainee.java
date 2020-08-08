package com.dxctraining;

public class EceTrainee extends Trainee {
	private String device;
	
	public EceTrainee(int id, String name, String device) {
		super(id, name);
		this.device = device;
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

}
