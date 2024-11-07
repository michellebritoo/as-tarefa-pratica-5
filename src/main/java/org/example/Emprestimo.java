package org.example;

import java.time.LocalDate;

// Classe que representa um empréstimo
public class Emprestimo {
    private Object midia;
    private MultaStrategy multaStrategy;
    private String nomeDoUsuario;
    private LocalDate dataDeDevolucao;
    private boolean devolvido;
    public Emprestimo(Object midia, String nomeDoUsuario, LocalDate
            dataDeDevolucao) {
        this.midia = midia;
        this.nomeDoUsuario = nomeDoUsuario;
        this.dataDeDevolucao = dataDeDevolucao;
        this.devolvido = false;
        // Strategy instanciado de acordo com o tipo de midia do emprestimo
        this.multaStrategy = midia instanceof Livro ? new MultaLivro() : new MultaRevista();
    }
    public boolean isDevolvido() {
        return devolvido;
    }
    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }
    public long calcularDiasAtraso() {
        return LocalDate.now().toEpochDay() -
                dataDeDevolucao.toEpochDay();
    }
    public String getNomeDoUsuario() {
        return nomeDoUsuario;
    }
    public Object getMidia() {
        return midia;
    }

    // Método responsavel por ja calcular o valor da multa de acordo com o tipo de multa de cada objeto utilizando o strategy
    public double getMulta() {
        return multaStrategy.calcularMulta(calcularDiasAtraso());
    }
}