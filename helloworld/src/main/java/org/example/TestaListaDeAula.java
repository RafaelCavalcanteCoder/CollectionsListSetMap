package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

    public static void main(String[] args) {

        Aula a1 = new Aula("Revisitando as ArrayList", 21);
        Aula a2 = new Aula("Lista de Objetos    ", 15);
        Aula a3 = new Aula("Relacionamento de Listas e Objetos", 34);


        ArrayList<Aula> aulas = new ArrayList<>();

        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println("1º "+ aulas);

        //aqui estou invocando o metodo compareTo que eu reescrevi
        Collections.sort(aulas);

        System.out.println(aulas);

        aulas.sort(Comparator.comparing(Aula::getTitulo));

        aulas.sort(Comparator.comparing(Aula::getTempo));

        System.out.println("Pelo Tempo: " + aulas);

    }
}
