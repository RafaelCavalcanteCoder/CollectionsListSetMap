package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Colecoes {
    public static void main(String[] args) {

        String aula1 = "Matematica";
        String aula2 = "Portugues";
        String aula3 = "Fisica";

        ArrayList<String> aulas = new ArrayList<>();

        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        for(String aula :aulas){
            System.out.println("Aula: " + aula);

        }

        String primeiraAula = aulas.getFirst();
        System.out.println("A Primeira Aula é: " +  primeiraAula);

        for ( int i = 0; i<aulas.size(); i++){
            System.out.println("Aula: " + aulas.get(i));
        }

        aulas.forEach(aula -> {
            System.out.println("Percorrendo cada aula com o metodo forEach usando -> {}" + aula);
        });


    //ordenar listas classe Colections
        //METODO static sort é pra orndernar uma lista em ordem decrescente
        Collections.sort(aulas);

        System.out.println("ordem ascendente " + aulas);


    }

}
