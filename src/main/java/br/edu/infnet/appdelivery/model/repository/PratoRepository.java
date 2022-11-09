package br.edu.infnet.appdelivery.model.repository;

import br.edu.infnet.appdelivery.model.domain.Prato;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PratoRepository extends CrudRepository<Prato, Long> {
}
