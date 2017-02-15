package com.coutomariel.cobranca.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.coutomariel.cobranca.model.StatusTitulo;
import com.coutomariel.cobranca.model.Titulo;
import com.coutomariel.cobranca.repository.Titulos;

@Controller
public class TituloController {

	@Autowired
	private Titulos titulos;
	
	@GetMapping("/titulos")
	public ModelAndView novo(){
		ModelAndView mv = new ModelAndView("cadastro-titulos");
		return mv;
	}
	
	@PostMapping("/titulos")
	private ModelAndView salvar(Titulo titulo){
		titulos.save(titulo);
		ModelAndView mv = new ModelAndView("cadastro-titulos");
		mv.addObject("mensagem", "Título salvo com sucesso!");
		return mv;
	}
	
	
	@ModelAttribute("todosStatusTitulo")
	public List<StatusTitulo> todosStatusTitulo(){
		return Arrays.asList(StatusTitulo.values());
	}
}
