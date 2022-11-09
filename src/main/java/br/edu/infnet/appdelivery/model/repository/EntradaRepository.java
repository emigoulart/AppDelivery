package br.edu.infnet.appdelivery.model.repository;

import br.edu.infnet.appdelivery.model.domain.Entrada;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntradaRepository extends CrudRepository<Entrada, Long> {
}
