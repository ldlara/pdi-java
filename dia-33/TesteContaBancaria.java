package aplicacao;

import banco.ContaBancaria;
import banco.SaldoInsuficienteException;
import java.util.Scanner;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000.0);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Saldo inicial: " + conta.getSaldo());
        
        // Realiza um depósito
        System.out.print("Digite o valor a ser depositado: ");
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);
        
        // Realiza um saque, tratando a exceção caso o saldo seja insuficiente
        System.out.print("Digite o valor a ser sacado: ");
        double valorSaque = scanner.nextDouble();
        try {
            conta.sacar(valorSaque);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
        System.out.println("Saldo final: " + conta.getSaldo());
        scanner.close();
    }
}
