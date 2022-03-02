package com.accenture.corso.Libreria.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.accenture.corso.Libreria.entities.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer>{
	
}
