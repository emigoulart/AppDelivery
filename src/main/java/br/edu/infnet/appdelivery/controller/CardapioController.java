package br.edu.infnet.appdelivery.controller;

import br.edu.infnet.appdelivery.model.domain.Cardapio;
import br.edu.infnet.appdelivery.model.service.CardapioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CardapioController {

    @Autowired
    private CardapioService cardapioService;

    @PostMapping(value = "/cardapio/incluir")
    public String incluir(Cardapio cardapio) {

        cardapioService.incluir(cardapio);

        return "redirect:/cardapio/lista";
    }

    @GetMapping(value = "/cardapio/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", cardapioService.obterLista());

        return "cardapio/lista";
    }

    @GetMapping(value = "/cardapio/{id}/excluir")
    public String exclusao(@PathVariable Long id) {

        cardapioService.excluir(id);

        return "redirect:/cardapio/lista";
    }
}