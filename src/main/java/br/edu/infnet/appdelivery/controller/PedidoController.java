package br.edu.infnet.appdelivery.controller;

import br.edu.infnet.appdelivery.model.domain.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class PedidoController {
	
	private static Map<Long, Pedido> mapa = new HashMap<>();
	private static Long id = 1L;

	public static void incluir(Pedido pedido) {
		pedido.setId(id++);
		mapa.put(pedido.getId(), pedido);
		
		System.out.println("> " + pedido);
	}
	
	public static void excluir(Long id) {
		mapa.remove(id);
	}
	
	public static Collection<Pedido> obterLista(){
		return mapa.values();
	}
		
	@GetMapping(value = "/pedido/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());

		return "pedido/lista";
	}
	
	@GetMapping(value = "/pedido/{id}/excluir")
	public String exclusao(@PathVariable Long id) {

		excluir(id);
		
		return "redirect:/pedido/lista";
	}
}