/******************************************************************************

EXERCÍCIO 2
*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		ArrayList listA = new ArrayList();
		ArrayList listB = new ArrayList();
		Scanner teclado = new Scanner(System.in);
		
		listA.add(teclado.nextInt());
		listA.add(teclado.nextInt());
		listA.add(teclado.nextInt());
		listA.add(teclado.nextInt());
		
		listB.add(teclado.nextInt());
		listB.add(teclado.nextInt());
		listB.add(teclado.nextInt());
		listB.add(teclado.nextInt());
		listB.add(teclado.nextInt());
		
		ArrayList listC = new ArrayList();
		
		for(int i = 0; i < listA.size(); i++){
		    listC.add(listA.get(i));
		
	    }
	    for(int i = 0; i < listB.size(); i++){
	        if (!(listC.contains(listB.get(i)))){
	            listC.add(listB.get(i));
	        
        	   }
	    }
	Iterator i = listC.iterator();
	while(i.hasNext()){
	    System.out.println(i.next());
	}
	
}
}
