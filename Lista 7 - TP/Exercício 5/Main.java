/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
    ArrayList<Aluno> lista = new ArrayList<Aluno>();
    Scanner teclado = new Scanner(System.in);
    
    while(true){
    System.out.println("Digite o nome do aluno: ");        
      String nome = teclado.nextLine();
      
      if(nome.isEmpty()){
          break;
      }
      
      System.out.println("Digite a nota A1 do aluno: ");   
      float A1 = teclado.nextFloat();
      
      System.out.println("Digite a nota A2 do aluno: ");  
      float A2 = teclado.nextFloat();
      teclado.nextLine(); // Para consumir o enter que sobra!!!
      
      lista.add(new Aluno(nome, A1, A2));
      
    }
    
  for(int i = 0; i < lista.size(); i++){
      
      if(lista.get(i).getA1() <= 0.0){
          System.out.println("Nome: " + lista.get(i).getNome() + ", Faltou!, " + lista.get(i).getA2() + " - Reprovado!");
          continue; //estudar sobre
      }
      
      if(lista.get(i).getA2() <= 0.0){
          System.out.println("Nome: " + lista.get(i).getNome() + ", " + lista.get(i).getA1() + ", Faltou!," + " - Reprovado!");
          continue; // ^^
      }
      
      float media = ((lista.get(i).getA1() + lista.get(i).getA2()) / 2);
      
      if(media < 6){
          System.out.println(lista.get(i) + " - Média: " + media + " - Reprovado!");
      }else {
          System.out.println(lista.get(i) + " - Média: " +  media + " - Aprovado!");
      }
      
  }
}
}