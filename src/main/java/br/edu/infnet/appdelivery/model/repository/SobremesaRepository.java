package br.edu.infnet.appdelivery.model.repository;

import br.edu.infnet.appdelivery.model.domain.Prato;
import br.edu.infnet.appdelivery.model.domain.Sobremesa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SobremesaRepository extends CrudRepository<Sobremesa, Long> {
}
