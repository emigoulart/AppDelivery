package br.edu.infnet.appdelivery;

import br.edu.infnet.appdelivery.model.domain.Entrada;
import br.edu.infnet.appdelivery.model.service.EntradaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;


@Order(4)
@Component
public class EntradaTeste implements ApplicationRunner {

	@Autowired
	private EntradaService entradaService;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Entradas ##");

		Entrada entrada = new Entrada();
		entrada.setNome("Sopa de legumes");
		entrada.setQuantidade(1);
		entrada.setPreco(new BigDecimal(0));
		entrada.setTamanho("pequena");
		entrada.setCortesia(true);

		entradaService.incluir(entrada);

		Entrada entrada2 = new Entrada();
		entrada2.setNome("Pães australianos");
		entrada2.setPreco(new BigDecimal(0));
		entrada2.setCortesia(true);
		entrada2.setQuantidade(3);
		entrada2.setTamanho("pequena");
		entradaService.incluir(entrada2);

		Entrada entrada3 = new Entrada();
		entrada3.setNome("Porção de tulipas de frango");
		entrada3.setPreco(new BigDecimal(34));
		entrada3.setCortesia(false);
		entrada3.setQuantidade(1);
		entrada3.setTamanho("pequena");
		entradaService.incluir(entrada3);

		Entrada entrada4= new Entrada();
		entrada4.setNome("Hot philadelfia");
		entrada4.setPreco(new BigDecimal(19));
		entrada4.setCortesia(false);
		entrada4.setDescricao("Sushi frito recheado com salmão com cream cheese");
		entrada4.setTamanho("média");
		entrada4.setQuantidade(8);
		entradaService.incluir(entrada4);
	}
}