package br.edu.infnet.appdelivery.model.service;

import br.edu.infnet.appdelivery.model.domain.Sobremesa;
import br.edu.infnet.appdelivery.model.repository.SobremesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class SobremesaService {
    @Autowired
    private SobremesaRepository sobremesaRepository;

    public void incluir(Sobremesa sobremesa) {
        sobremesaRepository.save(sobremesa);
    }

    public void excluir(Long id) {
        sobremesaRepository.deleteById(id);
    }

    public Collection<Sobremesa> obterLista(){
        return (Collection<Sobremesa>) sobremesaRepository.findAll();
    }
}
