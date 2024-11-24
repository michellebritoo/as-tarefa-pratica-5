package org.example;

import java.time.LocalDate;

public class TesteBibliotecaMalProjetada {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        EmprestimoGerenciador emprestimoManager = new EmprestimoGerenciador();

        biblioteca.adicionarLivro("O Senhor dos Anéis");
        biblioteca.adicionarLivro("1984");

        Livro livro1 = biblioteca.encontrarLivro("O Senhor dos Anéis");
        Livro livro2 = biblioteca.encontrarLivro("1984");

        if (livro1 != null) {
            emprestimoManager.salvarEmprestimo(livro1, "João", LocalDate.now().minusDays(5));
        }
        if (livro2 != null) {
            emprestimoManager.salvarEmprestimo(livro2, "Maria", LocalDate.now().minusDays(10));
        }

        System.out.println("\nMultas:");
        emprestimoManager.calculaMulta();


        System.out.println("\nDevolvendo livro 1984...");
        emprestimoManager.devolveLivro("1984");

        System.out.println("\nMultas após devolução:");
        emprestimoManager.calculaMulta();
    }
}