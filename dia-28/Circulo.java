package formas;

public class Circulo extends FormaGeometrica {
    private double raio;

    // Construtor que inicializa o raio
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Implementação do método calcularArea para o círculo
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
