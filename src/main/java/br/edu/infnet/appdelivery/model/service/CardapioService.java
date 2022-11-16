package br.edu.infnet.appdelivery.model.service;

import br.edu.infnet.appdelivery.model.domain.Cardapio;
import br.edu.infnet.appdelivery.model.repository.CardapioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CardapioService {
    @Autowired
    private CardapioRepository cardapioRepository;

    public void incluir(Cardapio cardapio) {
        cardapioRepository.save(cardapio);
    }

    public void excluir(Long id) {
        cardapioRepository.deleteById(id);
    }

    public Collection<Cardapio> obterLista(){
        return (Collection<Cardapio>) cardapioRepository.findAll();
    }
}
