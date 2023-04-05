public class Selecao {
    private String nomeSelecao, tecnico;
    private Figurinhas[] jogadores;

    public Selecao(String nomeSelecao, String tecnico, String pais){
        this.nomeSelecao=nomeSelecao;
        this.tecnico=tecnico;
        this.jogadores= new Figurinhas[11];
        for(int i=0; i< jogadores.length; i++){
            jogadores[i]= new Figurinhas(pais);
        }
    }

    public void setNomeSelecao(String nomeSelecao){
        this.nomeSelecao=nomeSelecao;
    }

    public String getNomeSelecao(){
        return this.nomeSelecao;
    }

    public void setJogadores(Figurinhas[] jogadores) {
        this.jogadores = jogadores;
    }

    public Figurinhas[] getJogadores() {
        return this.jogadores;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public String getTecnico() {
        return this.tecnico;
    }

    
}
