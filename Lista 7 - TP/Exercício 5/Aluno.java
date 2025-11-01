public class Aluno {
    
    private String nome;
    private float A1;
    private float A2;
    
    public Aluno(String nome, float A1, float A2){
        this.nome = nome;
        this.A1 = A1;
        this.A2 = A2;
    }
    
    
    public String getNome(){
        return nome;
    }
    
    public float getA1(){
        return A1;
    }
    
    public float getA2(){
        return A2;
    }
    
    
    @Override
    public String toString(){
        return "Nome: " + nome + ", A1: " + A1 + ", A2: " + A2;
    }
}