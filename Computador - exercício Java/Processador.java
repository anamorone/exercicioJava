public class Processador{
    
    private int velocidade; // em GHz
    private String modelo;
    
    public String getProcessador(){
        return velocidade + "GHz, " + modelo;
    }
    
    public int getVelocidade(){
        return velocidade;
    }
    
    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
}