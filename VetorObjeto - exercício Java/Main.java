/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    Aluno[] aluno = new Aluno[3];
	    
	    aluno[0] = new Aluno("Ana", 20);
	    aluno[1] = new Aluno("Matheus", 12);
	    aluno[2] = new Aluno("Maria", 28);
	    
	    for(int i = 0; i < aluno.length; i++ ){
	        aluno[i].Apresentar();
	    }
	    
	    
	}
}
