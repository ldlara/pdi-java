package lojas;

public class Farmacia extends Loja {
    private boolean temAtendimentoFarmaceutico;

    public Farmacia(String nome, String endereco, boolean temAtendimentoFarmaceutico) {
        super(nome, endereco);
        this.temAtendimentoFarmaceutico = temAtendimentoFarmaceutico;
    }

    public void consultarFarmaceutico() {
        if (temAtendimentoFarmaceutico) {
            System.out.println("Consultando o farmacêutico para orientações.");
        } else {
            System.out.println("Esta farmácia não oferece consulta farmacêutica.");
        }
    }

    @Override
    public void abrirLoja() {
        super.abrirLoja();
        System.out.println("Farmácia preparada para oferecer atendimento personalizado.");
    }
}
