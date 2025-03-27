public class TesteNumero {
    // Método que lança NumeroNegativoException se o número for negativo
    public static void verificarNumero(int numero) throws NumeroNegativoException {
        if (numero < 0) {
            throw new NumeroNegativoException("Número negativo: " + numero);
        }
        System.out.println("Número é positivo: " + numero);
    }
    
    public static void main(String[] args) {
        try {
            // Teste com número negativo
            verificarNumero(-5);
        } catch (NumeroNegativoException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
        
        try {
            // Teste com número positivo
            verificarNumero(10);
        } catch (NumeroNegativoException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
}
