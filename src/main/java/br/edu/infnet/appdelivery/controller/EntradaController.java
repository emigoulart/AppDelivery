package br.edu.infnet.appdelivery.controller;

import br.edu.infnet.appdelivery.model.domain.Entrada;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class EntradaController {

	private static final Map<Long, Entrada> mapa = new HashMap<>();
	private static Long id = 1L;

	public static void incluir(Entrada entrada) {
		entrada.setId(id++);
		mapa.put(entrada.getId(), entrada);
		
		System.out.println("> " + entrada);
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Entrada> obterLista(){
		return mapa.values();
	}
		
	@GetMapping(value = "/entrada/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());

		return "entrada/lista";
	}
	
	@GetMapping(value = "/entrada/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		excluir(id);
		
		return "redirect:/entrada/lista";
	}
}