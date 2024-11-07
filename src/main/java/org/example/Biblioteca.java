package org.example;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<String> livros;
    private ConfiguracaoBiblioteca configuracaoBiblioteca;
    public Biblioteca(String horarios, double multa) {
        this.livros = new ArrayList<>();
        // Busca a instancia da configuração sempre que uma Biblioteca é criada
        this.configuracaoBiblioteca = ConfiguracaoBiblioteca.getInstancia(horarios, multa);
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