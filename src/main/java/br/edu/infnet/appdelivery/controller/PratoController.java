package br.edu.infnet.appdelivery.controller;

import br.edu.infnet.appdelivery.model.domain.Prato;
import br.edu.infnet.appdelivery.model.service.PratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class PratoController {

    private static Map<Long, Prato> mapa = new HashMap<>();
    private static Long id = 1L;
    @Autowired
    private PratoService pratoService;

    @PostMapping(value = "/prato/incluir")
    public String incluir(Prato prato) {

        pratoService.incluir(prato);

        return "redirect:/prato/lista";
    }

    @GetMapping(value = "/prato/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", pratoService.obterLista());

        return "prato/lista";
    }

    @GetMapping(value = "/prato/{id}/excluir")
    public String exclusao(@PathVariable Long id) {

        pratoService.excluir(id);

        return "redirect:/prato/lista";
    }
}