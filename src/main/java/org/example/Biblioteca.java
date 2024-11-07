package org.example;

// Classe Biblioteca sem padrão composto, com código duplicado para coleções

import java.util.ArrayList;
import java.util.List;
public class Biblioteca {
    private List<Livro> livros;
    private List<Revista> revistas;
    private List<ColecaoDeMidias> colecoes;
    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.revistas = new ArrayList<>();
        this.colecoes = new ArrayList<>();
    }
    // Adiciona um livro à biblioteca
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }
    // Adiciona uma revista à biblioteca
    public void adicionarRevista(Revista revista) {
        revistas.add(revista);

    }
    // Adiciona uma coleção à biblioteca
    public void adicionarColecao(ColecaoDeMidias colecao) {
        colecoes.add(colecao);
    }
    // Exibe todas as mídias e coleções
    public void exibirBiblioteca() {
        System.out.println("Mídias Individuais:");
        for (Livro livro : livros) {
            System.out.println(livro);
        }
        for (Revista revista : revistas) {
            System.out.println(revista);
        }
        System.out.println("\nColeções:");
        for (ColecaoDeMidias colecao : colecoes) {
            colecao.exibirColecao();
        }
    }
}