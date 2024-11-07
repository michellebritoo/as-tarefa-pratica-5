package org.example;

public class BibliotecaController {
    private Biblioteca biblioteca;

    public BibliotecaController(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    /**
     * Funcionalidade 1: Registrar empréstimos
     * <p>
     * Explicação da solução: a main não é mais responsável por criar livros e registrar emprestimos
     * O registro de emprestimos agora é responsabilidade da biblioteca controller
     * Enquanto a lista de livros disponíveis vem de um repositório de dados externo
     */
    public void registrarEmprestimo(Livro livro, String usuario) {
        biblioteca.registrarEmprestimo(livro, usuario);
        System.out.printf("\nEmpréstimo registrado: Livro - %s para Usuário: %s", livro, usuario);
    }

    /**
     * Funcionalidade 2: Devolver um livro
     * <p>
     * Explicação da solução: a main não é mais responsável por devolver livros
     * A devolucao passou a ser responsabilidade da bibliotecaController
     */
    public void devolveLivro(Livro livro) {
        biblioteca.devolverLivro(livro);
        System.out.printf("\nO livro: %s foi devolvido", livro.getTitulo());
    }

    /**
     * Funcionalidade 3: Exibir multas
     * <p>
     * Explicação da solução: a main não é mais responsável por devolver livros
     * A devolucao passou a ser responsabilidade da bibliotecaController
     */
    public void exibirMultas() {
        System.out.println("\n\n=-=-=-= MULTAS REGISTRADAS =-=-=-=");
        biblioteca.getEmprestimos().forEach(emprestimo -> {
            if (!emprestimo.isDevolvido()) {
                System.out.println(
                        String.format(
                                "Usuário %s - Livro %s - multa R$ %.2f",
                                emprestimo.getNomeDoUsuario(),
                                emprestimo.getLivro().getTitulo(),
                                emprestimo.calcularMulta()
                        )
                );

            }
        });
    }

    /**
     * Funcionalidade 4: Consultar livros em atraso
     * <p>
     * Explicação da solução: a main não é mais responsável por devolver livros
     * A devolucao passou a ser responsabilidade da bibliotecaController
     */
    public void consultarLivrosAtrasados() {
        System.out.println("\n\n=-=-=-= LIVROS EM ATRASO =-=-=-=");
        biblioteca.getEmprestimos().forEach(emprestimo -> {
            if (emprestimo.estaAtrasado()) {
                System.out.printf(
                        "\nEmprestimo em atraso %s - usuário %s",
                        emprestimo.getLivro().getTitulo(),
                        emprestimo.getNomeDoUsuario()
                );
            }
        });
    }
}
