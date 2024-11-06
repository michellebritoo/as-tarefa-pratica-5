package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Emprestimo {
    private Livro livro;
    private String nomeDoUsuario;
    private LocalDate dataDeEmprestimo;
    private LocalDate dataDeDevolucao;

    public Emprestimo(Livro livro, String nomeDoUsuario, LocalDate dataDeEmprestimo, LocalDate dataDeDevolucao) {
        this.livro = livro;
        this.nomeDoUsuario = nomeDoUsuario;
        this.dataDeEmprestimo = dataDeEmprestimo;
        this.dataDeDevolucao = dataDeDevolucao;
    }

    public LocalDate getDataDeDevolucao() {
        return dataDeDevolucao;
    }

    public String getNomeDoUsuario() {
        return nomeDoUsuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public double calcularMulta() {
        long diasAtraso = ChronoUnit.DAYS.between(this.getDataDeDevolucao(), LocalDate.now());
        double multaPorDia = 2.0;
        if (diasAtraso > 0) {
            return diasAtraso * multaPorDia;
        }
        return 0.0;
    }

    @Override
    public String toString() {
        return "Livro emprestado: " + livro.getTitulo() + " para " +
                nomeDoUsuario + ", Data de Devolução: " + dataDeDevolucao;
    }
}
