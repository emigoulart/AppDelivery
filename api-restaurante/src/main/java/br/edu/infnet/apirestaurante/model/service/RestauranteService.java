package br.edu.infnet.apirestaurante.model.service;

import br.edu.infnet.apirestaurante.model.domain.Restaurante;
import br.edu.infnet.apirestaurante.model.repository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestauranteService {
	
	@Autowired
	private RestauranteRepository restauranteRepository;

	public void incluir(Restaurante restaurante) {
		restauranteRepository.save(restaurante);
	}

	public void excluir(Long id) {
		restauranteRepository.deleteById(id);
	}

	public List<Restaurante> obterLista(){

		return (List<Restaurante>) restauranteRepository.findAll();
	}

	public Restaurante buscar(String nome) {
		
		Restaurante restaurante = restauranteRepository.findByNome(nome);
		
		if(restaurante != null && nome.equals(restaurante.getNome())) {
			return restaurante;
		}
		
		return null;
	}
}