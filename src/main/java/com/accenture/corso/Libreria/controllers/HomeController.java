package com.accenture.corso.Libreria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.accenture.corso.Libreria.services.BookService;

@Controller
public class HomeController {
	@Autowired
	BookService bs;
	
	@GetMapping({"", "/", "/home.html", "/home", "/index.html", "/index"})
	public String home() {  
		return "home.html";
	}
	
	@GetMapping({"/createPage.html", "/createPage"})
	public String createPage() {
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
