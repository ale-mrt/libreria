package com.accenture.corso.Libreria.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping({"", "/", "home.html", "home", "index.html", "index"})
	public String home() {
		return "pages/home.html";
	}
	
	@GetMapping({"create.html", "create"})
	public String create() {
		return "pages/create.html";
	}
	
	@GetMapping({"read.html", "read"})
	public String read() {
		return "pages/read.html";
	}
	
	@GetMapping({"update.html", "update"})
	public String update() {
		return "pages/update.html";
	}
	
	@GetMapping({"delete.html", "delete"})
	public String delete() {
		return "pages/home.html";
	}
}
