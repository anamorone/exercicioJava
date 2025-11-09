import java.util.*;

public class Departamento {
    
    private ArrayList<Funcionario> lista = new ArrayList<>();
    
    public Departamento(){
        
    }
    
    public void addFuncionario(Funcionario funcionario){
        if(lista.contains(funcionario)){
            System.out.println("Funcionário já existente no banco de cadastro.");
        }else {
            lista.add(funcionario);
            System.out.println("Funcionário adicionado ao banco de cadastro.");
        }
        
    }
    
    public void imprimirLista(){
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a opção de ordenação desejada: 1 = Matrícula | 2 = Nome | 3 - Salário");
        int opcao = teclado.nextInt();
        
        switch(opcao){
        case 1:
            Collections.sort(lista, Comparator.comparing(Funcionario::getMatricula));
            for(int i = 0; i < lista.size(); i++){
                System.out.println(lista.get(i));
            }
        break;
        
        case 2:
            Collections.sort(lista, Comparator.comparing(Funcionario::getNome));
            for(int i = 0; i < lista.size(); i++){
                System.out.println(lista.get(i));
            }
        break;
        
        case 3:
            Collections.sort(lista, Comparator.comparing(Funcionario::getSalario));
             for(int i = 0; i < lista.size(); i++){
                System.out.println(lista.get(i));
            }
        break;
        
        default:
        System.out.println("Opção não encontrada! tente novamente.");
        return;
    }
    
    
        
        }
    
    }