package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Classe Biblioteca diretamente acoplada ao serviço externo de pagamento
public class Biblioteca {
    private List<Emprestimo> emprestimos;
    private PagamentoMulta pagamentoMulta;

    public Biblioteca(PagamentoMulta pagamentoMulta) {
        this.emprestimos = new ArrayList<Emprestimo>();
        this.pagamentoMulta = pagamentoMulta;
    }

    // Registra um empréstimo
    public void registrarEmprestimo(Livro livro, String nomeDoUsuario, LocalDate dataDeDevolucao) {
        Emprestimo emprestimo = new Emprestimo(livro, nomeDoUsuario, dataDeDevolucao);
        emprestimos.add(emprestimo);
        System.out.println("Empréstimo registrado: Livro \"" + livro.getTitulo() + "\" para " + nomeDoUsuario);
    }

    // Processa as multas e paga através do serviço de pagamento externo
    public void processarPagamentosDeMultas() {
        for (Emprestimo emprestimo : emprestimos) {
            if (!emprestimo.isDevolvido() && emprestimo.calcularDiasAtraso() > 0) {
                double multa = emprestimo.calcularMulta();
                pagamentoMulta.pagar(emprestimo.getNomeDoUsuario(), multa);
            }
        }
    }
}