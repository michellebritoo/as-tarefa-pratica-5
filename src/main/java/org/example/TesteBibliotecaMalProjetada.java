package org.example;

public class TesteBibliotecaMalProjetada {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro("O Senhor dos Anéis");
        Livro livro2 = new Livro("1984");

        /**
         * A main passa a gerenciar todas as instâncias de objetos do projeto
         * A classe biblioteca não possui mais a responsabilidade de criar instâncias de emprestimo, uma vez que
         * tanto a informacao de livro e de usuario sao inputadas na main
         */
        Emprestimo emprestimo1 = new Emprestimo(livro1, "João");
        Emprestimo emprestimo2 = new Emprestimo(livro2, "Maria");

        biblioteca.registrarEmprestimo(emprestimo1);
        biblioteca.registrarEmprestimo(emprestimo2);

        System.out.println("Empréstimos registrados:");
        biblioteca.exibirEmprestimos();
    }
}