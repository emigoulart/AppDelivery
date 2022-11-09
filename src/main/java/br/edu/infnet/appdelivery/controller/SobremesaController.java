package br.edu.infnet.appdelivery.controller;

import br.edu.infnet.appdelivery.model.domain.Sobremesa;
import br.edu.infnet.appdelivery.model.service.SobremesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class SobremesaController {

	@Autowired
	private SobremesaService sobremesaService;

	@PostMapping(value = "/sobremesa/incluir")
	public String incluir(Sobremesa sobremesa) {

		sobremesaService.incluir(sobremesa);

		return "redirect:/sobremesa/lista";
	}

	@GetMapping(value = "/sobremesa/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", sobremesaService.obterLista());

		return "sobremesa/lista";
	}
	
	@GetMapping(value = "/sobremesa/{id}/excluir")
	public String exclusao(@PathVariable Long id) {

		sobremesaService.excluir(id);
		
		return "redirect:/sobremesa/lista";
	}
}