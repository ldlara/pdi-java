package transporte;

public class Aviao extends Veiculo implements Movivel {

    public Aviao(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mover() {
        System.out.println("O avião " + getMarca() + " " + getModelo() + " está voando pelos céus.");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Avião: " + getMarca() + " " + getModelo());
    }
}
