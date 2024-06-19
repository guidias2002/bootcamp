package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Mentoria {
    private String titulo;
    private String descricao;
    private LocalDate data;
}
