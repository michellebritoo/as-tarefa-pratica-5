package org.example;

import java.time.LocalDate;

public class TesteBibliotecaMalProjetada {
    public static void main(String[] args) {
        GerenciadorDeEmprestimos gerenciador = new GerenciadorDeEmprestimos();

        // Criar observadores
        Observador notificadorConsole = new NotificadorConsole();

        // Adicionar observadores ao gerenciador
        gerenciador.adicionarObservador(notificadorConsole);

        // Criar livro, usuário e empréstimo
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Usuario usuario = new Usuario("João", "joao@email.com");
        Emprestimo emprestimo = new Emprestimo(livro, usuario, LocalDate.now().minusDays(3));

        // Registrar o empréstimo (irá notificar automaticamente)
        gerenciador.registrarEmprestimo(emprestimo);

        // Verificar prazos de devolução (irá notificar novamente, se necessário)
        System.out.println("\nVerificando notificações:");
        gerenciador.verificarEmprestimos();

        // Devolvendo livro para simular se ainda irá notificar
        gerenciador.registrarDevolucao(emprestimo);
        System.out.println("\nEmprestimo devolvido");
        gerenciador.verificarEmprestimos();
    }
}