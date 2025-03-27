package empresa;

public class Gerente extends Funcionario {
    private String departamento;

    // Construtor que utiliza 'super' para inicializar os atributos herdados e inicializa os atributos da subclasse
    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    // Sobrescreve o método para incluir informações específicas do gerente
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Departamento: " + departamento);
    }
}
