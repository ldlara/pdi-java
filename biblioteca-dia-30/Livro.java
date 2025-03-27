package itens;

import acoes.Emprestavel;
import itens.LivroNaoEmprestavelException;


public class Livro extends Item implements Emprestavel {
    private boolean emprestado;
    private boolean podeEmprestar;
    
    public Livro(String titulo, String autor, boolean podeEmprestar) {
        super(titulo, autor);
        this.podeEmprestar = podeEmprestar;
        this.emprestado = false;
    }
    
    @Override
    public void emprestar() throws LivroNaoEmprestavelException {
        if (!podeEmprestar) {
            throw new LivroNaoEmprestavelException("Este livro não pode ser emprestado: " + getTitulo());
        }
        if (emprestado) {
            System.out.println("O livro já está emprestado: " + getTitulo());
        } else {
            emprestado = true;
            System.out.println("Livro emprestado com sucesso: " + getTitulo());
        }
    }
    
    @Override
    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Livro devolvido: " + getTitulo());
        } else {
            System.out.println("O livro não estava emprestado: " + getTitulo());
        }
    }
    
    @Override
    public void exibirInfo() {
        System.out.println("Livro: " + getTitulo() + " | Autor: " + getAutor());
    }
}
