package Etapa2;


public class Principal {

    public static void main(String[] args) {
        System.out.println("--- Iniciando Teste da Etapa 2 ---");

      
        Shopping meuShopping = new Shopping("Shopping Central", "12.345.678/0001-99");

      
        Loja loja1 = new Loja("C&A", "Vestuário", "E1");
        Loja loja2 = new Loja("Burger King", "Alimentação", "E10");
        Loja loja3 = new Loja("Cinemark", "Lazer", "E19");
        Loja loja4 = new Loja("Casa do Pão de Queijo", "Alimentação", "E1"); // Tentativa de erro

       
        System.out.println("\n--- Tentando inserir lojas ---");
        
        meuShopping.insereLoja(loja1); 
        meuShopping.insereLoja(loja2); 
        meuShopping.insereLoja(loja3); 
        
      
        System.out.println("\n--- Tentando inserir em local ocupado ---");
        meuShopping.insereLoja(loja4); 

      
        System.out.println("\n--- Relatório de Lojas Inseridas ---");
        meuShopping.exibirTodasLojas();

        System.out.println("\n--- Removendo a loja do espaço E10 ---");
        boolean removido = meuShopping.removeLoja("E10"); 
        System.out.println("Remoção foi sucesso? " + removido);

        
        System.out.println("\n--- Relatório Final ---");
        meuShopping.exibirTodasLojas();
    }
}