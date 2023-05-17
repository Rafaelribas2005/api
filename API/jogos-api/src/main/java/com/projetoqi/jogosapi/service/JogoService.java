package com.projetoqi.jogosapi.service;

import java.util.List;

import com.projetoqi.jogosapi.model.Jogos;
import com.projetoqi.jogosapi.repository.JogosRepository;

public class JogoService {

    private JogosRepository jogosRepository = new JogosRepository();

    public Jogos addToDo(String nomeDoJogo, String dataDeLancamento, String classificacaoIndicativa, String empresaCriadora, String genero) {
        return JogosRepository.addJogo(nomeDoJogo, dataDeLancamento, classificacaoIndicativa, empresaCriadora, genero);
    }

    public List<Jogos> findAll() {
        return jogosRepository.findAll();
    }
    
}
