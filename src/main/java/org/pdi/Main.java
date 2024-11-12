package org.pdi;

import org.pdi.Carro;
import org.pdi.Esportivo;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.cor = "Vermelho";
        meuCarro.modelo = "Gol";
        meuCarro.acelerar();

        Esportivo meuEsportivo = new Esportivo();
        meuEsportivo.cor = "Prata";
        meuEsportivo.modelo = "Porsche";
        meuEsportivo.acelerarTurbo();
    }
}