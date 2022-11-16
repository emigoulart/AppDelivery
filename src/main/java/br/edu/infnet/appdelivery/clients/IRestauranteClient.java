package br.edu.infnet.appdelivery.clients;

import br.edu.infnet.appdelivery.model.domain.Restaurante;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@FeignClient(url = "localhost:8081/api/restaurante", name = "restauranteClient")
public interface IRestauranteClient {

	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Restaurante restaurante);

	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Long id);

	@GetMapping(value = "/listar")
	public List<Restaurante> obterLista();

	@PostMapping(value = "/buscar")
	public Restaurante buscar(@RequestParam String nome);
}
