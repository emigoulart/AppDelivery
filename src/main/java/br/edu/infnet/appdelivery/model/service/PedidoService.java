package br.edu.infnet.appdelivery.model.service;

import br.edu.infnet.appdelivery.model.domain.Pedido;
import br.edu.infnet.appdelivery.model.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;

    public void incluir(Pedido pedido) {
        pedidoRepository.save(pedido);
    }

    public void excluir(Long id) {
        pedidoRepository.deleteById(id);
    }

    public Collection<Pedido> obterLista(){
        return (Collection<Pedido>) pedidoRepository.findAll();
    }
}
