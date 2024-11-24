package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Classe Biblioteca sem acoplamento direto à lógica de notificação
public class Biblioteca {
    private List<Emprestimo> emprestimos;
    private NotificationService notificationService;

    public Biblioteca() {
        this.emprestimos = new ArrayList<>();
        this.notificationService = new NotificationServiceImpl();
    }

    // Registra um empréstimo
    public void registrarEmprestimo(Livro livro, String nomeDoUsuario, String emailDoUsuario, LocalDate dataDeDevolucao) {
        Emprestimo emprestimo = new Emprestimo(livro, nomeDoUsuario, emailDoUsuario, dataDeDevolucao);
        emprestimos.add(emprestimo);
        System.out.println("Empréstimo registrado: Livro \"" + livro.getTitulo() + "\" para " + nomeDoUsuario);
    }

    /**
     * Consome o notification service e passa por parametro os dados para que a notificação seja enviada
     * Nao sendo necessario fazer o envio das notificacoes diretamente
     */
    public void notificarUsuariosComAtraso() {
        for (Emprestimo emprestimo : emprestimos) {
            if (!emprestimo.isDevolvido()) {
                long diasAtraso = emprestimo.calcularDiasAtraso();
                if (diasAtraso > 0) {
                    notificationService.notificarAtraso(emprestimo.getEmailDoUsuario(), emprestimo.getLivro().getTitulo(), diasAtraso);
                }
            }
        }
    }
}