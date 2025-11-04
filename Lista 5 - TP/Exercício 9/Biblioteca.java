import java.util.*;

public class Biblioteca{
    ArrayList<itemBiblioteca> acervo= new ArrayList<>();
    
    public void addItem(itemBiblioteca item){
        acervo.add(item);
    }
    
    public void remItem(itemBiblioteca item){
        acervo.remove(item);
    }
    
    public void emprestarItem(itemBiblioteca item){
        for(int i = 0; i < acervo.size(); i++){
            if(acervo.get(i).equals(item)){
                acervo.get(i).emprestarItem();
                return; // ele sai do método
            } 
            System.out.println("Item não encontrado!");
        }
        
    }
    
    public void devolverItem(itemBiblioteca item){
        for(int i = 0; i < acervo.size(); i++){
            if(acervo.get(i).equals(item)){
                acervo.get(i).devolverItem();
                return;
            }
        System.out.println("Item não encontrado!");
        }
    }
       
    public void listarAcervo(){
        for(int i = 0; i < acervo.size(); i++){
            System.out.println(acervo.get(i));
        }
    }
    
    
    
}
