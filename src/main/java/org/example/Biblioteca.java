package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Emprestimo> emprestimos;
    private int diasEmprestimo = 5;

    public Biblioteca() {
        this.emprestimos = new ArrayList<>();
    }

    public void registrarEmprestimo(Livro livro, String nomeDoUsuario) {
        Emprestimo emprestimo = new Emprestimo(livro, nomeDoUsuario, LocalDate.now().minusDays(diasEmprestimo));
        emprestimos.add(emprestimo);
    }

    public void devolverLivro(Livro livro) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getLivro().equals(livro) && !emprestimo.isDevolvido()) {
                emprestimo.setDevolvido(true);

                System.out.println("Livro " + livro.getTitulo() + " devolvido com sucesso.");
                return;
            }
        }
        System.out.println("Erro: Livro não encontrado ou já devolvido.");
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }
}