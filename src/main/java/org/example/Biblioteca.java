package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros; // Gerencia os livros
    private List<Emprestimo> emprestimos; // Gerencia os empréstimos

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    // Função para adicionar um livro
    public void adicionarLivro(String titulo) {
        Livro livro = new Livro(titulo);
        livros.add(livro);
        System.out.println("Livro \"" + titulo + "\" adicionado à biblioteca.");
    }

    // Função para registrar um empréstimo
    public void registrarEmprestimo(String tituloDoLivro, String nomeDoUsuario, LocalDate dataDeDevolucao) {
        Livro livro = encontrarLivro(tituloDoLivro);

        if (livro != null) {
            Emprestimo emprestimo = new Emprestimo(livro, nomeDoUsuario, dataDeDevolucao);
            emprestimos.add(emprestimo);
            System.out.println("Empréstimo registrado: Livro \"" + tituloDoLivro + "\" para " + nomeDoUsuario);
        } else {
            System.out.println("Erro: Livro \"" + tituloDoLivro + "\" não encontrado.");
        }
    }

    // Função para devolver um livro
    public void devolverLivro(String tituloDoLivro) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getLivro().getTitulo().equals(tituloDoLivro) && !emprestimo.isDevolvido()) {
                emprestimo.setDevolvido(true);
                System.out.println("Livro \"" + tituloDoLivro + "\" devolvido com sucesso."); return;
            }
        } System.out.println("Erro: Livro \"" + tituloDoLivro + "\" não encontrado ou já devolvido.");
    }

    // Função para calcular multas de todos os empréstimos
    public void calcularMultas() {
        for (Emprestimo emprestimo : emprestimos) {
            if (!emprestimo.isDevolvido()) {
                double multa = emprestimo.calcularMulta();
                System.out.println("Usuário: " + emprestimo.getNomeDoUsuario() + ", Multa: R$ " + multa);
            }
        }
    }

    // Função para encontrar um livro pelo título
    private Livro encontrarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                return livro;
            }
        }
        return null;
    }
}