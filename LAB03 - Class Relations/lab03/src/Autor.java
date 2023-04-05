public class Autor {
    private String nome, dataNasc, instituicao;

    public Autor(String nome, String dataNasc, String instituicao){
        this.nome=nome;
        this.dataNasc=dataNasc;
        this.instituicao=instituicao;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setDataNasc(java.lang.String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public java.lang.String getDataNasc() {
        return this.dataNasc;
    }

    public void setInstituicao(java.lang.String instituicao) {
        this.instituicao = instituicao;
    }

    public java.lang.String getInstituicao() {
        return this.instituicao;
    }
    
}
