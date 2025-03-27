package modulo1;

import modulo2.ClasseB;

public class ClasseA {
    public void metodoA() {
        System.out.println("Executando metodoA da ClasseA.");
        // Instancia ClasseB e chama seu método para demonstrar a interdependência
        ClasseB b = new ClasseB();
        b.metodoB();
    }
}
