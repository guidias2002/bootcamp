package org.example;

import org.example.exceptions.ContentException;
import org.example.model.*;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws ContentException {

        // desenvolver os cursos inscritos de acordo com cada tipo

        Conteudo java = new Curso("POO com Java", "Tudo sobre POO com java", 20);
        Conteudo python = new Curso("POO com Python", "Tudo sobre POO com python", 20);
        Conteudo mentoria = new Mentoria("Boas práticas de POO", "Melhore seu código", LocalDate.now());

        Set<Conteudo> conteudos = new LinkedHashSet<>();
        conteudos.add(java);
        conteudos.add(python);
        conteudos.add(mentoria);


        Bootcamp bootcamp = new Bootcamp("Tudo sobre POO", "Melhores práticas com POO", conteudos);

        Dev guilherme = new Dev("Guilherme");
        guilherme.inscreverBootcamp(bootcamp);

        System.out.println(guilherme);

    }
}