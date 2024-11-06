package org.example;

public class TesteBibliotecaMalProjetada {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        MidiaFactory midiaFactory = new MidiaFactory();

        // Criação de mídia não mais dentro da biblioteca
        var livro = midiaFactory.criarObraLiteraria("livro");
        var revista = midiaFactory.criarObraLiteraria("revista");

        biblioteca.adicionarMidia(livro);
        biblioteca.adicionarMidia(revista);

        System.out.println("\nMídias na biblioteca:");
        biblioteca.exibirMidias();
    }
}