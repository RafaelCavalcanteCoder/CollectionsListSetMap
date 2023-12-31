package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {

        Curso javaColecoes= new Curso("Lists", "Rafael Cavalcante");
        javaColecoes.adiciona(new Aula("ArrayList", 21));
        javaColecoes.adiciona(new Aula("Compare", 22));
        javaColecoes.adiciona(new Aula("Metodos", 34));
        javaColecoes.adiciona(new Aula("Data Science", 42));

        List<Aula> aulas = javaColecoes.getAulas();

        System.out.println(aulas);


    }
}
