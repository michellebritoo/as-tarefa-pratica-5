package org.example;

// Classe que representa um livro
public class Livro implements Midia {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
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
        return String.format("Livro: %s, Autor: %s", this.titulo, this.autor);
    }
}