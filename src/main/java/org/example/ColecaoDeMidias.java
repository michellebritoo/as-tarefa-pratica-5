package org.example;

import java.util.ArrayList;
import java.util.List;

// Classe que representa uma coleção de livros ou revistas
public class ColecaoDeMidias {
    private String nome;
    private List<Livro> livros;
    private List<Revista> revistas;
    public ColecaoDeMidias(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
        this.revistas = new ArrayList<>();
    }
    // Adiciona um livro à coleção
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }
    // Adiciona uma revista à coleção
    public void adicionarRevista(Revista revista) {
        revistas.add(revista);
    }
    // Exibe todos os itens da coleção
    public void exibirColecao() {
        System.out.println("Coleção: " + nome);
        for (Livro livro : livros) {
            System.out.println(livro);
        }
        for (Revista revista : revistas) {
            System.out.println(revista);
        }
    }
}