package org.example;

import java.util.ArrayList;
import java.util.List;

// Classe Biblioteca diretamente responsável pela criação das mídias
public class Biblioteca {
    private List<Object> midias;

    public Biblioteca() {
        this.midias = new ArrayList<>();
    }

    // Método para adicionar mídia (Livro ou Revista)
    public void adicionarMidia(String tipo, String titulo, String
            autorOuEdicao) {
        if (tipo.equals("Livro")) {
            Livro livro = new Livro(titulo, autorOuEdicao); // Criação manual de Livro
            midias.add(livro);
            System.out.println("Livro adicionado: " + titulo);
        } else if (tipo.equals("Revista")) {
            Revista revista = new Revista(titulo,
                    Integer.parseInt(autorOuEdicao)); // Criação manual de Revista
            midias.add(revista);
            System.out.println("Revista adicionada: " + titulo);
        } else {
            System.out.println("Erro: Tipo de mídia não reconhecido.");
        }
    }

    // Exibe todas as mídias
    public void exibirMidias() {
        for (Object midia : midias) {
            System.out.println(midia.toString());
        }
    }
}