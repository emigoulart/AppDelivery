package br.edu.infnet.appdelivery;

import br.edu.infnet.appdelivery.controller.SobremesaController;
import br.edu.infnet.appdelivery.model.domain.Sobremesa;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Order(6)
@Component
public class SobremesaTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("## Cadastramento de Sobremesas ##");

        Sobremesa sobremesa = new Sobremesa();
        sobremesa.setNome("Banana split");
        sobremesa.setPreco(new BigDecimal(10));
        sobremesa.setEmbalagemParaCongelados(true);
        sobremesa.setQuantidade(1);
        SobremesaController.incluir(sobremesa);
		
		Sobremesa sobremesa2 = new Sobremesa();
		sobremesa2.setNome("Pavê");
        sobremesa2.setPreco(new BigDecimal(15));
        sobremesa2.setEmbalagemParaCongelados(false);
		sobremesa2.setQuantidade(1);
		SobremesaController.incluir(sobremesa2);
		
		Sobremesa sobremesa3 = new Sobremesa();
		sobremesa3.setNome("Mousse de chocolate");
		sobremesa3.setPreco(new BigDecimal(10));
        sobremesa.setEmbalagemParaCongelados(false);
		sobremesa3.setQuantidade(3);
		SobremesaController.incluir(sobremesa3);
    }
}