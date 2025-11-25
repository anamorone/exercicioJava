/******************************************************************************

Implemente a classe Pentágono que tem como atributo um vetor de 5 pontos. Crie um construtor
que recebe o vetor de pontos que define o pentágono. Implemente também os métodos:
a) perimetro(): para calcular o perímetro do pentágono
b) area(): para calcular a área do pentágono (dica: use a fórmula da área do triângulo definida
anteriormente)

*******************************************************************************/

import java.util.*;

public class Pentagono {

    private Ponto[] pontoPentagono = new Ponto[5];
    
    public Pentagono(Ponto[] pontoPentagono){
        this.pontoPentagono = pontoPentagono;
    }
    
    public double perimetro(){
        
        double soma = 0;
        double dx, dy, d;
        
        
	    for(int i = 0; i < pontoPentagono.length; i++){
	        if(i == pontoPentagono.length - 1){
	       dx = (pontoPentagono[i].getX() - pontoPentagono[0].getX());
	       dy = (pontoPentagono[i].getY() - pontoPentagono[0].getY());
	        }else {
	       dx = (pontoPentagono[i + 1].getX() - pontoPentagono[i].getX());
	       dy = (pontoPentagono[i + 1].getY() - pontoPentagono[i].getY());
	        }
	        
	        d = Math.sqrt((Math.pow(dx, 2)) +  (Math.pow(dy, 2)));
	        soma += d;
	    }
	    
	    return soma;
	    
	}
	
	
	public double apotema(){
	    double dx = (pontoPentagono[1].getX() - pontoPentagono[0].getX());
	    double dy = (pontoPentagono[1].getY() - pontoPentagono[0].getY());
	    
	    double d = Math.sqrt((Math.pow(dx, 2)) +  (Math.pow(dy, 2)));
	    
	    double apotema = (d / (2 * Math.tan(Math.PI / 5)));
	    return apotema;
	}
	
	public double area(){
	    double area = (apotema() * perimetro()) / 2; 
	    return area;
	    
	}
}