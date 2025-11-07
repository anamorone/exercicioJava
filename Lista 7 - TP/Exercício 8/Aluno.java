import java.util.*;

public class Aluno {
    private int matricula;
    private String nome;
    private int creditos;
    private static int maxCreditos = 20;
    private boolean isBolsista;
    private int descontoMensalidade;
    private int valorMensalidade;
    private ArrayList<Disciplina> listaDisciplinas = new ArrayList<>();
    
    public Aluno(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
        this.isBolsista = false;
        this.creditos = 0;
        this.valorMensalidade = 0;
        this.descontoMensalidade = 0;
    }
    
    
    public void setBolsista(int descontoMensalidade){
        this.isBolsista = true;
        this.descontoMensalidade = descontoMensalidade;
        
    }
    
    public int getCreditos(){
        return creditos;
    }
    
    public int setCreditos(){
        this.creditos = creditos;
    }
    
    public String getNome(){
        return nome;
    }
    
    public boolean adicionaDisciplina(Disciplina disciplina){
        if(disciplina.getCreditos() + this.getCreditos() <= maxCreditos){
            listaDisciplinas.add(disciplina);
            return true;
                }else {
                    return false;
                }
        }
        
    public int calcularCreditos(){
        int soma = 0;
        for(int i = 0; i < listaDisciplinas.size(); i++){
            soma += listaDisciplinas.get(i).getCreditos();
        } 
        this.creditos = soma;
        return soma;
    }
    
    public int calcularMensalidade(){
        int soma = 0;
        for(int i = 0; i < listaDisciplinas.size(); i++){
          soma += listaDisciplinas.get(i).getValorMensalidade();
         
        }
        if(this.isBolsista){
              soma -= descontoMensalidade;
          } 
        this.valorMensalidade = soma;
          return soma;
    }
    
    public int getValorMensalidade(){
        return valorMensalidade;
    }
    
}