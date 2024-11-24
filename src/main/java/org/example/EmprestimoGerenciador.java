package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Essa classe funciona como um controlador ou gerencidor para emprestimos
 * Sendo assim encapsula a logica de emprestimos, mantendo emprestimo apenas como uma model
 */
public class EmprestimoGerenciador {
    private List<Emprestimo> emprestimos;

    public EmprestimoGerenciador() {
        this.emprestimos = new ArrayList<>();
    }

    public void salvarEmprestimo(
            Livro livro,
            String nomeUsuario,
            LocalDate dataDevolucao
    ) {
        Emprestimo emprestimo = new Emprestimo(livro, nomeUsuario, dataDevolucao);
        emprestimos.add(emprestimo);
        System.out.println("Empréstimo: \"" + livro.getTitulo() + "\" - " + nomeUsuario);
    }

    public void devolveLivro(String titulo) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getLivro().getTitulo().equals(titulo) && !emprestimo.isDevolvido()) {
                emprestimo.setDevolvido(true);
                System.out.println("Livro devolvido \"" + titulo);
            }
        }
    }

    public void calculaMulta() {
        for (Emprestimo emprestimo : emprestimos) {
            if (!emprestimo.isDevolvido()) {
                double valor = emprestimo.calcularMulta();
                System.out.println("Usuário: " + emprestimo.getNomeDoUsuario() + ", Multa: R$ " + valor);
            }
        }
    }
}
