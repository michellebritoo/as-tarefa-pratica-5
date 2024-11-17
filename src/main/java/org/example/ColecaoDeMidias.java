package org.example;

import java.util.ArrayList;
import java.util.List;

// Classe que representa uma coleção de livros ou revistas (Ou qualquer outra midia que for implementada)
public class ColecaoDeMidias implements Midia {
    private final String nome;
    private final List<Midia> midias;

    public ColecaoDeMidias(String nome) {
        this.nome = nome;
        this.midias = new ArrayList<>();
    }

    // Adiciona uma midia à coleção
    public void adicionarMidia(Midia midia) {
        midias.add(midia);
    }

    @Override
    public String getTitulo() {
        return this.nome;
    }

    // Exibe todos os itens da coleção
    @Override
    public void exibirDetalhes() {
        System.out.println("Coleção: " + nome);
        for (Midia midia : midias) {
            midia.exibirDetalhes();
        }
    }
}