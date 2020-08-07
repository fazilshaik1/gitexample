package org.dxctraining.entities;

public class Book {
	private String id;
	private String name;
	private Author author;
	private double cost;
	private Book book;
	private int bookno;
	
	public Book(String id, String name,Book book, Author author, double cost) {
		this.id = id;
		this.name = name;
		this.book = book;
		this.author = author;
		this.cost = cost;
	}
	
	public Book(int bookno) {
		this.bookno = bookno;
	}

	public int getBookno() {
		return bookno;
	}

	public void setBookno(int bookno) {
		this.bookno = bookno;
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

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	

}
