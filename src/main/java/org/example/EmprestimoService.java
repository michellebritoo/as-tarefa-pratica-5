package org.example;

import java.time.LocalDate;

public interface EmprestimoService {
    void registrarEmprestimo(String titulo, String usuario, LocalDate dataDevolucao);
    void devolverLivro(String titulo);
    void calcularMultas();
}
