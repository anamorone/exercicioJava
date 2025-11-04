public class Revista extends itemBiblioteca{
    int numero;
    
    public Revista(String titulo, int numero){
        super(titulo);
        this.numero = numero;
    }
    
    public int getNumero(){
        return numero;
    }
    
    @Override
    public String toString(){
        return "Título: " + titulo + "| Número: " + numero + "| Status: " + getStatus();
    }
}