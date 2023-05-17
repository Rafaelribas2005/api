package com.projetoqi.jogosapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projetoqi.jogosapi.model.Jogos;
import com.projetoqi.jogosapi.service.JogoService;



@RestController
@RequestMapping("/api/jogos")
public class JogosController {
    
    @GetMapping
    public List<Jogos> findAll() {
        return JogoService.findAll();
    }
    @PostMapping
    public Jogos addJogos(@RequestParam String nomeDoJogo, @RequestParam  String dataDeLancamento,  @RequestParam String classificacaoIndicativa, @RequestParam String empresaCriadora,  @RequestParam String genero) {
        return JogoService.addToDo(nomeDoJogo, dataDeLancamento, classificacaoIndicativa, empresaCriadora, genero);

    }
}
