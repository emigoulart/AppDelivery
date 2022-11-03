package br.edu.infnet.appdelivery.controller;

import br.edu.infnet.appdelivery.model.domain.Sobremesa;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class SobremesaController {
	
	private static Map<Long, Sobremesa> mapa = new HashMap<Long, Sobremesa>();
	private static Long id = 1L;

	public static void incluir(Sobremesa sobremesa) {
		sobremesa.setId(id++);
		mapa.put(sobremesa.getId(), sobremesa);
		
		System.out.println("> " + sobremesa);
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Sobremesa> obterLista(){
		return mapa.values();
	}
		
	@GetMapping(value = "/sobremesa/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());

		return "sobremesa/lista";
	}
	
	@GetMapping(value = "/sobremesa/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		excluir(id);
		
		return "redirect:/sobremesa/lista";
	}
}