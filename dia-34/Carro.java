package transporte;

public class Carro extends Veiculo implements Movivel {

    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mover() {
        System.out.println("O carro " + getMarca() + " " + getModelo() + " está rodando na estrada.");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Carro: " + getMarca() + " " + getModelo());
    }
}
