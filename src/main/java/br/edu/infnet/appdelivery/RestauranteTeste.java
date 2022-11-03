package br.edu.infnet.appdelivery;

import br.edu.infnet.appdelivery.controller.RestauranteController;
import br.edu.infnet.appdelivery.model.domain.Cliente;
import br.edu.infnet.appdelivery.model.domain.Restaurante;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Component
public class RestauranteTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Restaurantes ##");

		Restaurante restaurante = new Restaurante();
		restaurante.setCnpj("12312312312");
		restaurante.setNome("Tudo Saboroso");
		restaurante.setDescricao("Restaurante gastronomia brasileira");
		restaurante.setEndereco("Rua dos Sabores 123");
		RestauranteController.incluir(restaurante);

		Restaurante restaurante2 = new Restaurante();
		restaurante2.setCnpj("9999999999");
		restaurante2.setNome("Sushi Tal");
		restaurante2.setDescricao("Restaurante gastronomia Japonesa");
		restaurante2.setEndereco("Rua dos Sabores 124");
		RestauranteController.incluir(restaurante2);

	}
}