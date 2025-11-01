/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    ArrayList<Integer> listA = new ArrayList<>();
    ArrayList<Integer> listB = new ArrayList<>();
    ArrayList<Integer> listC = new ArrayList<>();
    
    listA.add(teclado.nextInt());
    listA.add(teclado.nextInt());
    listA.add(teclado.nextInt());
	listA.add(teclado.nextInt());
	listA.add(teclado.nextInt());
	
	listB.add(teclado.nextInt());
	listB.add(teclado.nextInt());
	listB.add(teclado.nextInt());
	listB.add(teclado.nextInt());
	listB.add(teclado.nextInt());
	
	
for(int i = 0; i < listB.size(); i++){
    if(listA.contains(listB.get(i))){
    
        listC.add(listB.get(i));
    }
    
}

	Iterator it = listC.iterator();
	while(it.hasNext()){
	    System.out.println(it.next());
	}
}
}