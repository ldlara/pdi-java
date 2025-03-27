package veiculos;

import movimentos.mover;


public class Aviao implements Movivel {
    private String modelo;

    public Aviao(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void mover() {
        System.out.println("O avião " + modelo + " está voando pelos céus.");
    }
}
