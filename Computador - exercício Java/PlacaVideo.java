public class PlacaVideo {
    private int memoria; //em GB
    private String modelo;
    private int velocidadeProcessador; //em GHz
    
    
    public String getPlacaVideo(){
        return memoria + "GB, " + modelo + ", " + velocidadeProcessador + "GHz";
    }

    public int getMemoria(){
        return memoria;
    }
    
    public void setMemoria(int memoria){
        this.memoria = memoria;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    
    public int getVelocidadeProcessador(){
        return velocidadeProcessador;
    }
    
    public void setVelocidadeProcessador(int velocidadeProcessador){
        this.velocidadeProcessador = velocidadeProcessador;
    }
    
}
