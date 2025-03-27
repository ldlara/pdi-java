package itens;

public abstract class Item {
    private String titulo;
    private String autor;
    
    public Item(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    // Método abstrato para exibir informações do item
    public abstract void exibirInfo();
}
