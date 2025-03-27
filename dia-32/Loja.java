package lojas;

public class Loja {
    private String nome;
    private String endereco;

    public Loja(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void abrirLoja() {
        System.out.println("Loja " + nome + " está aberta no endereço " + endereco + ".");
    }

    public void fecharLoja() {
        System.out.println("Loja " + nome + " está fechada.");
    }
}
