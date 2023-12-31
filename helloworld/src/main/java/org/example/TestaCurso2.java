package org.example;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestaCurso2 {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando Listas e Sets", "Rafael");

        javaColecoes.adiciona(new Aula("Banco de Dados", 25));
        javaColecoes.adiciona(new Aula("Programação", 21));
        javaColecoes.adiciona(new Aula("Data Science", 30));
        javaColecoes.adiciona(new Aula("s Science", 30));
        List<Aula> listaImutaveis = javaColecoes.getAulas();

        //qui esta clocando a lista deixando ela mutavel podendo acessa-la para ordena-la com o sort.
        List<Aula> listaMutaveis = new LinkedList<>(listaImutaveis);


        Collections.sort(listaMutaveis);
        System.out.println(listaMutaveis);

        int getAula = javaColecoes.getTempoTotal();
        System.out.println(getAula);

        javaColecoes.getQuantidadeDeCurso();

        System.out.println(javaColecoes.getQuantidadeDeCurso());

        System.out.println(javaColecoes.getTempoComMetodosColletion());

        System.out.println(javaColecoes);


    }
}
