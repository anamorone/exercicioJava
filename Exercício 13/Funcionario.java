/******************************************************************************

Um funcionário possui matrícula (int), nome e salário (float). Um departamento possui uma lista
de funcionários. Crie métodos para adicionar um funcionário ao departamento e para imprimir a
lista de funcionários do departamento ordenada por matrícula, nome ou salário (o usuário deve
escolher que tipo de ordenação deseja).

*******************************************************************************/
public class Funcionario {
    
    private int matricula;
    private String nome;
    private float salario;
    
    public Funcionario(int matricula, String nome, float salario){
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
    
    public int getMatricula(){
        return matricula;
    }
    
    
    public void setSalario(float salario){
        this.salario = salario;
    }
    
    public float getSalario(){
        return salario;
    }
    
    
    @Override
    public String toString(){
        return "Nome: " + nome + " | Matrícula: " + matricula + " | Salário: " + salario;
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Funcionario){
            Funcionario outro = (Funcionario) obj;
            return outro.matricula == this.matricula;
        }
        return false;
    }
    
    
    
    
    
}