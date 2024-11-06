package org.example;

// Classe que representa uma Revista herdando de uma superclasse midia
public class Revista extends Midia {
    private String titulo;
    private int edicao;
    public Revista(String titulo, int edicao) {
        this.titulo = titulo;
        this.edicao = edicao;
    }

    public String getTitulo() {
        return titulo;
    }
    public int getEdicao() {
        return edicao;
    }
    @Override
    public String toString() {
        return "Revista: " + titulo + ", Edição: " + edicao;
    }
}