package br.edu.infnet.appdelivery.controller;

import br.edu.infnet.appdelivery.model.domain.Restaurante;
import br.edu.infnet.appdelivery.model.domain.Usuario;
import br.edu.infnet.appdelivery.model.service.RestauranteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.util.HashMap;
import java.util.Map;

@Controller
public class RestauranteController {
	
	private static Map<Long, Restaurante> mapa = new HashMap<>();
	private static Long id = 1L;

	@Autowired
	private RestauranteService restauranteService;

	@PostMapping(value = "/restaurante/incluir")
	public String incluir(Restaurante restaurante, @SessionAttribute("user") Usuario usuario) {

		restaurante.setUsuario(usuario);

		restauranteService.incluir(restaurante);

		return "redirect:/restaurante/lista";
	}

	@GetMapping(value = "/restaurante")
	public String telaCadastro() {
		return "restaurante/cadastro";
	}
	@GetMapping(value = "/restaurante/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", restauranteService.obterLista());

		return "restaurante/lista";
	}
	
	@GetMapping(value = "/restaurante/{id}/excluir")
	public String excluir(@PathVariable Long id) {

		restauranteService.excluir(id);
		
		return "redirect:/restaurante/lista";
	}
}