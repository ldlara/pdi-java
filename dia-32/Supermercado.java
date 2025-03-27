package lojas;

public class Supermercado extends Loja {
    private int qtdClientesAtendidos;

    public Supermercado(String nome, String endereco) {
        super(nome, endereco);
        this.qtdClientesAtendidos = 0;
    }

    public void atenderCliente() {
        qtdClientesAtendidos++;
        System.out.println("Supermercado atendendo cliente. Total atendidos: " + qtdClientesAtendidos);
    }

    @Override
    public void abrirLoja() {
        super.abrirLoja();
        System.out.println("Supermercado preparado para atender um grande número de clientes.");
    }
}
