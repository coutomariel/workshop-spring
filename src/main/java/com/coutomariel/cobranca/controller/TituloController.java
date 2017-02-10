package com.coutomariel.cobranca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TituloController {

	@GetMapping("/titulos")
	public String novo(){
		return "cadastro-titulos";
	}
}
