package empresa;

public class Funcionario {
    private String nome;
    private double salario;

    // Construtor que inicializa os atributos da classe
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Método para exibir os dados do funcionário
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
    }
}
