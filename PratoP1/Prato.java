public class Prato {
    private String nome;
    private Categoria categoria; 
    private String[] ingredientes = new String[10]; 
    
    
    public Prato(String nome, Categoria categoria) {
        this.nome = nome;
        this.categoria = categoria;
        
    }
    
    public Prato(Prato outroprato){
        this.nome = outroprato.nome;
        this.categoria = outroprato.categoria;
        
        for(int i = 0; i < outroprato.ingredientes.length; i++){
            this.ingredientes[i] = outroprato.ingredientes[i];
        }
    }
    
    public String getNome(){
        return nome;
    }
    
    public Categoria getCategoria(){
        return categoria;
    }
    
    public boolean adicionarIngredientes(String ingrediente){
        for(int i = 0; i < ingredientes.length; i++){
            if(ingredientes[i] == null){
                ingredientes[i] = ingrediente;
                return true;
            } 
        }
        return false;
    }
    
}