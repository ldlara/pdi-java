package cursos;

public class CursoOnline extends Curso {
    private String plataforma;
    
    public CursoOnline(String nome, int capacidadeMaxima, String plataforma) {
        super(nome, capacidadeMaxima);
        this.plataforma = plataforma;
    }
    
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Plataforma: " + plataforma);
    }
}
