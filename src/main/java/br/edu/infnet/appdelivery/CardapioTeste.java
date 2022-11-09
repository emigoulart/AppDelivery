package br.edu.infnet.appdelivery;

import br.edu.infnet.appdelivery.model.domain.Entrada;
import br.edu.infnet.appdelivery.model.domain.Prato;
import br.edu.infnet.appdelivery.model.domain.Sobremesa;
import br.edu.infnet.appdelivery.model.service.EntradaService;
import br.edu.infnet.appdelivery.model.service.PratoService;
import br.edu.infnet.appdelivery.model.service.SobremesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Order(3)
@Component
public class CardapioTeste implements ApplicationRunner {

	@Autowired
	private EntradaService entradaService;

	@Autowired
	private PratoService pratoService;

	@Autowired
	private SobremesaService sobremesaService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Cardapios ##");

		Entrada entrada = new Entrada();
		entrada.setNome("Cesta de pães");
		entrada.setPreco(new BigDecimal(0));
		entrada.setCortesia(true);
		entrada.setDescricao("Pães francês com manteiga");
		entrada.setTamanho("média");
		entradaService.incluir(entrada);

		Prato prato = new Prato();
		prato.setNome("A la minuta");
		prato.setPreco(new BigDecimal(30));
		prato.setSugestaoChef(false);
		prato.setPromocional(true);
		prato.setDescricao("A la minuta de alcatra com fritas, arroz , ovo e salada");
		prato.setPeso(300);
		pratoService.incluir(prato);

		Sobremesa sobremesa = new Sobremesa();
		sobremesa.setNome("Pudim");
		sobremesa.setPreco(new BigDecimal(10));
		sobremesa.setDescricao("Pudim de leite condensado");
		sobremesa.setEmbalagemParaCongelados(false);
		sobremesa.setQuantidade(1);
		sobremesaService.incluir(sobremesa);


		Entrada entrada2 = new Entrada();
		entrada2.setNome("Hot philadelfia");
		entrada2.setPreco(new BigDecimal(19));
		entrada2.setCortesia(false);
		entrada2.setDescricao("Sushi frito recheado com salmão com cream cheese");
		entrada2.setTamanho("média");
		entradaService.incluir(entrada2);

		Prato prato2 = new Prato();
		prato2.setNome("Combo 1");
		prato2.setPreco(new BigDecimal(30));
		prato2.setSugestaoChef(false);
		prato2.setPromocional(true);
		prato2.setDescricao("30 porções variadas de sushi");
		prato2.setPeso(300);
		pratoService.incluir(prato2);

		Sobremesa sobremesa2 = new Sobremesa();
		sobremesa2.setNome("sushi doce");
		sobremesa2.setPreco(new BigDecimal(20));
		sobremesa2.setDescricao("Sushi de chocolate com morango");
		sobremesa2.setEmbalagemParaCongelados(false);
		sobremesa2.setQuantidade(8);
		sobremesaService.incluir(sobremesa2);
	}
}