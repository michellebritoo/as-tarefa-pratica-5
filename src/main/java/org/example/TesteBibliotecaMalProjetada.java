package org.example;

import java.time.LocalDate;

// Classe principal que coordena manualmente as operações
public class TesteBibliotecaMalProjetada {
    public static void main(String[] args) {
        GerenciadorDeLivros gerenciadorDeLivros = new GerenciadorDeLivros();
        GerenciadorDeRevistas gerenciadorDeRevistas = new GerenciadorDeRevistas();
        GerenciadorDeEmprestimos gerenciadorDeEmprestimos = new GerenciadorDeEmprestimos();
        CalculadoraDeMultas calculadoraDeMultas = new CalculadoraDeMultas();
        // Adicionando livros e revistas
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        gerenciadorDeLivros.adicionarLivro(livro1);
        Revista revista1 = new Revista("National Geographic", 202);
        gerenciadorDeRevistas.adicionarRevista(revista1);
        // Registrando um empréstimo
        Emprestimo emprestimo1 = new Emprestimo(livro1, "João", LocalDate.now().minusDays(5));
        gerenciadorDeEmprestimos.registrarEmprestimo(emprestimo1);
        // Calculando a multa
        double multa = calculadoraDeMultas.calcularMulta(emprestimo1);
        System.out.println("Multa para João: R$ " + multa);
    }
}