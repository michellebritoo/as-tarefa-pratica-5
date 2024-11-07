package org.example;

import org.example.basedadoslivros.BaseDadosExternaLivros;

import java.util.List;

/**
 * Acoplamento excessivo: A classe TesteBibliotecaMalProjetada está diretamente
 * manipulando os objetos Livro e Emprestimo, além de acessar métodos internos da classe Biblioteca.
 * Isso resulta em uma interface de usuário (o método main) muito dependente das classes de domínio.
 *
 * Baixa coesão: A lógica de controle está espalhada no código da classe main,
 * o que dificulta a manutenção e a evolução do código. Isso cria um código confuso,
 * onde a responsabilidade de controlar as operações não está claramente definida.
 *
 * Falta de separação de responsabilidades: Não há uma camada de controle entre a interface de usuário e as classes
 * de domínio. Toda a lógica de controle está misturada com as operações de teste, o que não segue boas práticas de design.
 */

public class TesteBibliotecaMalProjetada {
    public static void main(String[] args) {
        // Instância base de biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Lista de livros que viria de uma base de dados externa
        List<Livro> listaLivrosBaseDeDados = new BaseDadosExternaLivros().getLivrosDaBaseDeDados();

        // Controlador que encapsula as funcionalidades do sistema
        BibliotecaController controller = new BibliotecaController(biblioteca);

        // Funcionalidade 1: Registrar empréstimos
        controller.registrarEmprestimo(listaLivrosBaseDeDados.get(0), "Michelle");
        controller.registrarEmprestimo(listaLivrosBaseDeDados.get(1), "Thauã");
        controller.registrarEmprestimo(listaLivrosBaseDeDados.get(2), "Assis");
        controller.registrarEmprestimo(listaLivrosBaseDeDados.get(3), "Sápiras");

        // Funcionalidade 3: Exibir multas
        controller.exibirMultas();

        // Funcionalidade 2: Devolver livros
        controller.devolveLivro(listaLivrosBaseDeDados.get(1));
        controller.devolveLivro(listaLivrosBaseDeDados.get(2));

        // Funcionalidade 4: Consultar livros em atraso
        controller.consultarLivrosAtrasados();
    }
}