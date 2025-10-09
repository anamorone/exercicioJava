public class Carro extends Veiculo{
    
    protected int qtPass;
    
    public Carro(int ano, String modelo, String cor, int velMax, int qtPass){
    
        super(ano, modelo, cor, velMax);
        this.qtPass = qtPass;
    }
    
    public int calcvelMax(){
        return getvelMax();
    }
}