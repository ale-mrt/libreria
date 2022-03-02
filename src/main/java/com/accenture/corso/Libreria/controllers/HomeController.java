package com.accenture.corso.Libreria.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.accenture.corso.Libreria.entities.Book;

@Controller
public class HomeController {
	@GetMapping({"", "/", "/home.html", "/home", "/index.html", "/index"})
	public String home() {  
		return "home.html";
	}
	
	@GetMapping({"/createPage.html", "/createPage"})
	public String createPage(Model m) {
		Book b = new Book();
		m.addAttribute("newBook", b);
		return "create.html";
	} 
	
	@GetMapping({"/readPage.html", "/readPage"}) 
	public String readPage() {
		return "read.html";    
	} 
	
	@GetMapping({"/updatePage.html", "/updatePage"})
	public String updatePage() {
		return "update.html";
	}
	
	@GetMapping({"/deletePage.html", "/deletePage"})
	public String deletePage() {
		return "delete.html";
	}
}
