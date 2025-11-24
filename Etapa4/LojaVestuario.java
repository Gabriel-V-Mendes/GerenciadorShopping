package Etapa4;


public class LojaVestuario extends Loja {

    private boolean possuiProvadores;

    public LojaVestuario(String nome, String segmento, String localizacao, boolean possuiProvadores) {
        
    
        super(nome, segmento, localizacao);
        
        this.possuiProvadores = possuiProvadores;
    }

    public boolean getPossuiProvadores() {
        return possuiProvadores;
    }

    public void setPossuiProvadores(boolean possuiProvadores) {
        this.possuiProvadores = possuiProvadores;
    }

    @Override
    public void exibirDados() {
        
        super.exibirDados();
        
        String textoProvador = this.possuiProvadores ? "Sim" : "Não";
        System.out.println("Possui Provadores: " + textoProvador);
    }
}