package org.example.basedadoslivros;

import org.example.Livro;

import java.util.ArrayList;
import java.util.List;

public class BaseDadosExternaLivros {
    private List<Livro> livrosDaBaseDeDados;

    public BaseDadosExternaLivros() {
        List<Livro> generateList = new ArrayList<>();

        generateList.add(new Livro("Dom casmurro"));
        generateList.add(new Livro("Senhor dos anéis"));
        generateList.add(new Livro("Clean code"));
        generateList.add(new Livro("Padrões de projeto"));

        this.livrosDaBaseDeDados = generateList;
    }

    public List<Livro> getLivrosDaBaseDeDados() {
        return livrosDaBaseDeDados;
    }
}
