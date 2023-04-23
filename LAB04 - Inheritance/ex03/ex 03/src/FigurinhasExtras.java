public class FigurinhasExtras extends Figurinhas{
    private String categoria, cor;
    
    public FigurinhasExtras(String nome, String dataNasc, String posicao, String pais, double altura, double peso, String categoria, String cor){
        super(nome, dataNasc, posicao, pais, altura, peso);
        
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
        return super.mostraFigurinhas()+
                "\nCategoria: " +getCategoria()+ "\nCor: " +getCor();

    }
    
}

