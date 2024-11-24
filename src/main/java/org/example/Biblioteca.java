package org.example;

public class Biblioteca {
    private MidiasRepository repository; // Classe Biblioteca agora acessar apenas o repositorio e nao as midias diretamente

    public Biblioteca(MidiasRepository repository) {
        this.repository = repository;
    }

    public void adicionarMidia(Midia midia) {
        repository.adicionarMidia(midia);
    }

    public void exibirMidias() {
        repository.listarMidias();
    }
}