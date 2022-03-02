package com.accenture.corso.Libreria.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {
	@PostMapping("/create()")
	public String create() {
		return "";
	}
	  
	@GetMapping("/read()")
	public String read() {
		return "";
	}
	
	@PostMapping("/update()")
	public String update() {
		return "";
	}
	
	@GetMapping("/delete()")
	public String delete() {
		return "";
	}
}
