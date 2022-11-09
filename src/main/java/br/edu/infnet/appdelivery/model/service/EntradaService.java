package br.edu.infnet.appdelivery.model.service;

import br.edu.infnet.appdelivery.model.domain.Entrada;
import br.edu.infnet.appdelivery.model.repository.EntradaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class EntradaService {
    @Autowired
    private EntradaRepository entradaRepository;

    public void incluir(Entrada entrada) {
        entradaRepository.save(entrada);
    }

    public void excluir(Long id) {
        entradaRepository.deleteById(id);
    }

    public Collection<Entrada> obterLista(){
        return (Collection<Entrada>) entradaRepository.findAll();
    }
}
