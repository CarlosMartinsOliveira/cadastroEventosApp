package com.eventoapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EventoController {
	
	@RequestMapping(value="/cadastrarEvento", method=RequestMethod.GET)
	public String formEvento(){
		return "evento/formEvento";
	}
	

}
