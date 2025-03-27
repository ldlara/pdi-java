package sistema;

import acoes.Emprestavel;
import itens.*;


public class Biblioteca {
    public static void main(String[] args) {
        // Criação de itens da biblioteca
        Livro livro1 = new Livro("Java: Como Programar", "Deitel", true);
        Livro livro2 = new Livro("Arquitetura Limpa", "Robert C. Martin", false);
        Revista revista1 = new Revista("Revista Ciência", "Editorial XYZ");
        
        // Exibição de informações
        livro1.exibirInfo();
        livro2.exibirInfo();
        revista1.exibirInfo();
        
        // Teste de empréstimo com tratamento de exceção para livro que não pode ser emprestado
        try {
            livro1.emprestar(); // Deve emprestar com sucesso
            livro2.emprestar(); // Deve lançar a exceção
        } catch (LivroNaoEmprestavelException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
        // Empréstimo da revista
        revista1.emprestar();
        
        // Devolução dos itens
        livro1.devolver();
        revista1.devolver();
    }
}
