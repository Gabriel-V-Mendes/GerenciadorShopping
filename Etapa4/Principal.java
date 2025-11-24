package Etapa4; // <-- Mudar para Etapa 4

/**
 * Documentação:
 * Esta classe serve para testar a Etapa 4 (Array).
 * O código de teste é IDÊNTICO ao da Etapa 3, o que prova
 * que a nossa refatoração do Shopping.java foi um sucesso
 * e não "quebrou" o resto do programa.
 */
public class Principal {

    public static void main(String[] args) {
        System.out.println("--- Iniciando Teste da Etapa 4 ---");

       
        Shopping meuShopping = new Shopping("Shopping Central", "12.345.678/0001-99");

       
        LojaAlimentacao lojaFastFood = new LojaAlimentacao(
            "Burger King", "Alimentação", "E10", "Fast-food"
        );
        
        LojaVestuario lojaDeRoupas = new LojaVestuario(
            "C&A", "Vestuário", "E1", true
        );

        Loja lojaServicos = new Loja(
            "Sapataria do Zé", "Serviços", "E7"
        );

        System.out.println("\n--- Inserindo Lojas no Shopping ---");
        meuShopping.insereLoja(lojaFastFood);
        meuShopping.insereLoja(lojaDeRoupas);
        meuShopping.insereLoja(lojaServicos);

        System.out.println("\n--- Testando locais inválidos ---");
        meuShopping.insereLoja(new Loja("Loja Fantasma", "Outro", "E99"));
        
       
        System.out.println("\n--- Relatório de Lojas (Array + Polimorfismo) ---");
        meuShopping.exibirTodasLojas();

       
        System.out.println("\n--- Removendo a loja do espaço E1 ---");
        meuShopping.removeLoja("E1"); 
        
        System.out.println("\n--- Relatório Final ---");
        meuShopping.exibirTodasLojas();
    }
}