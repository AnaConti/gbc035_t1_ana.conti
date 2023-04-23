public class FigurinhasExtras{
    private String nome, dataNasc, posicao, pais, categoria, cor;
    private double altura, peso;
    
    public FigurinhasExtras(String nome, String dataNasc, String posicao, String pais, double altura, double peso, String categoria, String cor){
        this.nome=nome;
        this.dataNasc=dataNasc;
        this.posicao=posicao;
        this.pais=pais;
        this.altura=altura;
        this.peso=peso;
        
        if((categoria.equals("Legends")) || (categoria.equals("Rookies"))){
            this.categoria=categoria;
        }
        else{
            System.out.println("Categoria nao existe!");
        }

        if(cor.equals("bordo")|| cor.equals("bronze") || cor.equals("prata")|| cor.equals("ouro")){
            this.cor=cor;
        }
        else{
            System.out.println("Nao existe essa cor para as figurinhas!");
        }
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

    public void setCategoria(String categoria){
        this.categoria=categoria;
    }

    public String getCategoria(){
        return categoria;
    }

    public void setCor(String cor){
        this.cor=cor;
    }

    public String getCor(){
        return cor;
    }

    public String mostraFigurinhasExtra(){
        return"Nome: "+ getNome()+ "\nData de nascimento: " + getDataNasc()+
                "\nPosicao: " +getPosicao()+ "\nPais: " +getPais()+
                "\nAltura: " +getAltura()+ "\nPeso: " +getPeso()+
                "\nCategoria: " +getCategoria()+ "\nCor: " +getCor();

    }
    
}

