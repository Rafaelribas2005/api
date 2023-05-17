package com.projetoqi.jogosapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoqi.jogosapi.model.Jogos;



@RestController
@RequestMapping("/api/jogos")
public class JogosController {
    
    @GetMapping
    public List<Jogos> listar() {
        return null;
        
    }
}
