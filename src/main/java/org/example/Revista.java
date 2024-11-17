package org.example;

public class Revista {
    private String titulo;
    private int edicao;
    public Revista(String titulo, int edicao) {
        this.titulo = titulo;
        this.edicao = edicao;
    }
    public String getTitulo() {
        return titulo;
    }
}