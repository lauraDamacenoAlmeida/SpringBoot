package com.eventoapp.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventoController {
	
	@RequestMapping("/cadastrar")
	public String form() {
		return "eventos/formEvento";
	}

}
