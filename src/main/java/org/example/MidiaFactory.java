package org.example;

public class MidiaFactory {

    //Responsável por criar objeto de acordo com tipo solicitado
    public Midia criarObraLiteraria(String tipo) {
        if (tipo.equalsIgnoreCase("Revista"))
            return new Revista("National Geographic", 202);
        if (tipo.equalsIgnoreCase("Livro"))
            return new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        return null;
    }
}
