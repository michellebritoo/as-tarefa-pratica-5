package org.example;

import java.time.LocalDate;

public class TesteBibliotecaMalProjetada {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.registrarEmprestimo("O senhor do anáis", "João", LocalDate.now());
        biblioteca.registrarEmprestimo("1984", "Maria", LocalDate.now());
    }
}