package banco;

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
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }
    
    // Método para sacar valor, verificando se há saldo suficiente
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para saque de " + valor + ". Saldo atual: " + saldo);
        }
        saldo -= valor;
        System.out.println("Saque realizado com sucesso. Saldo atual: " + saldo);
    }
    
    public double getSaldo() {
        return saldo;
    }
}
