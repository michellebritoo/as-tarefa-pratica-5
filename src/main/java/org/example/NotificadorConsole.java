package org.example;

// Classe que irá printar no console os avisos do observador
public class NotificadorConsole implements Observador {

    @Override
    public void atualizar(Emprestimo emprestimo) {
        System.out.printf("Notificação: Lembrete para o usuário %s sobre o livro %s. Data de devolução: %s",
                emprestimo.getUsuario().getNome(),
                emprestimo.getLivro().getTitulo(),
                emprestimo.getDataDeDevolucao());
    }
}
