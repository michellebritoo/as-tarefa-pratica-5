package org.example;

import java.time.LocalDate;
import java.util.Objects;

// Classe Fachada que vai abstrair a complexidade para o sistema da biblioteca, ficando com toda a responsabilidade interna
public class BibliotecaFacade {

    private final GerenciadorDeEmprestimos gerenciadorDeEmprestimos = new GerenciadorDeEmprestimos();
    private final GerenciadorDeRevistas gerenciadorDeRevistas = new GerenciadorDeRevistas();
    private final GerenciadorDeLivros gerenciadorDeLivros = new GerenciadorDeLivros();
    private final CalculadoraDeMultas calculadoraDeMultas = new CalculadoraDeMultas();

    // Toda a lógica que antes estava na classe do serviço de biblioteca foi transferida para o Facade
    public void adicionarLivro(String titulo, String autor) {
        var livro = new Livro(titulo, autor);
        gerenciadorDeLivros.adicionarLivro(livro);
    }

    public void adicionarRevista(String titulo, int edicao) {
        var revista = new Revista(titulo, edicao);
        gerenciadorDeRevistas.adicionarRevista(revista);
    }

    public void registrarEmprestimo(String tituloDoLivro, String nomeDoUsuario) {
        var livrosDisponiveis = gerenciadorDeLivros.getLivros();
        Livro livroEscolhido = null;
        for (Livro livro : livrosDisponiveis) {
            if (livro.getTitulo().equalsIgnoreCase(tituloDoLivro)) {
                livroEscolhido = livro;
                break;
            }
        }
        if (Objects.nonNull(livroEscolhido)) {
            var emprestimo = new Emprestimo(livroEscolhido, nomeDoUsuario, LocalDate.now().plusDays(7));
            gerenciadorDeEmprestimos.registrarEmprestimo(emprestimo);
        } else {
            System.out.println("Livro Indisponível");
        }
    }

    public void calcularMultas() {
        var emprestimos = gerenciadorDeEmprestimos.getEmprestimos();
        emprestimos.forEach(emprestimo -> {
            var multa = calculadoraDeMultas.calcularMulta(emprestimo);
            if (multa > 0) System.out.printf("\nUsuário: %s, Multa: %s%n", emprestimo.getNomeDoUsuario(), multa);
            else System.out.printf("\nUsuário: %s não possui multa para o livro %s", emprestimo.getNomeDoUsuario(), emprestimo.getLivro().getTitulo());
        });
    }
}
