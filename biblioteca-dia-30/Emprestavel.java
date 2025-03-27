package acoes;

public interface Emprestavel {
    void emprestar() throws LivroNaoEmprestavelException;
    void devolver();
}
