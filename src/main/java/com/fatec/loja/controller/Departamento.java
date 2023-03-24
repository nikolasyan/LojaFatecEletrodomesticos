package com.fatec.loja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.fatec.loja.controller.Eletrodomesticos;
import org.springframework.ui.ModelMap;

@Controller
@RequestMapping
public class Departamento {

    @GetMapping("/departamento/{nomeDep}")
    public String home(@PathVariable String nomeDep, ModelMap model) {
        if (nomeDep.equals("eletrodomestico")) {
            Eletrodomesticos.exibirPagina(model);
            return "eletrodomesticos";
        } else {
            System.out.println("Departamento inválido!");
            return "erro";
        }
    }
}
