package com.projetoqi.jogosapi.repository;

import java.util.ArrayList;
import java.util.List;

import com.projetoqi.jogosapi.model.Jogos;

public class JogosRepository {
    private static List<Jogos> jogos = new ArrayList<>();

    public static Jogos addJogo(String nomeDoJogo, String dataDeLancamento, String classificacaoIndicativa, String empresaCriadora, String genero) {
        Jogos Jogo = new Jogos(nomeDoJogo, dataDeLancamento, classificacaoIndicativa, empresaCriadora, genero);
        jogos.add(Jogo);
        return Jogo;
    }

    public List<Jogos> findAll() {
        return jogos;
    }
}
