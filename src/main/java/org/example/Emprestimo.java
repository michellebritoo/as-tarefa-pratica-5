package org.example;

import java.time.LocalDate;

public class Emprestimo {
    private Livro livro;
    private String nomeDoUsuario;
    private LocalDate dataDeDevolucao;

    public Emprestimo(Livro livro, String nomeDoUsuario, LocalDate dataDeDevolucao) {
        this.livro = livro;
        this.nomeDoUsuario = nomeDoUsuario;
        this.dataDeDevolucao = dataDeDevolucao;
    }

    public String getNomeDoUsuario() {
        return nomeDoUsuario;
    }

    public LocalDate getDataDeDevolucao() {
        return dataDeDevolucao;
    }

    public Livro getLivro() {
        return livro;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "livro=" + livro +
                ", nomeDoUsuario='" + nomeDoUsuario + '\'' +
                ", dataDevolução=" + dataDeDevolucao +
                '}';
    }
}