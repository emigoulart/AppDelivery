package br.edu.infnet.appdelivery.controller;

import br.edu.infnet.appdelivery.model.domain.Entrada;
import br.edu.infnet.appdelivery.model.domain.Restaurante;
import br.edu.infnet.appdelivery.model.domain.Usuario;
import br.edu.infnet.appdelivery.model.service.EntradaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.util.Collection;

@Controller
public class EntradaController {
    @Autowired
    private EntradaService entradaService;

    @PostMapping(value = "/entrada/incluir")
    public String incluir(Entrada entrada) {

        entradaService.incluir(entrada);

        return "redirect:/restaurante/lista";
    }

    @GetMapping(value = "/entrada/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", entradaService.obterLista());

        return "entrada/lista";
    }

    @GetMapping(value = "/entrada/{id}/excluir")
    public String exclusao(@PathVariable Long id) {

        entradaService.excluir(id);

        return "redirect:/entrada/lista";
    }
}