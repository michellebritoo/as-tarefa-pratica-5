package org.example;

import java.time.LocalDate;

public class TesteBibliotecaMalProjetada {
    public static void main(String[] args) {
        GerenciadorDeEmprestimos gerenciador = new GerenciadorDeEmprestimos();
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Usuario usuario = new Usuario("João", "joao@email.com");
        Emprestimo emprestimo = new Emprestimo(livro, usuario, LocalDate.now().plusDays(3));
        // Registrando o empréstimo
        gerenciador.registrarEmprestimo(emprestimo);
        // Verificar e enviar notificações (manual)
        System.out.println("\nVerificando notificações:");
        gerenciador.verificarEEnviarNotificacoes();
    }
}