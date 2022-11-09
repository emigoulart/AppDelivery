package br.edu.infnet.appdelivery.controller;

import br.edu.infnet.appdelivery.model.domain.Pedido;
import br.edu.infnet.appdelivery.model.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping(value = "/pedido/incluir")
    public String incluir(Pedido pedido) {

        pedidoService.incluir(pedido);

        return "redirect:/pedido/lista";
    }

    @GetMapping(value = "/pedido/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", pedidoService.obterLista());

        return "pedido/lista";
    }

    @GetMapping(value = "/pedido/{id}/excluir")
    public String exclusao(@PathVariable Long id) {

        pedidoService.excluir(id);

        return "redirect:/pedido/lista";
    }

}