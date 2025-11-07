import java.util.*;

public class Turma {
	private int codigo;
	private ArrayList<Aluno> alunosInscritos = new ArrayList<>();
	private static int maxAlunos = 30;
	private Disciplina disciplina;


	public Turma(int codigo, Disciplina disciplina) {
		this.codigo = codigo;
		this.disciplina = disciplina;
	}


	public void inscreverAluno(Aluno aluno) {
		if(alunosInscritos.size() >= maxAlunos) {
			System.out.println("Turma já está lotada!");
		} else {
			if(aluno.adicionaDisciplina(this.disciplina)){
			  alunosInscritos.add(aluno);
			  System.out.println("O aluno " + aluno.getNome() + " foi inscrito na turma " + codigo + " ( " + disciplina.getNome() + " )");
		}else {
		    System.out.println("Aluno não inscrito por limites de crédito atingidos.");
		}

	}
}

	public void getListaAlunos() {
	    System.out.println("Na turma " + codigo + ", temos os seguintes alunos: ");
		for(int i = 0; i < alunosInscritos.size(); i++) {
			System.out.println(alunosInscritos.get(i).getNome());
		}
	}



}