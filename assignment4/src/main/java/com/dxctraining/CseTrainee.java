package com.dxctraining;

public class CseTrainee  extends Trainee {
	private int languages;

	public CseTrainee(int id, String name, int languages) {
		super(id, name);
		this.languages = languages;
	}

	public int getLanguages() {
		return languages;
	}

	public void setLanguages(int languages) {
		this.languages = languages;
	}
	

}
