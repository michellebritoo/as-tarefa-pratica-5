package org.example;

// Implementação de multa especifica para revista
public class MultaRevista implements MultaStrategy {
    @Override
    public Double calcularMulta(long diasAtraso) {
        return diasAtraso > 0 ? diasAtraso * 1.0 : 0.0;
    }
}
