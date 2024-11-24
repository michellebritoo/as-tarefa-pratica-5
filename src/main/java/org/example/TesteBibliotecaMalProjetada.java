package org.example;

public class TesteBibliotecaMalProjetada {
    public static void main(String[] args) {
        MidiasRepository repository = new MidiasRepositoryImpl(); //instancia da interface que sera consumida na biblioteca
        Biblioteca biblioteca = new Biblioteca(repository);

        Midia livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Midia revista1 = new Revista("National Geographic", 202);

        biblioteca.adicionarMidia(livro1);
        biblioteca.adicionarMidia(revista1);

        System.out.println("\nMídias na biblioteca:");
        biblioteca.exibirMidias();
    }
}