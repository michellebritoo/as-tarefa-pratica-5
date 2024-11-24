package org.example;

import java.time.LocalDate;

public class TesteBibliotecaMalProjetada {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        //Aqui vamos usar a interface para ter uma referencia ao contrato e instanciar uma impl que utiliza a interface
        EmprestimoService servicoEmprestimos = new EmprestimoServiceImpl(biblioteca);

        biblioteca.adicionarLivro("O Senhor dos Anéis");
        biblioteca.adicionarLivro("1984");

        servicoEmprestimos.registrarEmprestimo("O Senhor dos Anéis", "João", LocalDate.now().minusDays(5));
        servicoEmprestimos.registrarEmprestimo("1984", "Maria", LocalDate.now().minusDays(10));

        System.out.println("\nMultas:");
        servicoEmprestimos.calcularMultas();

        System.out.println("\nDevolvendo livro 1984...");
        servicoEmprestimos.devolverLivro("1984");

        System.out.println("\nMultas após devolução:");
        servicoEmprestimos.calcularMultas();
    }
}