package org.example;

// Classe ajustada, agora independente da midia a ser adicionada o método utilizado é o mesmo
public class TesteBibliotecaMalProjetada {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        // Adicionando mídias individuais
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Revista revista1 = new Revista("National Geographic", 202);
        biblioteca.adicionarMidia(livro1);
        biblioteca.adicionarMidia(revista1);
        // Exibindo a biblioteca
        System.out.println("\nBiblioteca:");
        biblioteca.exibirBiblioteca();
    }
}