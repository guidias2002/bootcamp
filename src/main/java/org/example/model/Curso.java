package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Curso {
    protected String titulo;
    protected String descricao;
    protected int cargaHoraria;


}
