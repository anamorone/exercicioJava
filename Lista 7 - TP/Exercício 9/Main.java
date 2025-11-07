/******************************************************************************

Faça um programa para manipular uma lista de números inteiros. O programa deverá ler os
comandos definidos abaixo e gerar as saídas esperadas:
a) i: insere um número na lista. Exemplo: “i 22” insere o número 22 na lista e imprime a
mensagem “22 inserido”.
b) r: remove um número da lista. Exemplo: “r 15” remove o número 15 da lista e imprime a
mensagem “15 removido”. Se o 15 não fizer parte da lista deve ser impresso “15 não
encontrado”
c) p: imprime a lista de números ordenada crescentemente
d) l: limpa a lista
e) q: termina o programa

*******************************************************************************/
import java.util.*;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
		int num = 0;
		String linha;
		String comando;
		Scanner teclado = new Scanner(System.in);
		
		while (true) {
		System.out.println("Escreva o comando: ");
		linha = teclado.nextLine();
		String[] partes = linha.split(" ");
		
		// Definindo o que é comando e o que é número:
		
        if(partes.length <= 1){
            comando = linha;
        }else {
            comando = partes[0];
		    num = Integer.parseInt(partes[1]);
        }

		switch(comando.toLowerCase()){
		    case "i":
		        lista.add(num);
		        System.out.println(num + " inserido.");
		        break;
		        
	        case "r":
	            if(lista.contains(num)){
	            lista.remove(Integer.valueOf(num));
	            System.out.println(num + " removido.");
	            }else {
	            System.out.println(num + " não encontrado.");
	            }
	            break;
	            
	       case "p":
	           System.out.println("Números da lista: ");
	           Collections.sort(lista);
	           for(int i = 0; i < lista.size(); i++){
	               System.out.println(lista.get(i));
	           }
	           break;
	           
	       case "l":
	           lista.clear();
		        System.out.println("Lista limpa.");
		        break;
		        
		   case "q":
		       System.out.println("Encerrando o programa...");
		       return;
		       
		   default:
		   System.out.println("Comando inválido! Tente novamente.");
	            break;
		
		}
	
	}
	}
}
