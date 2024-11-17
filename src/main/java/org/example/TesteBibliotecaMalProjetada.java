package org.example;

// Classe principal que coordenava manualmente as operações, porém agora está muito mais simplificada com o uso do BibliotecaFacade
public class TesteBibliotecaMalProjetada {
    public static void main(String[] args) {
        BibliotecaFacade bibliotecaFacade = new BibliotecaFacade();
        // Adicionando livros e revistas
        bibliotecaFacade.adicionarLivro("O Senhor dos Anéis", "J.R.R. Tolkien");
        bibliotecaFacade.adicionarRevista("National Geographic", 202);
        // Registrando um empréstimo
        bibliotecaFacade.registrarEmprestimo("O Senhor dos Anéis", "João");
        // Calculando a multa
        bibliotecaFacade.calcularMultas();
    }
}