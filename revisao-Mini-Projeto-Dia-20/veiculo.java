package veiculos;

public class Veiculo {
    // Atributos privados para encapsulamento
    private String marca;
    private String modelo;

    // Construtor
    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Métodos getters e setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    // Método para exibir informações do veículo (pode ser sobrescrito)
    public void exibirInfo() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo);
    }
}
