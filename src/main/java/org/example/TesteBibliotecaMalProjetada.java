package org.example;

public class TesteBibliotecaMalProjetada {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro("O Senhor dos Anéis");
        Livro livro2 = new Livro("1984");
        biblioteca.registrarEmprestimo(livro1, "João");
        biblioteca.registrarEmprestimo(livro2, "Maria");
        System.out.println("Empréstimos registrados:");
        biblioteca.exibirEmprestimos();
    }
}