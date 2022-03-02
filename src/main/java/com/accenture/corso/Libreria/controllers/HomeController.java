package com.accenture.corso.Libreria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.accenture.corso.Libreria.services.BookService;

@Controller
public class HomeController {
	@Autowired
	BookService bs;
	
	@GetMapping({"", "/", "home.html", "home", "index.html", "index"})
	public String home() {
		
		return "home.html";
	}
	
	@GetMapping({"create.html", "create"})
	public String create() {
		return "create.html";
	}
	
	@GetMapping({"read.html", "read"})
	public String read() {
		return "read.html";
	}
	
	@GetMapping({"update.html", "update"})
	public String update() {
		return "update.html";
	}
	
	@GetMapping({"delete.html", "delete"})
	public String delete() {
		return "home.html";
	}
}
