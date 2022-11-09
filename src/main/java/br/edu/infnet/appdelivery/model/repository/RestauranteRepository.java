package br.edu.infnet.appdelivery.model.repository;

import br.edu.infnet.appdelivery.model.domain.Restaurante;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestauranteRepository extends CrudRepository<Restaurante, Long> {
}
