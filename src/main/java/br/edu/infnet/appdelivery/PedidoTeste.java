package br.edu.infnet.appdelivery;

import br.edu.infnet.appdelivery.model.domain.*;
import br.edu.infnet.appdelivery.model.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

@Order(1)
@Component
public class PedidoTeste implements ApplicationRunner {

    @Autowired
    private PedidoService pedidoService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("## Cadastramento de Pedidos ##");

        Entrada entrada2 = new Entrada();
        entrada2.setNome("Paes australianos");
        entrada2.setPreco(new BigDecimal(0));
        entrada2.setCortesia(true);
        entrada2.setQuantidade(3);

        Prato prato = new Prato();
        prato.setNome("A Parmegiana de Filé");
        prato.setPreco(new BigDecimal(89));
        prato.setPromocional(false);
        prato.setSugestaoChef(true);
        prato.setPeso(300);

        Sobremesa sobremesa = new Sobremesa();
        sobremesa.setNome("Sorvete");
        sobremesa.setPreco(new BigDecimal(25));
        sobremesa.setEmbalagemParaCongelados(true);
        sobremesa.setQuantidade(1);

        Restaurante restaurante = new Restaurante();
        restaurante.setCnpj("12312312312");
        restaurante.setNome("Tudo Saboroso");

        List<Cardapio> itensCardapioPedido1 = new ArrayList<>();
        itensCardapioPedido1.add(entrada2);
        itensCardapioPedido1.add(prato);
        itensCardapioPedido1.add(sobremesa);

        LocalDateTime now = LocalDateTime.now(ZoneId.systemDefault());

        Pedido pedido1 = new Pedido();
        pedido1.setRestaurante(restaurante);
        pedido1.setDataHora(now);
        pedido1.setItensCardapio(itensCardapioPedido1);

        pedidoService.incluir(pedido1);

        Entrada entrada3 = new Entrada();
        entrada3.setNome("Hot philadélfia");
        entrada3.setPreco(new BigDecimal(0));
        entrada3.setCortesia(false);
        entrada3.setQuantidade(8);

        Prato prato1 = new Prato();
        prato1.setNome("Combo sushi 1");
        prato1.setPreco(new BigDecimal(89));
        prato1.setPromocional(true);
        prato1.setSugestaoChef(false);
        prato1.setPeso(300);

        Sobremesa sobremesa1 = new Sobremesa();
        sobremesa1.setNome("Sushi doce");
        sobremesa1.setPreco(new BigDecimal(19));
        sobremesa1.setEmbalagemParaCongelados(false);
        sobremesa1.setQuantidade(1);

        Restaurante restaurante1 = new Restaurante();
        restaurante1.setCnpj("99999999999");
        restaurante1.setNome("Sushi Tal");

        List<Cardapio> itensCardapioPedido2 = new ArrayList<>();
        itensCardapioPedido2.add(entrada3);
        itensCardapioPedido2.add(prato1);
        itensCardapioPedido2.add(sobremesa1);

        Pedido pedido2 = new Pedido();
        pedido2.setRestaurante(restaurante1);
        pedido2.setDataHora(now);
        pedido2.setItensCardapio(itensCardapioPedido2);

        pedidoService.incluir(pedido2);
    }
}