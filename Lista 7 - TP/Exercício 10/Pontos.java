/******************************************************************************

Cria uma classe para representar um polígono qualquer. Um polígono é composto por um
conjunto de pontos e cada ponto possui duas coordenadas (x, y). A classe Poligono deve possuir
métodos para adicionar e remover pontos e um método para calcular seu perímetro.

*******************************************************************************/


public class Pontos {
    
    private float x;
    private float y;
    
    public Pontos(float x, float y){
        this.x = x;
        this.y = y;
    }
    
    
    public void setX(float x){
        this.x = x;
    }
    
    
    public float getX(){
        return x;
    }
    
    public void setY(float y){
        this.y = y;
    }
    
    public float getY(){
        return y;
    }
    
}