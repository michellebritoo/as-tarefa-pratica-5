package org.example;

// Classe que representa uma revista
public class Revista implements Midia {
    private String titulo;
    private int edicao;

    public Revista(String titulo, int edicao) {
        this.titulo = titulo;
        this.edicao = edicao;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("Revista: %s, Edição: %s", this.titulo, this.edicao);
    }
}