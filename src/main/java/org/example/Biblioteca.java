package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Classe Biblioteca com lógica fixa para calcular multas
public class Biblioteca {
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        this.emprestimos = new ArrayList<>();
    }

    // Registra um empréstimo
    public void registrarEmprestimo(Object midia, String
            nomeDoUsuario, LocalDate dataDeDevolucao) {
        Emprestimo emprestimo = new Emprestimo(midia, nomeDoUsuario, dataDeDevolucao);
        emprestimos.add(emprestimo);
        System.out.println("Empréstimo registrado para: " + nomeDoUsuario);
    }

    // Calcula multas com lógica fixa usando if-else
    public void calcularMultas() {
        for (Emprestimo emprestimo : emprestimos) {
            if (!emprestimo.isDevolvido()) {
                var multa = emprestimo.getMulta();
                if (multa > 0)
                    System.out.println("Usuário: " + emprestimo.getNomeDoUsuario() + ", Multa: R$ " + multa);
            }
        }
    }
}