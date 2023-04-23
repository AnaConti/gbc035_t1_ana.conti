public class Figurinhas {
    private String nome, dataNasc, posicao, pais;
    private double altura, peso;

    public Figurinhas(String nome, String dataNasc, String posicao, String pais, double altura, double peso){
        this.nome=nome;
        this.dataNasc=dataNasc;
        this.posicao=posicao;
        this.pais=pais;
        this.altura=altura;
        this.peso=peso;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public String mostraFigurinhas(){
        return"Nome: "+ getNome()+ "\nData de nascimento: " + getDataNasc()+
                "\nPosicao: " +getPosicao()+ "\nPais: " +getPais()+
                "\nAltura: " +getAltura()+ "\nPeso: " +getPeso();
    }
    
}

