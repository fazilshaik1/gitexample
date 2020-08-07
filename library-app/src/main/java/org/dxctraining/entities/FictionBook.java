package org.dxctraining.entities;

public class FictionBook extends Book {
	private String characterName;

	public FictionBook(String id, String name,Book book, Author author, double cost, String characterName) {
		super(id, name,book, author, cost);
		this.characterName = characterName;
	}

	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

}
