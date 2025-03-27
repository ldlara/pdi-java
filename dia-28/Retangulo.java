package formas;

public class Retangulo extends FormaGeometrica {
    private double largura;
    private double altura;

    // Construtor que inicializa a largura e a altura
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    // Implementação do método calcularArea para o retângulo
    @Override
    public double calcularArea() {
        return largura * altura;
    }
}
