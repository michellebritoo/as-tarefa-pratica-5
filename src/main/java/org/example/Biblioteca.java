package org.example;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        this.emprestimos = new ArrayList<>();
    }

    public void registrarEmprestimo(Emprestimo emprestimo) {
        /**
         * Agora a responsabilidade de criar emprestimos não pertence mais a classe biblioteca
         */
        emprestimos.add(emprestimo);
    }

    public void exibirEmprestimos() {
        for (Emprestimo emprestimo : emprestimos) {
            System.out.println(emprestimo);
        }
    }
}