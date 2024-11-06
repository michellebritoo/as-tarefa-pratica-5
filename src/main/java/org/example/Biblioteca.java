package org.example;

import java.util.ArrayList;
import java.util.List;

// Classe Biblioteca que cria múltiplas instâncias de configurações
public class Biblioteca {
    private List<String> livros;
    private ConfiguracaoBiblioteca configuracaoBiblioteca; // Cada biblioteca tem suas próprias configurações

    public Biblioteca(String horarios, double multa) {
        this.livros = new ArrayList<>();
        this.configuracaoBiblioteca = new
                ConfiguracaoBiblioteca(horarios, multa);
    }
    // Adiciona um livro à biblioteca
    public void adicionarLivro(String livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro);
    }
    // Exibe as configurações da biblioteca
    public void exibirConfiguracoes() {
        System.out.println(configuracaoBiblioteca.toString());
    }
}