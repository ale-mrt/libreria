package com.accenture.corso.Libreria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.accenture.corso.Libreria.entities.Book;
import com.accenture.corso.Libreria.services.BookService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class BookController {
	@Autowired
	BookService bs;
	
	@PostMapping("/create")
	public String create(@ModelAttribute("newBook")Book b) {
		System.out.println(b);
		return "";
	}
	  
	@GetMapping("/read")
	public String read() {
		return "";
	}
	
	@PostMapping("/update")
	public String update() {
		return "";
	}
	
	@GetMapping("/delete")
	public String delete() {
		return "";
	}
}
