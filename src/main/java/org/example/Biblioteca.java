package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        this.emprestimos = new ArrayList<>();
    }

    public void registrarEmprestimo(Livro livro, String nomeDoUsuario, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        Emprestimo emprestimo = new Emprestimo(livro, nomeDoUsuario, dataEmprestimo, dataDevolucao);
        emprestimos.add(emprestimo);
    }

    // Método mal projetado que calcula a multa diretamente
    public double calcularMulta(Emprestimo emprestimo) {
        long diasAtraso = ChronoUnit.DAYS.between(emprestimo.getDataDeDevolucao(), LocalDate.now());
        double multaPorDia = 2.0;
        if (diasAtraso > 0) {
            return diasAtraso * multaPorDia;
        }
        return 0.0;
    }

    public void exibirMultas() {
        for (Emprestimo emprestimo : emprestimos) {
            double multa = calcularMulta(emprestimo);
            System.out.println("Usuário: " + emprestimo.getNomeDoUsuario() + ", Multa: R$ " + multa);
        }
    }
}