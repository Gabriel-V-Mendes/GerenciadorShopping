package Etapa2;


public class Shopping {

    private String nome;
    private String cnpj;


    private Loja espacoE0;
    private Loja espacoE1;
    private Loja espacoE2;
    private Loja espacoE3;
    private Loja espacoE4;
    private Loja espacoE5;
    private Loja espacoE6;
    private Loja espacoE7;
    private Loja espacoE8;
    private Loja espacoE9;
    private Loja espacoE10;
    private Loja espacoE11;
    private Loja espacoE12;
    private Loja espacoE13;
    private Loja espacoE14;
    private Loja espacoE15;
    private Loja espacoE16;
    private Loja espacoE17;
    private Loja espacoE18;
    private Loja espacoE19;

   
    /**
     * Documentação: Construtor da classe Shopping.
     * Todos os 20 espaços de loja começam como 'null' (vazios).
     * @param nome 
     * @param cnpj 
     */
    public Shopping(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }


    /**
     * Documentação:
     * Insere uma nova loja num espaço específico do shopping.
     * @param loja 
     * @return 
     */
    public boolean insereLoja(Loja loja) {
        String local = loja.getLocalizacao();
        boolean espacoVago = false;

        switch (local) {
            case "E0": if (this.espacoE0 == null) espacoVago = true; break;
            case "E1": if (this.espacoE1 == null) espacoVago = true; break;
            case "E2": if (this.espacoE2 == null) espacoVago = true; break;
            case "E3": if (this.espacoE3 == null) espacoVago = true; break;
            case "E4": if (this.espacoE4 == null) espacoVago = true; break;
            case "E5": if (this.espacoE5 == null) espacoVago = true; break;
            case "E6": if (this.espacoE6 == null) espacoVago = true; break;
            case "E7": if (this.espacoE7 == null) espacoVago = true; break;
            case "E8": if (this.espacoE8 == null) espacoVago = true; break;
            case "E9": if (this.espacoE9 == null) espacoVago = true; break;
            case "E10": if (this.espacoE10 == null) espacoVago = true; break;
            case "E11": if (this.espacoE11 == null) espacoVago = true; break;
            case "E12": if (this.espacoE12 == null) espacoVago = true; break;
            case "E13": if (this.espacoE13 == null) espacoVago = true; break;
            case "E14": if (this.espacoE14 == null) espacoVago = true; break;
            case "E15": if (this.espacoE15 == null) espacoVago = true; break;
            case "E16": if (this.espacoE16 == null) espacoVago = true; break;
            case "E17": if (this.espacoE17 == null) espacoVago = true; break;
            case "E18": if (this.espacoE18 == null) espacoVago = true; break;
            case "E19": if (this.espacoE19 == null) espacoVago = true; break;
            default:
                System.out.println("Erro: O espaço '" + local + "' não existe.");
                return false; 
        }

        if (espacoVago) {
            switch (local) {
                case "E0": this.espacoE0 = loja; break;
                case "E1": this.espacoE1 = loja; break;
                case "E2": this.espacoE2 = loja; break;
                case "E3": this.espacoE3 = loja; break;
                case "E4": this.espacoE4 = loja; break;
                case "E5": this.espacoE5 = loja; break;
                case "E6": this.espacoE6 = loja; break;
                case "E7": this.espacoE7 = loja; break;
                case "E8": this.espacoE8 = loja; break;
                case "E9": this.espacoE9 = loja; break;
                case "E10": this.espacoE10 = loja; break;
                case "E11": this.espacoE11 = loja; break;
                case "E12": this.espacoE12 = loja; break;
                case "E13": this.espacoE13 = loja; break;
                case "E14": this.espacoE14 = loja; break;
                case "E15": this.espacoE15 = loja; break;
                case "E16": this.espacoE16 = loja; break;
                case "E17": this.espacoE17 = loja; break;
                case "E18": this.espacoE18 = loja; break;
                case "E19": this.espacoE19 = loja; break;
            }
            return true;
        } else {
            System.out.println("Erro: O espaço '" + local + "' já está ocupado.");
            return false; 
        }
    }

