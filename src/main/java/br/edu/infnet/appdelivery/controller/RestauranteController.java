package br.edu.infnet.appdelivery.controller;

import br.edu.infnet.appdelivery.model.domain.Restaurante;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class RestauranteController {
	
	private static Map<Long, Restaurante> mapa = new HashMap<>();
	private static Long id = 1L;

	public static void incluir(Restaurante restaurante) {
		restaurante.setId(id++);
		mapa.put(restaurante.getId(), restaurante);
		
		System.out.println("> " + restaurante);
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Restaurante> obterLista(){
		return mapa.values();
	}
		
	@GetMapping(value = "/restaurante/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());

		return "restaurante/lista";
	}
	
	@GetMapping(value = "/restaurante/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		excluir(id);
		
		return "redirect:/restaurante/lista";
	}
}