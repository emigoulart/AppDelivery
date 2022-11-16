package br.edu.infnet.appdelivery.model.service;

import br.edu.infnet.appdelivery.clients.IRestauranteClient;
import br.edu.infnet.appdelivery.model.domain.Restaurante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class RestauranteService {
    @Autowired
    private IRestauranteClient restauranteClient;

    public void incluir(Restaurante restaurante) {
        restauranteClient.incluir(restaurante);
    }
    public void excluir(Long id) {
        restauranteClient.excluir(id);
    }

    public Collection<Restaurante> obterLista(){
        return (Collection<Restaurante>) restauranteClient.obterLista();
    }

    public Restaurante buscar(String nome){
        return restauranteClient.buscar(nome);
    }
}
