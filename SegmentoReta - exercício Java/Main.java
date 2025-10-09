/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Ponto ponto1 = new Ponto();
		Ponto ponto2 = new Ponto();
		Scanner teclado = new Scanner(System.in);
		
		
		// pegando as coordenadas:
		
		System.out.println("Digite aqui a coordenada x do ponto 1: ");
		ponto1.setPontoX(teclado.nextInt());
		
		
		System.out.println("Digite aqui a coordenada y do ponto 1: ");
		ponto1.setPontoY(teclado.nextInt());
		
		
		System.out.println("Digite aqui a coordenada x do ponto 2: ");
	    ponto2.setPontoX(teclado.nextInt());
		
		
		System.out.println("Digite aqui a coordenada y do ponto 2: ");
		ponto2.setPontoY(teclado.nextInt());
		
		// jogando os pontos para o segmento de reta:
		
		SegmentoReta calc = new SegmentoReta(ponto1, ponto2);
		
		// calculando a distância entre eles:
		
		System.out.println("O resultado da distância desse segmento de reta é " + calc.DistReta());
		
	}
}
