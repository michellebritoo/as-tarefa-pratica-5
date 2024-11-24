package org.example;

public class NotificationServiceImpl implements NotificationService {

    /**
     * Método que envia a notificacao de atraso com os dados enviados por outra classe
     * Essa classe nao deve acessar diretamente o emprestimo, apenas enviar a notificacao
     */
    @Override
    public void notificarAtraso(String email, String livro, Long diasAtraso) {
        enviarEmail(email, "Multa", "Multa de R$ " + (diasAtraso * 2.0) + " pelo livro \"" + livro);
    }

    // Simula o envio de um e-mail de notificação
    private void enviarEmail(String email, String assunto, String mensagem) {
        System.out.println("Enviando email para: " + email);
        System.out.println("Assunto: " + assunto);
        System.out.println("Mensagem: " + mensagem);
    }
}
