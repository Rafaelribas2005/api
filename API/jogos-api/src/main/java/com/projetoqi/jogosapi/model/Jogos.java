package com.projetoqi.jogosapi.model;

public class Jogos {

    private String nomeDoJogo;
    private String dataDeLancamento;
    private String classificacaoIndicativa;
    private String empresaCriadora;
    private String genero;
    
    public String getNomeDoJogo() {
        return nomeDoJogo;
    }

    public String getDataDeLancamento() {
        return dataDeLancamento;
    }

    public String getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }

    public String getEmpresaCriadora() {
        return empresaCriadora;
    }

    public String getGenero() {
        return genero;
    }

    public Jogos(String nomeDoJogo, String dataDeLancamento, String classificacaoIndicativa, String empresaCriadora,
            String genero) {
        this.nomeDoJogo = nomeDoJogo;
        this.dataDeLancamento = dataDeLancamento;
        this.classificacaoIndicativa = classificacaoIndicativa;
        this.empresaCriadora = empresaCriadora;
        this.genero = genero;
    }


}
