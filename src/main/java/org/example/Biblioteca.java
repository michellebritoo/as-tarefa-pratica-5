package org.example;

import java.util.ArrayList;
import java.util.List;

// Classe Biblioteca diretamente responsável pela criação das mídias
public class Biblioteca {
    private List<Midia> midias;

    public Biblioteca() {
        this.midias = new ArrayList<>();
    }

    // Método para adicionar mídia (Livro ou Revista)
    public void adicionarMidia(Midia midia) {
        midias.add(midia);
        System.out.printf("\n%s adicionado: %s\n", midia.getClass().getSimpleName(), midia.getTitulo());
    }

    // Exibe todas as mídias
    public void exibirMidias() {
        for (Midia midia : midias) {
            System.out.println(midia.toString());
        }
    }
}