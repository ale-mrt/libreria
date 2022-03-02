package com.accenture.corso.Libreria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
		bs.create(b);
		System.out.println("book " + b.toString() + " added to the database");
		
		return "read";
	} 
	  
	@GetMapping("/read")
	public String read(Model m) {
		m.addAttribute("books", bs.read());
		
		return "read";
	}
	
	@PostMapping("/update")
	@ResponseBody
	public String update(@ModelAttribute("updatedBook")Book b) {
		bs.deleteById(b.getId());
		bs.create(b);
		
		return "read";
	}
	
	@GetMapping("/delete")
	@ResponseBody
	public String delete(@ModelAttribute("deletedBook")Book b) {
		bs.delete(b);
		
		return "read";
	}
}
