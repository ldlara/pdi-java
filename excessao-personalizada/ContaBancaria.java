package banco;

import excecoes.SaldoInsuficienteException;

public class ContaBancaria {
    private double saldo;
    
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }
    
    // Método para depositar valor na conta
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso. Saldo atual: " + saldo);
        }
    }
    
    // Método para sacar valor da conta
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque de " + valor + ". Saldo atual: " + saldo);
        }
        saldo -= valor;
        System.out.println("Saque realizado com sucesso. Saldo atual: " + saldo);
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    // Método principal para teste
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000.0);
        conta.depositar(500.0);
        
        try {
            conta.sacar(200.0);   // Saque com sucesso
            conta.sacar(1500.0);  // Tentativa de saque que excede o saldo
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
