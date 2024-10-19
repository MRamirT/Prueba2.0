package com.cibertec.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Cliente")
public class ClienteController {

	
	public String inicio() {
		return "/cliente/inicio";
	}
	
	@GetMapping("/crear")
	public String crear() {
		return "/cliente/crear";
	}
	
	
}
