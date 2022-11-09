package br.edu.infnet.appdelivery;

import br.edu.infnet.appdelivery.controller.PratoController;
import br.edu.infnet.appdelivery.model.domain.Prato;
import br.edu.infnet.appdelivery.model.service.PratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;


@Order(5)
@Component
public class PratoTeste implements ApplicationRunner {

	@Autowired
	private PratoService pratoService;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Pratos ##");

		Prato prato = new Prato();
		prato.setNome("A Parmegiana de Filé");
		prato.setPreco(new BigDecimal(89));
		prato.setPromocional(false);
		prato.setSugestaoChef(true);
		prato.setPeso(300);

		pratoService.incluir(prato);

		Prato prato2 = new Prato();
		prato2.setNome("Massa aos 4 queijos");
		prato2.setPreco(new BigDecimal(49));
		prato2.setPromocional(false);
		prato2.setSugestaoChef(false);
		prato2.setPeso(300);

		pratoService.incluir(prato2);

		Prato prato3 = new Prato();
		prato3.setNome("Costela ao mollho barbecue");
		prato3.setPreco(new BigDecimal(49));
		prato3.setPromocional(true);
		prato3.setSugestaoChef(false);
		prato3.setPeso(250);

		pratoService.incluir(prato3);

	}
}