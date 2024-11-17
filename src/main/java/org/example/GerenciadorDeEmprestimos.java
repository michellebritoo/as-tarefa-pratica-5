package org.example;

import java.util.ArrayList;
import java.util.List;

// Classe responsável por gerenciar os empréstimos e notificar usuários manualmente
public class GerenciadorDeEmprestimos {
    private List<Emprestimo> emprestimos;
    private List<Observador> observadores;
    public GerenciadorDeEmprestimos() {
        this.observadores = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    // Registra um emprestimo
    public void registrarEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
        System.out.println("Empréstimo registrado para: " + emprestimo.getUsuario().getNome());
        notificarObservadores(emprestimo);
    }

    // Registra a devolução de um emprestimo
    public void registrarDevolucao(Emprestimo emprestimo) {
        emprestimos.remove(emprestimo);
        emprestimo.setDevolvido(true);
        emprestimos.add(emprestimo);
    }

    // Adiciona um observador
    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    // Remove um observador
    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    // Verifica prazos de devolução e notifica devoluções proximas
    public void verificarEmprestimos() {
        emprestimos.forEach(emprestimo -> {
            if (!emprestimo.isDevolvido() && emprestimo.diasParaDevolucao() > 0)
                notificarObservadores(emprestimo);
        });
    }

    // Notificar observadores sobre um emprestimo
    private void notificarObservadores(Emprestimo emprestimo) {
        observadores.forEach(observador -> observador.atualizar(emprestimo));
    }
}