package org.example.model;

import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@ToString
public class Mentoria extends Conteudo {

    @Getter
    private LocalDate data;

    public Mentoria(String titulo, String descricao, LocalDate data) {
        super(titulo, descricao, TipoConteudo.MENTORIA);
        this.data = data;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20;
    }


    @Override
    public void exibirInfos() {
        System.out.println("*** Informações sobre a mentoria ***");
        infosConteudo();
        System.out.println("Data: " + data);
    }


    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo=" + getTitulo() + ", " +
                "descricao=" + getDescricao() + ", " +
                "data=" + data + ", " +
                "tipo=" + getTipoConteudo() +
                '}';
    }
}
