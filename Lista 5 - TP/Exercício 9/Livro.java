public class Livro extends itemBiblioteca{
    String nomeAutor;
    
    public Livro(String titulo, String nomeAutor){
        super(titulo);
        this.nomeAutor = nomeAutor;
    }
    
    public String getNomeAutor(){
        return nomeAutor;
    }
    
    @Override
    public String toString(){
        return "Título: " + titulo + "| Nome do autor: " + nomeAutor + "| Status: " + getStatus();
    }
}