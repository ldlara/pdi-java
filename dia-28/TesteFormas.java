package system;

import formas.calcularArea;
import formas.Circulo;
import formas.Retangulo;


public class TesteFormas {
    public static void main(String[] args) {
        FormaGeometrica circulo = new Circulo(5.0);
        FormaGeometrica retangulo = new Retangulo(4.0, 6.0);

        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Área do retângulo: " + retangulo.calcularArea());
    }
}
