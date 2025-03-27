import veiculos.Carro;
import veiculos.Aviao;


public class TesteMovimentos {
    public static void main(String[] args) {
        Movivel carro = new Carro("Fusca");
        Movivel aviao = new Aviao("Boeing 747");

        carro.mover();
        aviao.mover();
    }
}
