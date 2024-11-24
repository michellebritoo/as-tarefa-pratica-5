package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmprestimoServiceImpl implements EmprestimoService {
    private Biblioteca biblioteca;
    private List<Emprestimo> emprestimos;

    public EmprestimoServiceImpl(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
        this.emprestimos = new ArrayList<>();
    }

    @Override
    public void registrarEmprestimo(String titulo, String usuario, LocalDate dataDevolucao) {
        Livro livroParaRegistrar = biblioteca.encontrarLivro(titulo);

        if (livroParaRegistrar != null) {
            Emprestimo emprestimo = new Emprestimo(livroParaRegistrar, usuario, dataDevolucao);
            emprestimos.add(emprestimo);

            System.out.println("Empréstimo registrado: Livro \"" + titulo + "\" para " + usuario);
        }
    }

    @Override
    public void devolverLivro(String titulo) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getLivro().getTitulo().equals(titulo) && !emprestimo.isDevolvido()) {
                emprestimo.setDevolvido(true);
                System.out.println("Devolvido: \"" + titulo);
            }
        }
    }

    @Override
    public void calcularMultas() {
        for (Emprestimo emprestimo : emprestimos) {
            if (!emprestimo.isDevolvido()) { emprestimo.calcularMulta(); }
        }
    }
}
