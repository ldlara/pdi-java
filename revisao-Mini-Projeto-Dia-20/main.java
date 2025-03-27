
package sistema;

import veiculos.Veiculo;
import veiculos.Carro;
import veiculos.Moto;

public class Garagem {
    // Lista para armazenar os veículos (polimorfismo: tanto Carro quanto Moto são do tipo Veiculo)
    private ArrayList<Veiculo> veiculos;

    public Garagem() {
        veiculos = new ArrayList<>();
    }
    
    // Método para adicionar um veículo na garagem
    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }
    
    // Método para listar todos os veículos da garagem utilizando laço de repetição
    public void listarVeiculos() {
        System.out.println("Lista de veículos na garagem:");
        for (Veiculo veiculo : veiculos) {
            veiculo.exibirInfo();
            System.out.println("----------------------");
        }
    }
    
    // Método principal para testar a aplicação
    public static void main(String[] args) {
        Garagem garagem = new Garagem();
        
        // Criando instâncias de Carro e Moto
        Carro carro1 = new Carro("Toyota", "Corolla", 4);
        Moto moto1 = new Moto("Honda", "CB500", false);
        
        // Adicionando os veículos na garagem
        garagem.adicionarVeiculo(carro1);
        garagem.adicionarVeiculo(moto1);
        
        // Listando os veículos na garagem
        garagem.listarVeiculos();
    }
}
