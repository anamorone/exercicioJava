public class Disciplina {
    private int codigo;
    private String nome;
    private int creditos;
    private int valorPorCredito;
    
    public Disciplina(int codigo, String nome, int creditos){
        this.codigo = codigo;
        this.nome = nome;
        this.creditos = creditos;
    
    }
    
    public void setValorMensalidade(int valorMensalidade){
        this.valorMensalidade = valorMensalidade;
    }
    
    public int getValorMensalidade(){
        return creditos * valorPorCredito;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getCreditos(){
        return creditos;
    }
    
}