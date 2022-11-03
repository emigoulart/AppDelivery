package br.edu.infnet.appdelivery.controller;

import br.edu.infnet.appdelivery.model.domain.Prato;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class PratoController {

    private static Map<Long, Prato> mapa = new HashMap<>();
    private static Long id = 1L;

    public static void incluir(Prato prato) {
        prato.setId(id++);
        mapa.put(prato.getId(), prato);

        System.out.println("> " + prato);
    }

    public static void excluir(Integer id) {
        mapa.remove(id);
    }

    public static Collection<Prato> obterLista() {
        return mapa.values();
    }

    @GetMapping(value = "/prato/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", obterLista());

        return "prato/lista";
    }

    @GetMapping(value = "/prato/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {

        excluir(id);

        return "redirect:/prato/lista";
    }
}