    /**
     * Documentação:
     * Remove uma loja de um espaço específico, baseado no nome do espaço.
     * @param localizacao 
     * @return
     */
    public boolean removeLoja(String localizacao) {
        // Verifica se o espaço está ocupado antes de remover
        switch (localizacao) {
            case "E0": if (this.espacoE0 == null) return false; this.espacoE0 = null; return true;
            case "E1": if (this.espacoE1 == null) return false; this.espacoE1 = null; return true;
            case "E2": if (this.espacoE2 == null) return false; this.espacoE2 = null; return true;
            case "E3": if (this.espacoE3 == null) return false; this.espacoE3 = null; return true;
            case "E4": if (this.espacoE4 == null) return false; this.espacoE4 = null; return true;
            case "E5": if (this.espacoE5 == null) return false; this.espacoE5 = null; return true;
            case "E6": if (this.espacoE6 == null) return false; this.espacoE6 = null; return true;
            case "E7": if (this.espacoE7 == null) return false; this.espacoE7 = null; return true;
            case "E8": if (this.espacoE8 == null) return false; this.espacoE8 = null; return true;
            case "E9": if (this.espacoE9 == null) return false; this.espacoE9 = null; return true;
            case "E10": if (this.espacoE10 == null) return false; this.espacoE10 = null; return true;
            case "E11": if (this.espacoE11 == null) return false; this.espacoE11 = null; return true;
            case "E12": if (this.espacoE12 == null) return false; this.espacoE12 = null; return true;
            case "E13": if (this.espacoE13 == null) return false; this.espacoE13 = null; return true;
            case "E14": if (this.espacoE14 == null) return false; this.espacoE14 = null; return true;
            case "E15": if (this.espacoE15 == null) return false; this.espacoE15 = null; return true;
            case "E16": if (this.espacoE16 == null) return false; this.espacoE16 = null; return true;
            case "E17": if (this.espacoE17 == null) return false; this.espacoE17 = null; return true;
            case "E18": if (this.espacoE18 == null) return false; this.espacoE18 = null; return true;
            case "E19": if (this.espacoE19 == null) return false; this.espacoE19 = null; return true;
            default:
                System.out.println("Erro: O espaço '" + localizacao + "' não existe.");
                return false;
        }
    }

    public void exibirTodasLojas() {
        System.out.println("***********************************************");
        System.out.println(" RELATÓRIO DE LOJAS DO SHOPPING: " + this.nome);
        System.out.println("***********************************************");


        if (espacoE0 != null) espacoE0.exibirDados();
        if (espacoE1 != null) espacoE1.exibirDados();
        if (espacoE2 != null) espacoE2.exibirDados();
        if (espacoE3 != null) espacoE3.exibirDados();
        if (espacoE4 != null) espacoE4.exibirDados();
        if (espacoE5 != null) espacoE5.exibirDados();
        if (espacoE6 != null) espacoE6.exibirDados();
        if (espacoE7 != null) espacoE7.exibirDados();
        if (espacoE8 != null) espacoE8.exibirDados();
        if (espacoE9 != null) espacoE9.exibirDados();
        if (espacoE10 != null) espacoE10.exibirDados();
        if (espacoE11 != null) espacoE11.exibirDados();
        if (espacoE12 != null) espacoE12.exibirDados();
        if (espacoE13 != null) espacoE13.exibirDados();
        if (espacoE14 != null) espacoE14.exibirDados();
        if (espacoE15 != null) espacoE15.exibirDados();
        if (espacoE16 != null) espacoE16.exibirDados();
        if (espacoE17 != null) espacoE17.exibirDados();
        if (espacoE18 != null) espacoE18.exibirDados();
        if (espacoE19 != null) espacoE19.exibirDados();

        System.out.println("--- Fim do Relatório ---");
    }

   
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}