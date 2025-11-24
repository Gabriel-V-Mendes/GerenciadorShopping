package Etapa3;

public class LojaAlimentacao extends Loja {

    private String tipoDeCozinha;

    /**
     * Documentação:
     * Construtor para a Loja de Alimentação.
     *
     * @param nome O nome
     * @param segmento O segmento
     * @param localizacao A localização
     * @param tipoDeCozinha O atributo específico desta classe
     */
    public LojaAlimentacao(String nome, String segmento, String localizacao, String tipoDeCozinha) {

       
        super(nome, segmento, localizacao);
        
        this.tipoDeCozinha = tipoDeCozinha;
    }

    public String getTipoDeCozinha() {
        return tipoDeCozinha;
    }

    public void setTipoDeCozinha(String tipoDeCozinha) {
        this.tipoDeCozinha = tipoDeCozinha;
    }

    @Override
    public void exibirDados() {
        
        super.exibirDados();
        
       
        System.out.println("Tipo de Cozinha: " + this.tipoDeCozinha);
    }
}