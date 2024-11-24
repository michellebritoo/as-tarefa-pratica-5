package org.example;

import java.util.ArrayList;
import java.util.List;


// Agora a classe biblioteca é responsável apenas por gerir livros
public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo) {
        Livro livro = new Livro(titulo);
        livros.add(livro);
        System.out.println("Livro adicionado \"" + titulo);
    }
    public Livro encontrarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                return livro;
            }
        }
        return null;
    }
}