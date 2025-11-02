/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		ArrayList lista = new ArrayList();
		Scanner teclado = new Scanner(System.in);
		
		while(true){
		    String palavra = teclado.nextLine();
		    
		    if(palavra.isEmpty()){
		        break;
		        
		        
		    }
		    
		    lista.add(palavra);
		    
		}
		
		Collections.sort(lista);
		
		// Vamos verificar se tem repetida ou não:
		
		boolean repetida = false;
		
		for(int i = 0; i < lista.size(); i++){
		
		  for(int j = i + 1; j < lista.size(); j++){
		    if((lista.get(i).equals(lista.get(j)))){
		        repetida = true;
		    }
		    
		      
		  }
		  
		    
		}
		
	if(repetida){
		        System.out.println("Essa lista apresenta repetição!");
		    }else {
		        for(int i = 0; i < lista.size(); i++){
		            System.out.println(lista.get(i));
		        }
		    }
	
		
	}
}
