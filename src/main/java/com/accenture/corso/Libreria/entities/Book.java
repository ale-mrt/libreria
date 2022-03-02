package com.accenture.corso.Libreria.entities;

import javax.persistence.*;

@Entity
@Table(name="books")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private String author;
	private String genre;
	private int pages;
	private double price;
	
	public Book(Integer id, String title, String author, String genre, int pages, double price) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.pages = pages;
		this.price = price;
	}
	
	public Book(String title, String author, String genre, int pages, double price) {
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.pages = pages;
		this.price = price;
	}
	
	public Book() {
		
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() { 
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public double getPrice() {
		return price;
	} 

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", genre=" + genre + ", pages=" + pages
				+ "]";
	}
	
	public String getStringBook() {
		return this.id+","+this.title+","+this.author+","+this.genre+","+this.pages+","+this.price;
	}
}
