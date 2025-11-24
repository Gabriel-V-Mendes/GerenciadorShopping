package Etapa1; 


public class Principal {

    public static void main(String[] args) {
        System.out.println("--- Iniciando Teste da Etapa 1 ---");

      
        Loja lojaA = new Loja("Minha Loja de Roupas", "Vestuário", "E5");
 
        lojaA.exibirDados();

        System.out.println("\n--- Alterando dados da lojaA ---");

        lojaA.setLocalizacao("E10");

        System.out.println("O novo local da loja '" + lojaA.getNome() + "' é: " + lojaA.getLocalizacao());
        
        System.out.println("\n--- Teste final da lojaA ---");
        lojaA.exibirDados();
    }
}