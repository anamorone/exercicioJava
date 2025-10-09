/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
   CarroTurbo c = new CarroTurbo(2022, "Supra", "vermelho", 300, 2);

        System.out.println("Velocidade normal: " + c.substVelMax());

        c.ligarTurbo();
        System.out.println("Velocidade com turbo: " + c.substVelMax());

        c.desligarTurbo();
        System.out.println("Turbo desligado novamente: " + c.substVelMax());

}
}
