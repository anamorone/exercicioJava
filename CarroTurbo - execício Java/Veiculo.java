public class Veiculo {
    
    protected int ano;
    protected String modelo;
    protected String cor;
    protected int velMax;
    
    
    public Veiculo(int ano, String modelo, String cor, int velMax){
        this.ano = ano;
        this.modelo = modelo;
        this.cor = cor;
        this.velMax = velMax;
        
    }
    
    public void setvelMax(int velMax){
        this.velMax = velMax;
    }
    
    public int getvelMax(){
        return velMax;
    }
    
}