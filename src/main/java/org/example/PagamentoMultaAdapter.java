package org.example;

public class PagamentoMultaAdapter implements PagamentoMulta {

    private ServicoPagamentoExterno servicoPagamento;

    public PagamentoMultaAdapter(ServicoPagamentoExterno servicoPagamento) {
        this.servicoPagamento = servicoPagamento;
    }

    public void pagar(String usuario, double valor) {
/*
    Caso o serviço de pagamento mudar basta alterar o adapter, assim não é preciso alterar a biblioteca
    O adapter se encarregaria de "traduzir" o nome do usuário para o identificador que o serviço externo espera caso necessário
*/
        String identificador = String.valueOf(usuario.hashCode());
        servicoPagamento.pagarFatura(identificador, valor);
    }

}