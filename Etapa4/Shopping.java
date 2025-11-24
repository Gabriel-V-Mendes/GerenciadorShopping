package Etapa4;


public class Shopping {

    private String nome;
    private String cnpj;

   
    private Loja[] espacos;

    public Shopping(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;


        this.espacos = new Loja[20];
    }


    /**
     * Documentação:
     * Método para converter a localização
     * @param localizacao
     * @return
     */
    private int getIndice(String localizacao) {
        try {
            
            if (!localizacao.startsWith("E")) {
                return -1; // Formato inválido
            }

            
            String numStr = localizacao.substring(1);

            int indice = Integer.parseInt(numStr);

            if (indice >= 0 && indice < this.espacos.length) {
                return indice; 
            } else {
                return -1; 
            }

        } catch (Exception e) {
            
            return -1; 
        }
    }

    public boolean insereLoja(Loja loja) {
    
        String local = loja.getLocalizacao();

        int indice = this.getIndice(local);

        if (indice == -1) {
            System.out.println("Erro: A localização '" + local + "' não é válida.");
            return false;
        }

        if (this.espacos[indice] == null) {
           
            this.espacos[indice] = loja;
            return true;
        } else {
            System.out.println("Erro: O espaço '" + local + "' já está ocupado.");
            return false;
        }
    }

   
    public boolean removeLoja(String localizacao) {
    
        int indice = this.getIndice(localizacao);

  
        if (indice == -1) {
            System.out.println("Erro: O espaço '" + localizacao + "' não existe.");
            return false;
        }


        if (this.espacos[indice] != null) {
            
            this.espacos[indice] = null;
            return true;
        } else {
            System.out.println("Erro: O espaço '" + localizacao + "' já está vazio.");
            return false;
        }
    }

    public void exibirTodasLojas() {
        System.out.println("***********************************************");
        System.out.println(" RELATÓRIO DE LOJAS DO SHOPPING: " + this.nome);
        System.out.println("***********************************************");

        
        for (Loja l : this.espacos) {
            
         
            if (l != null) {
                l.exibirDados();
            }
        }

        System.out.println("--- Fim do Relatório ---");
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }
}