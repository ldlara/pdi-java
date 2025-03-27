package principal;

import lojas.Loja;
import lojas.Supermercado;
import lojas.Farmacia;

public class TesteLojas {
    public static void main(String[] args) {
        // Instanciando um supermercado e uma farmácia
        Supermercado supermercado = new Supermercado("Supermercado Central", "Rua das Flores, 123");
        Farmacia farmacia = new Farmacia("Farmácia Saúde", "Av. Brasil, 456", true);

        // Operações com o supermercado
        supermercado.abrirLoja();
        supermercado.atenderCliente();
        supermercado.fecharLoja();

        System.out.println();

        // Operações com a farmácia
        farmacia.abrirLoja();
        farmacia.consultarFarmaceutico();
        farmacia.fecharLoja();
    }
}
