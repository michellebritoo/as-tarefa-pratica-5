package org.example;

import java.time.LocalDate;

public class TesteBibliotecaMalProjetada {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro("O Senhor dos Anéis");
        biblioteca.adicionarLivro("1984");

        biblioteca.registrarEmprestimo("O Senhor dos Anéis", "João", LocalDate.now().minusDays(5));
        biblioteca.registrarEmprestimo("1984", "Maria", LocalDate.now().minusDays(10));
        System.out.println("\nMultas:");
        biblioteca.calcularMultas();
        System.out.println("\nDevolvendo livro 1984...");
        biblioteca.devolverLivro("1984");
        System.out.println("\nMultas após devolução:");
        biblioteca.calcularMultas();
    }
}