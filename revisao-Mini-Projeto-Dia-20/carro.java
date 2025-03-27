package veiculos;

// Subclasse Carro que herda de Veiculo
class Carro extends Veiculo {
    private int portas; // atributo específico de Carro

    public Carro(String marca, String modelo, int portas) {
        super(marca, modelo);
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }
    
    // Sobrescrita do método exibirInfo para incluir informações específicas do carro
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Portas: " + portas);
    }
}