public abstract class itemBiblioteca {
    
    protected String titulo;
    protected boolean emprestado;
    
    
    public itemBiblioteca(String Titulo){
        this.titulo = titulo;
        this.emprestado = false;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public boolean isEmprestado(){
        return emprestado;
    }
    
    public void emprestarItem(){
        emprestado = true;
    }
    
    public void devolverItem(){
        emprestado = false;
    }
    
    public String getStatus(){
        if(emprestado){
            return "Emprestado";
            
        }
        return "Disponível";
    }
    
    @Override
    public String toString(){
        return "Título: " + titulo + "Seu status é: " + getStatus();
    }
    
    
}