package Etapa3;

public class Principal {

    public static void main(String[] args) {
        System.out.println("--- Iniciando Teste da Etapa 3 ---");

      
        Shopping meuShopping = new Shopping("Shopping Central", "12.345.678/0001-99");

        LojaAlimentacao lojaFastFood = new LojaAlimentacao(
            "Burger King",        
            "Alimentação",        
            "E10",                
            "Fast-food"           
        );
        
        LojaVestuario lojaDeRoupas = new LojaVestuario(
            "C&A",              
            "Vestuário",          
            "E1",                 
            true                  
        );

      
        Loja lojaServicos = new Loja(
            "Sapataria do Zé", 
            "Serviços", 
            "E7"
        );

    
        System.out.println("\n--- Inserindo Lojas no Shopping ---");
        meuShopping.insereLoja(lojaFastFood);
        meuShopping.insereLoja(lojaDeRoupas);
        meuShopping.insereLoja(lojaServicos);

       
        System.out.println("\n--- Relatório de Lojas (Polimorfismo) ---");
        meuShopping.exibirTodasLojas();
    }
}