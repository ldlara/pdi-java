package cursos;

public class CursoPresencial extends Curso {
    private String local;
    
    public CursoPresencial(String nome, int capacidadeMaxima, String local) {
        super(nome, capacidadeMaxima);
        this.local = local;
    }
    
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Local: " + local);
    }
}
