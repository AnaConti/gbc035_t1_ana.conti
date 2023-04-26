public class CamaroteInferior extends VIP{
    private String localizacao;

    public CamaroteInferior(String localizacao, double valor, double valorAdicional){
        super(valor, valorAdicional);
        this.localizacao=localizacao;
    }

    public String getLocalizacaoCI() {
        return localizacao;
    }

    public void setLocalizacaoCI(String localizacao) {
        this.localizacao = localizacao;
    }

    public String imprimeLocalizacaoCI(){
        return "Localizacao: "+getLocalizacaoCI();
    }
}
