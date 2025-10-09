public class CarroTurbo extends Carro {
    
    protected boolean turbo;
    
    public CarroTurbo(int ano, String modelo, String cor, int velMax, int qtPass){
        super(ano, modelo, cor, velMax, qtPass);
        this.turbo = false;
    }
    
    public void ligarTurbo(){
        turbo = true;
    }
    
    public void desligarTurbo(){
        turbo = false;
    }
    
    public float substVelMax(){
        float velBase = super.calcvelMax();
        if(turbo){
              return velBase = velBase + (velBase * 0.2f);
        } else {
            return velBase;
        }
    }
    
}