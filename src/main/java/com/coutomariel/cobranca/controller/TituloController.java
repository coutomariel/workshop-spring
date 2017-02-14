package com.coutomariel.cobranca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.coutomariel.cobranca.model.Titulo;
import com.coutomariel.cobranca.repository.Titulos;

@Controller
public class TituloController {

	@Autowired
	private Titulos titulos;
	
	@GetMapping("/titulos")
	public String novo(){
		return "cadastro-titulos";
	}
	
	@PostMapping("/titulos")
	private String salvar(Titulo titulo){
		titulos.save(titulo);
		return "cadastro-titulos";
	}
}
