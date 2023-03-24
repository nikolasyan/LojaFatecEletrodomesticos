package com.fatec.loja.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
@Component
class Eletrodomesticos {
    public static void exibirPagina(ModelMap model) {
        model.addAttribute("titulo", "Eletrodomésticos");
    }
}