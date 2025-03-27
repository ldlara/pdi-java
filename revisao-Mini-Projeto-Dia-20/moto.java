package veiculos;

// Subclasse Moto que herda de Veiculo
class Moto extends Veiculo {
    private boolean temSidecar; // atributo específico de Moto

    public Moto(String marca, String modelo, boolean temSidecar) {
        super(marca, modelo);
        this.temSidecar = temSidecar;
    }

    public boolean isTemSidecar() {
        return temSidecar;
    }

    public void setTemSidecar(boolean temSidecar) {
        this.temSidecar = temSidecar;
    }
    
    // Sobrescrita do método exibirInfo para incluir informações específicas da moto
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Tem sidecar: " + (temSidecar ? "Sim" : "Não"));
    }
}