package br.edu.infnet.appdelivery.model.service;

import br.edu.infnet.appdelivery.model.domain.Prato;
import br.edu.infnet.appdelivery.model.repository.PratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PratoService {
    @Autowired
    private PratoRepository pratoRepository;

    public void incluir(Prato prato) {
        pratoRepository.save(prato);
    }

    public void excluir(Long id) {
        pratoRepository.deleteById(id);
    }

    public Collection<Prato> obterLista(){
        return (Collection<Prato>) pratoRepository.findAll();
    }
}
