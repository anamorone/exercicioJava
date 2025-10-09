public class Aluno {
    private String nome;
    private int idade;
    
    
    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public void Apresentar(){
        System.out.println("Meu nome é " + nome + " e eu tenho " + idade);
    }
    
}