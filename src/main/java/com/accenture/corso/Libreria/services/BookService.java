package com.accenture.corso.Libreria.services;

import java.util.ArrayList;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.corso.Libreria.entities.Book;
import com.accenture.corso.Libreria.repositories.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository br;
	
	public Iterable<Book> read(){
		ArrayList<Book> books = (ArrayList<Book>) br.findAll();
		Collections.sort(books);
		return books;
	}
	
	public Book create(Book b) {
		return br.save(b);
	}
	
	public boolean update(Book b) {
		try {
			br.deleteById(b.getId());
			br.save(b);
			return true; 
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean delete(Book b) {
		try {
			br.delete(b);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean deleteById(Integer id) {
		try {
			br.deleteById(id);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
}
