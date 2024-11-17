package org.example;

import java.util.ArrayList;
import java.util.List;

// Classe que gerencia empréstimos
public class GerenciadorDeEmprestimos {
    private List<Emprestimo> emprestimos;
    public GerenciadorDeEmprestimos() {
        this.emprestimos = new ArrayList<>();
    }
    public void registrarEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
        System.out.println("Empréstimo registrado para: " +
                emprestimo.getNomeDoUsuario());
    }
}