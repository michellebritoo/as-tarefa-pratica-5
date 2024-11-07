package org.example;

public class TesteBibliotecaMalProjetada {
    public static void main(String[] args) {
        // Duas bibliotecas com diferentes configurações - Não mais
        Biblioteca biblioteca1 = new Biblioteca("08:00 - 18:00", 2.0);
        Biblioteca biblioteca2 = new Biblioteca("09:00 - 17:00", 1.5);
        biblioteca1.adicionarLivro("O Senhor dos Anéis");
        biblioteca2.adicionarLivro("1984");
        System.out.println("\nConfigurações da Biblioteca 1:");
        biblioteca1.exibirConfiguracoes();
        // Mesmo criando duas instancias de configurações, os parametros da segunda serão ignorados pois ja existia uma instancia
        System.out.println("\nConfigurações da Biblioteca 2:");
        biblioteca2.exibirConfiguracoes();
    }
}