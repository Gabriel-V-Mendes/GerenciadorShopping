package Etapa4; 

public class Loja {

    private String nome;
    private String segmento;
    private String localizacao; 

    /**
     * a partir desta classe (usando a palavra 'new').
     * fornece os dados iniciais no momento da criação.
     * @param nome O nome da loja
     * @param segmento O segmento da loja 
     * @param localizacao A localização no shopping
     */
    public Loja(String nome, String segmento, String localizacao) {
        this.nome = nome;
        this.segmento = segmento;
        this.localizacao = localizacao;
    }

    /**
     * Documentação: Permite que outras partes do código leiam o nome da loja.
     * @return o nome da loja
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Documentação: Permite que outras partes do código leiam o segmento da loja.
     * @return o segmento da loja
     */
    public String getSegmento() {
        return this.segmento;
    }

    /**
     * Documentação: Permite que outras partes do código leiam a localização da loja.
     * @return a localização da loja
     */
    public String getLocalizacao() {
        return this.localizacao;
    }


    /**
     * Documentação: Permite que outras partes do código alterem o nome da loja.
     * @param nome O novo nome para a loja.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Documentação: Permite que outras partes do código alterem o segmento da loja.
     * @param segmento O novo segmento para a loja.
     */
    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    /**
     * Documentação: Permite que outras partes do código alterem a localização da loja.
     * @param localizacao A nova localização para a loja.
     */
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void exibirDados() {
        System.out.println("--- Dados da Loja ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Segmento: " + this.segmento);
        System.out.println("Localização: " + this.localizacao);
    }
}