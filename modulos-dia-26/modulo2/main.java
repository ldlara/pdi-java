package modulo2;

import modulo1.ClasseA;

public class ClasseB {
    public void metodoB() {
        System.out.println("Executando metodoB da ClasseB.");
        // Para evitar uma chamada recursiva infinita, a invocação do método da ClasseA
        // pode ser comentada ou utilizada com cuidado. Neste exemplo, estamos apenas demonstrando a dependência.
        // new ClasseA().metodoA();
    }
}
