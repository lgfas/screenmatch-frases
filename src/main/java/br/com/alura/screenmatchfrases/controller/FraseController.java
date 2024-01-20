package br.com.alura.screenmatchfrases.controller;

import br.com.alura.screenmatchfrases.dto.FraseDTO;
import br.com.alura.screenmatchfrases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {

    @Autowired
    private FraseService fraseService;

    @GetMapping("/series/frases")
    public FraseDTO obterFraseAleatoria() {
        return fraseService.obterFraseAleatoria();
    }
}
