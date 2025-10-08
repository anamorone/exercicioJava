public class PlacaRede{
    private int velocidade; // em mbits
    
    public String getPlacaRede(){
        return velocidade + "mbits";
    }
    
    public int getVelocidade(){
        return velocidade;
    }
    
    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }
    
}