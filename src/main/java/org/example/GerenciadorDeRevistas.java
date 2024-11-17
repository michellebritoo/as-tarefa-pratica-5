package org.example;

import java.util.ArrayList;
import java.util.List;

// Classe que gerencia revistas
public class GerenciadorDeRevistas {
    private List<Revista> revistas;
    public GerenciadorDeRevistas() {
        this.revistas = new ArrayList<>();
    }
    public void adicionarRevista(Revista revista) {
        revistas.add(revista);
        System.out.println("Revista adicionada: " +
                revista.getTitulo());
    }
}