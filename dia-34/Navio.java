package transporte;

public class Navio extends Veiculo implements Movivel {

    public Navio(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mover() {
        System.out.println("O navio " + getMarca() + " " + getModelo() + " está navegando pelo mar.");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Navio: " + getMarca() + " " + getModelo());
    }
}
