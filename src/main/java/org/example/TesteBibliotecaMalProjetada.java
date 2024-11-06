package org.example;

import java.time.LocalDate;

/**
 * A classe Biblioteca está calculando a multa de um empréstimo, mas essa
 * responsabilidade deve pertencer ao próprio Emprestimo. Isso viola o princípio
 * de design de especialistas, que afirma que o objeto que possui as informações
 * necessárias deve ser o responsável por realizar a tarefa.
 *
 * O cálculo da multa depende das informações presentes no Emprestimo (datas),
 * então é ele quem deve realizar esse cálculo.
 */

public class TesteBibliotecaMalProjetada {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro("O Senhor dos Anéis");
        Livro livro2 = new Livro("1984");

        biblioteca.registrarEmprestimo(
                livro1,
                "João",
                LocalDate.now().minusDays(10),
                LocalDate.now().minusDays(5)
        );
        biblioteca.registrarEmprestimo(
                livro2,
                "Maria",
                LocalDate.now().minusDays(20),
                LocalDate.now().minusDays(15)
        );
        System.out.println("Multas registradas:");
        biblioteca.exibirMultas();
    }
}