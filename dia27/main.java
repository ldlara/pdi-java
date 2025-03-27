package empresa;

public class Teste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João", 3000.0);
        Gerente gerente = new Gerente("Maria", 5000.0, "TI");

        System.out.println("Dados do Funcionário:");
        funcionario.exibirDados();

        System.out.println("\nDados do Gerente:");
        gerente.exibirDados();
    }
}
