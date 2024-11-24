package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Classe Biblioteca com acoplamento direto à lógica de notificação
public class Biblioteca {
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        this.emprestimos = new ArrayList<>();
    }

    // Registra um empréstimo
    public void registrarEmprestimo(Livro livro, String nomeDoUsuario, String emailDoUsuario, LocalDate dataDeDevolucao) {
        Emprestimo emprestimo = new Emprestimo(livro, nomeDoUsuario, emailDoUsuario, dataDeDevolucao);
        emprestimos.add(emprestimo);
        System.out.println("Empréstimo registrado: Livro \"" + livro.getTitulo() + "\" para " + nomeDoUsuario);
    }

    // Calcula multas e notifica usuários com multas
    public void notificarUsuariosComAtraso() {
        for (Emprestimo emprestimo : emprestimos) {
            if (!emprestimo.isDevolvido()) {
                long diasAtraso = emprestimo.calcularDiasAtraso();
                if (diasAtraso > 0) {
                    enviarEmail(emprestimo.getEmailDoUsuario(), "Multa", "Você tem uma multa de R$ " + (diasAtraso * 2.0) + " pelo livro \"" + emprestimo.getLivro().getTitulo() + "\".");
                }
            }
        }
    }

    // Simula o envio de um e-mail de notificação
    private void enviarEmail(String email, String assunto, String mensagem) {
        System.out.println("Enviando email para: " + email);
        System.out.println("Assunto: " + assunto);
        System.out.println("Mensagem: " + mensagem);
    }
}