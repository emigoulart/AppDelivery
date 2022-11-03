package br.edu.infnet.appdelivery.controller;

import br.edu.infnet.appdelivery.model.domain.Cardapio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class CardapioController {
	
	private static Map<Long, Cardapio> mapa = new HashMap<>();
	private static Long id = 1L;

	public static void incluir(Cardapio cardapio) {
		cardapio.setId(id++);
		mapa.put(cardapio.getId(), cardapio);
		
		System.out.println("> " + cardapio);
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Cardapio> obterLista(){
		return mapa.values();
	}
		
	@GetMapping(value = "/cardapio/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());

		return "cardapio/lista";
	}
	
	@GetMapping(value = "/cardapio/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		excluir(id);
		
		return "redirect:/cardapio/lista";
	}
}