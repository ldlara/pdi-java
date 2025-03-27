package itens;

public class Revista extends Item implements Emprestavel {
    private boolean emprestado;
    
    public Revista(String titulo, String autor) {
        super(titulo, autor);
        this.emprestado = false;
    }
    
    @Override
    public void emprestar() {
        if (emprestado) {
            System.out.println("A revista já está emprestada: " + getTitulo());
        } else {
            emprestado = true;
            System.out.println("Revista emprestada com sucesso: " + getTitulo());
        }
    }
    
    @Override
    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Revista devolvida: " + getTitulo());
        } else {
            System.out.println("A revista não estava emprestada: " + getTitulo());
        }
    }
    
    @Override
    public void exibirInfo() {
        System.out.println("Revista: " + getTitulo() + " | Editor: " + getAutor());
    }
}
