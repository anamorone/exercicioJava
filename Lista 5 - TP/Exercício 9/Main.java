/******************************************************************************

Uma Biblioteca possui em seu acervo Revistas (título e número) e Livros (título e
nome do autor). Na Biblioteca crie métodos para:
a) Adicionar e remover Livros e Revistas do acervo;
b) Emprestar e devolver Revistas e Livros;
c) Listar as Revistas e Livros existentes na biblioteca com seu status (emprestado ou disponível).

*******************************************************************************/
import java.util.*;


public class Main
{
	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		
		Livro livro1 = new Livro("Harry Potter", "J.K Rowling");
		Revista revista1 = new Revista("Vogue", 1234);
		
		biblioteca.addItem(livro1);
		biblioteca.addItem(revista1);
		biblioteca.listarAcervo();
		
		biblioteca.emprestarItem(livro1);
		biblioteca.listarAcervo();
	}
}