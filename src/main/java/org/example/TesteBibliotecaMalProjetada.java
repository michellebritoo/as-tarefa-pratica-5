package org.example;

public class TesteBibliotecaMalProjetada {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        // Adicionando mídias individuais
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Revista revista1 = new Revista("National Geographic", 202);
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarRevista(revista1);
        // Criando uma coleção de mídias
        ColecaoDeMidias colecao = new ColecaoDeMidias("Coleção Fantasia");
        colecao.adicionarLivro(new Livro("Harry Potter", "J.K. Rowling"));
        colecao.adicionarRevista(new Revista("Comic Book", 1));
        biblioteca.adicionarColecao(colecao);
        // Exibindo a biblioteca
        System.out.println("\nBiblioteca:");
        biblioteca.exibirBiblioteca();
    }
}