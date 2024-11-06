package org.example;

public class TesteBibliotecaMalProjetada {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
// Criação de mídia diretamente dentro da biblioteca
        biblioteca.adicionarMidia("Livro", "O Senhor dos Anéis", "J.R.R. Tolkien");
        biblioteca.adicionarMidia("Revista", "National Geographic", "202");

        System.out.println("\nMídias na biblioteca:");
        biblioteca.exibirMidias();
    }
}