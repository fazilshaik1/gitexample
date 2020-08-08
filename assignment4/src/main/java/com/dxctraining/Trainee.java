package com.dxctraining;

public class Trainee {
	private int id;
	private String name;

	public Trainee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		int hash = name.hashCode();
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj == null || !(obj instanceof Trainee)) {
			return false;
		}
		Trainee that = (Trainee) obj;
		boolean isequal = this.id == that.id;
		return isequal;

	}

}
