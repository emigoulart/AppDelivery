package br.edu.infnet.apirestaurante.controller;

import br.edu.infnet.apirestaurante.model.domain.Restaurante;
import br.edu.infnet.apirestaurante.model.service.RestauranteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/restaurante")
public class RestauranteController {
	
	@Autowired
	private RestauranteService restauranteService;

	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Restaurante restaurante) {
		restauranteService.incluir(restaurante);
	}
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Long id) {
		restauranteService.excluir(id);
	}
	
	@GetMapping(value = "/listar")
	public List<Restaurante> obterLista(){

		return restauranteService.obterLista();
	}
	
	@PostMapping(value = "/buscar")
	public Restaurante buscar(@RequestParam String nome) {

		return restauranteService.buscar(nome);
	}
}
