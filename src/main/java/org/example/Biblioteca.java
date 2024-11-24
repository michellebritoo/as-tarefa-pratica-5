package org.example;

import java.util.ArrayList;
import java.util.List;

// Classe Biblioteca diretamente acoplada à lista de mídias
public class Biblioteca {
    private List<Midia> midias; // Acesso direto à lista de mídias

    public Biblioteca() {
        this.midias = new ArrayList<>();
    }

    // Adiciona qualquer tipo de mídia
    public void adicionarMidia(Midia midia) {
        midias.add(midia);
        System.out.println("Mídia adicionada: " + midia.getTitulo());
    }

    // Exibe todas as mídias
    public void exibirMidias() {
        for (Midia midia : midias) {
            midia.exibirDetalhes();
        }
    }
}