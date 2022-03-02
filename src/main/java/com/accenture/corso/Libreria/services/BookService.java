package com.accenture.corso.Libreria.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.corso.Libreria.entities.Book;
import com.accenture.corso.Libreria.repositories.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository br;
	
	public Iterable<Book> read(){
		return br.findAll();
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
	
}
