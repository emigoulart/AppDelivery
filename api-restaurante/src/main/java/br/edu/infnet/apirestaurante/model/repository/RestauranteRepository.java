package br.edu.infnet.apirestaurante.model.repository;

import br.edu.infnet.apirestaurante.model.domain.Restaurante;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestauranteRepository extends CrudRepository<Restaurante, Long> {

	Restaurante findByNome(String nome);
}
