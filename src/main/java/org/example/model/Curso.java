package org.example.model;

import lombok.Getter;


public class Curso extends Conteudo {

    @Getter
    private int cargaHoraria;

    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao, TipoConteudo.CURSO);
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }


    @Override
    public void exibirInfos() {
        System.out.println("*** Informações sobre o curso ***");
        infosConteudo();
        System.out.println("Carga horária: " + cargaHoraria);
    }


    @Override
    public String toString() {
        return "Curso{" +
                "titulo=" + getTitulo() + ", " +
                "descricao=" + getDescricao() + ", " +
                "cargaHoraria=" + cargaHoraria + ", " +
                "tipo=" + getTipoConteudo() +
                '}';
    }
}
