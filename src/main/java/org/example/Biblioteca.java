package org.example;

// Classe Biblioteca com padrão polimorfismo, sem código duplicado para diferentes tipos de midias
import java.util.ArrayList;
import java.util.List;
public class Biblioteca {
    private final List<Midia> midias;
    public Biblioteca() {
        this.midias = new ArrayList<>();
    }
    // Adiciona qualquer tipo de midia
    public void adicionarMidia(Midia midia) {
        midias.add(midia);
    }

    // Exibe todas as mídias e coleções
    public void exibirBiblioteca() {
        System.out.println("Mídias da biblioteca:");
        for (Midia midia : midias) {
            midia.exibirDetalhes();
        }
    }
}