package sistema;

import transporte.Aviao;
import transporte.Carro;
import transporte.Navio;
import transporte.Movivel;


public class SistemaTransporte {
    public static void main(String[] args) {
        // Cria instâncias de veículos
        Movivel carro = new Carro("Toyota", "Corolla");
        Movivel aviao = new Aviao("Boeing", "747");
        Movivel navio = new Navio("Maersk", "Triple-E");

        // Executa o movimento de cada veículo
        carro.mover();
        aviao.mover();
        navio.mover();
    }
}
