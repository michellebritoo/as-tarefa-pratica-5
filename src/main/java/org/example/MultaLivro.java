package org.example;

// Implementação de multa especifica para livro
public class MultaLivro implements MultaStrategy {
    @Override
    public Double calcularMulta(long diasAtraso) {
        return diasAtraso > 0 ? diasAtraso * 2.0 : 0.0;
    }
}
