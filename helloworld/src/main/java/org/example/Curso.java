package org.example;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {

    private String nome;
    private String instrutor;

    private List<Aula> aulas = new LinkedList<Aula>();


    public Curso(String nome, String instrutor){
        this.nome=nome;
        this.instrutor=instrutor;
    }

    public List<Aula> getAulas() {

        return Collections.unmodifiableList(aulas);
    }

    public String getInstrutor(){
    return instrutor;
    }

    public String getNome() {

    return nome;
    }


    public void adiciona(Aula aula){
     this.aulas.add(aula);
    }

    public int getTempoTotal(){
        int tempoTotal = 0;
        for (Aula aula :aulas) {
            tempoTotal+=aula.getTempo();
        }
        return tempoTotal;
    }

    public int getTempoComMetodosColletion(){
        return this.aulas.stream().mapToInt(Aula ::getTempo).sum();
    }

    public int getQuantidadeDeCurso(){
        int quantidade = 0;
        for(Aula a : aulas){
            quantidade=aulas.size();
        }
        return quantidade;
    }

    @Override
    public String toString() {
        return "[Curso: " + nome + ", Instrutor: "+instrutor + ", Tempo: " + getTempoTotal() + "]";
    }
}
