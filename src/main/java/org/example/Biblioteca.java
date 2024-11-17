package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Classe Biblioteca sem lógica fixa para calcular multas
public class Biblioteca {
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        this.emprestimos = new ArrayList<>();
    }

    // Registra um empréstimo
    public void registrarEmprestimo(Midia midia, String nomeDoUsuario, LocalDate dataDeDevolucao) {
        Emprestimo emprestimo = new Emprestimo(midia, nomeDoUsuario, dataDeDevolucao);
        emprestimos.add(emprestimo);
        System.out.println("Empréstimo registrado para: " + nomeDoUsuario);
    }

    // Calcula multas de forma dinamica de acordo com o tipo de midia
    public void calcularMultas() {
        for (Emprestimo emprestimo : emprestimos) {
            if (!emprestimo.isDevolvido()) {
                var multa = emprestimo.getMulta();
                if (multa > 0)
                    System.out.println("Usuário: " + emprestimo.getNomeDoUsuario() + ", Multa: R$ " + multa);
            }
        }
    }

    // Devolve um livro
    public void devolverLivro(String tituloDoLivro) {
        for (Emprestimo emprestimo : emprestimos) {
            if
            (emprestimo.getMidia().getTitulo().equals(tituloDoLivro) && !emprestimo.isDevolvido()) {
                emprestimo.setDevolvido(true);
                System.out.println("Livro \"" + tituloDoLivro + "\" devolvido com sucesso.");
                return;
            }
        }
        System.out.println("Erro: Livro \"" + tituloDoLivro + "\" não encontrado ou já devolvido.");
    }
}