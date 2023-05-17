package com.projetoqi.jogosapi.repository;

import java.util.ArrayList;
import java.util.List;

import com.projetoqi.jogosapi.model.Jogos;

public class JogosRepository {
    private static List<Jogos> jogos = new ArrayList<>();

    public List<Jogos> findAll() {
        return jogos;
    }
}
