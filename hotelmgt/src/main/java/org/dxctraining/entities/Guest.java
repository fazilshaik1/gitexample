package org.dxctraining.entities;

public class Guest {
	private String id;
	private String name;
	
	public Guest(String id, String name) {
		this.id = id;
		this.name = name;
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
	@Override
	public int hashCode() {
		int hash = id.hashCode();
		return hash;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null || !(obj instanceof Guest)) {
			return false;
		}
		Guest that = (Guest)obj;
		boolean equals = this.id == that.id;
		return equals;
		
	}

}
