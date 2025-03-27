package veiculos;

import movimentos.mover;

public class Carro implements Movivel {
    private String modelo;

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void mover() {
        System.out.println("O carro " + modelo + " está se deslocando pela estrada.");
    }
}
