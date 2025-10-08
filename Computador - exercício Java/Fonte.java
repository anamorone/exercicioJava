public class Fonte{
    private int potencia; // em KW
    
    public String getFonte(){
        return potencia + "KW";
    }
    
    public int getPotencia(){
        return potencia;
    }
    
    public void setPotencia(int potencia){
        this.potencia = potencia;
        
    }
    
    
    
}