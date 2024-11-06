package org.example;

import java.time.LocalDate;

/**
 * Acoplamento excessivo: A classe TesteBibliotecaMalProjetada está diretamente
 * manipulando os objetos Livro e Emprestimo, além de acessar métodos internos da classe Biblioteca.
 * Isso resulta em uma interface de usuário (o método main) muito dependente das classes de domínio.
 *
 * Baixa coesão: A lógica de controle está espalhada no código da classe main,
 * o que dificulta a manutenção e a evolução do código. Isso cria um código confuso,
 * onde a responsabilidade de controlar as operações não está claramente definida.
 *
 * Falta de separação de responsabilidades: Não há uma camada de controle entre a interface de usuário e as classes
 * de domínio. Toda a lógica de controle está misturada com as operações de teste, o que não segue boas práticas de design.
 */

public class TesteBibliotecaMalProjetada {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Funcionalidade 1: Registrar empréstimos
        Livro livro1 = new Livro("O Senhor dos Anéis");
        Livro livro2 = new Livro("1984");
        biblioteca.registrarEmprestimo(livro1, "João", LocalDate.now().minusDays(5));
        biblioteca.registrarEmprestimo(livro2, "Maria", LocalDate.now().minusDays(10));

        // Funcionalidade 3: Exibir multas
        System.out.println("\nMultas registradas:");
        for (Emprestimo emprestimo : biblioteca.getEmprestimos()) {
            if (!emprestimo.isDevolvido()) {
                double multa = emprestimo.calcularMulta();
                System.out.println("Usuário: " + emprestimo.getNomeDoUsuario() + ", Livro: " + emprestimo.getLivro().getTitulo() + ", Multa: R$ " + multa);
            }
        }

        // Funcionalidade 2: Devolver um livro
        System.out.println("\nDevolvendo livro 1984...");
        biblioteca.devolverLivro(livro2);

        // Funcionalidade 3: Exibir multas novamente
        System.out.println("\nMultas após devolução:");
        for (Emprestimo emprestimo : biblioteca.getEmprestimos()) {
            if (!emprestimo.isDevolvido()) {
                double multa = emprestimo.calcularMulta();
                System.out.println("Usuário: " + emprestimo.getNomeDoUsuario() + ", Livro: " + emprestimo.getLivro().getTitulo() + ", Multa: R$ " + multa);
            }
        }

        // Funcionalidade 4: Consultar livros em atraso
        System.out.println("\nConsultando livros em atraso:");
        for (Emprestimo emprestimo : biblioteca.getEmprestimos()) {
            if (emprestimo.estaAtrasado()) {
                System.out.println(emprestimo);
            }
        }
    }
}