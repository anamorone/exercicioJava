import java.util.*;

public class Poligono {
    private ArrayList<Pontos> lista = new ArrayList<>();
    private double perimetro = 0;
    
    public Poligono(ArrayList<Pontos> lista){
        this.lista = lista;
    }
    
    public void addPontos(Pontos ponto){
        lista.add(ponto);
        System.out.println("Ponto adicionado a lista de pontos do polígono.");
    }
    
    public void remPontos(Pontos ponto){
        if(lista.contains(ponto)){
            lista.remove(ponto);
        
    }else{
        System.out.println("Ponto não encontrado no polígono.");
    }
    
    public void calcPerimetro(){
        
    float dx;
    float dy;
    float d;
    double soma = 0;
    
    for(int i = 0; i < lista.size(); i++){
        dx = 0;
        dy = 0;
        
        if(i == (lista.size() - 1)){
        dx = ( lista.get(i).getX() - lista.get(0).getX() );
        dy = ( lista.get(i).getY() - lista.get(0).getY() );
        } else {
        dx = ( lista.get(i).getX() - lista.get(i + 1).getX() );
        dy = ( lista.get(i).getY() - lista.get(i + 1).getY() );
        }
        
        d = Math.sqrt((Math.pow(dx, 2)) + (Math.pow(dy, 2)));
        soma += d;
    }
    
    this.perimetro = soma;
    System.out.println("A soma do perímetro desse perímetro é: " + perimetro);
    
        
    }
    
    
    
}
