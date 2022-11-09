package br.edu.infnet.appdelivery.model.repository;

import br.edu.infnet.appdelivery.model.domain.Cardapio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardapioRepository extends CrudRepository<Cardapio, Long> {
}
