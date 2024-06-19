package org.example.model;

import lombok.Data;

@Data
public abstract class Conteudo implements IConteudo {
    protected static final double XP_PADRAO = 10;

    private String titulo;
    private String descricao;
    private TipoConteudo tipoConteudo;

    public Conteudo(String titulo, String descricao, TipoConteudo tipoConteudo) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.tipoConteudo = tipoConteudo;
    }

    public abstract double calcularXp();

    public void infosConteudo() {
        System.out.println("Título: " + titulo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Tipo conteúdo: " + tipoConteudo);
    }


}
