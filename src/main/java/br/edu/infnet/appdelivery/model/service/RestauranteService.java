package br.edu.infnet.appdelivery.model.service;

import br.edu.infnet.appdelivery.model.domain.Restaurante;
import br.edu.infnet.appdelivery.model.repository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

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

    public Collection<Restaurante> obterLista(){
        return (Collection<Restaurante>) restauranteRepository.findAll();
    }
}
