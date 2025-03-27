import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DobroDoNumero {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            // Abre o arquivo para leitura
            reader = new BufferedReader(new FileReader("numero.txt"));
            // Lê a primeira linha do arquivo
            String linha = reader.readLine();
            // Converte a linha lida para número (double)
            double numero = Double.parseDouble(linha);
            // Exibe o dobro do número
            System.out.println("O dobro de " + numero + " é: " + (numero * 2));
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro: o conteúdo do arquivo não é um número válido.");
        } finally {
            // Garante o fechamento do arquivo, mesmo se ocorrer uma exceção
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Erro ao fechar o arquivo: " + e.getMessage());
            }
        }
    }
}
