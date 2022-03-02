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
	
	public Book(Integer id, String title, String author, String genre, int pages) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.pages = pages;
	}
	
	public Book(String title, String author, String genre, int pages) {
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.pages = pages;
	}
	
	public Book() {
		
	}
	
	@Column(name="id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name="title")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	@Column(name="author")
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Column(name="genre")
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	@Column(name="pages")
	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", genre=" + genre + ", pages=" + pages
				+ "]";
	}
}
