package org.example;

// Interface externa de serviço de pagamento
public class ServicoPagamentoExterno {
    public void pagarFatura(String identificador, double valor) {
        System.out.println("Pagamento de R$ " + valor + " processado para o identificador: " + identificador);
    }
}