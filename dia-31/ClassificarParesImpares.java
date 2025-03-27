import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassificarParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma lista de números separados por espaço:");
        String input = scanner.nextLine();

        // Separa os números pelo espaço
        String[] numerosStr = input.split("\\s+");

        // Listas para armazenar números pares e ímpares
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        // Processa cada número da entrada
        for (String numStr : numerosStr) {
            try {
                int numero = Integer.parseInt(numStr);
                if (numero % 2 == 0) {
                    pares.add(numero);
                } else {
                    impares.add(numero);
                }
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido: " + numStr);
            }
        }

        // Exibe os resultados
        System.out.println("Números pares: " + pares);
        System.out.println("Números ímpares: " + impares);

        scanner.close();
    }
}
