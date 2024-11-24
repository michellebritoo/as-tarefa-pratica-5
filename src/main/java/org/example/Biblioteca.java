package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros; // Gerencia os livros diretamente
    private List<Emprestimo> emprestimos; // Gerencia os empréstimos diretamente

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    // Adiciona um livro diretamente à lista
    public void adicionarLivro(String titulo) {
        Livro livro = new Livro(titulo);
        livros.add(livro);
        System.out.println("Livro \"" + titulo + "\" adicionado à biblioteca.");
    }

    // Registra um empréstimo diretamente
    public void registrarEmprestimo(String tituloDoLivro, String
            nomeDoUsuario, LocalDate dataDeDevolucao) {
        Livro livro = encontrarLivro(tituloDoLivro);

        if (livro != null) {
            Emprestimo emprestimo = new Emprestimo(livro,
                    nomeDoUsuario, dataDeDevolucao);
            emprestimos.add(emprestimo);
            System.out.println("Empréstimo registrado: Livro \"" +
                    tituloDoLivro + "\" para " + nomeDoUsuario);
        } else {
            System.out.println("Erro: Livro \"" + tituloDoLivro + "\" não encontrado.");
        }
    }

    // Devolve um livro diretamente
    public void devolverLivro(String tituloDoLivro) {
        for (Emprestimo emprestimo : emprestimos) {
            if
            (emprestimo.getLivro().getTitulo().equals(tituloDoLivro) &&
                    !emprestimo.isDevolvido()) {
                emprestimo.setDevolvido(true);
                System.out.println("Livro \"" + tituloDoLivro + "\" devolvido com sucesso.");
                return;
            }
        }
        System.out.println("Erro: Livro \"" + tituloDoLivro + "\" não encontrado ou já devolvido.");
    }

    // Calcula multas diretamente
    public void calcularMultas() {
        for (Emprestimo emprestimo : emprestimos) {
            if (!emprestimo.isDevolvido()) {
                long diasAtraso = LocalDate.now().toEpochDay() -
                        emprestimo.getDataDeDevolucao().toEpochDay();
                double multa = diasAtraso > 0 ? diasAtraso * 2 : 0;
                System.out.println("Usuário: " +
                        emprestimo.getNomeDoUsuario() + ", Multa: R$ " + multa);
            }
        }
    }

    // Método interno para encontrar um livro na lista
    private Livro encontrarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                return livro;
            }
        }
        return null;
    }
}