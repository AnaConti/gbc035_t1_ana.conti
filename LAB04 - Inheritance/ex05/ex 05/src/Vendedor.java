public class Vendedor extends Funcionario{ 
    // Vendedor: valor fixo + comissão * vendas;
    private double comissao;
    private int vendas;

    public Vendedor(String nome, String dataNascimento, double valorFixo, double comissao, int vendas){
        super(nome,dataNascimento);
        this.comissao=comissao;
        this.vendas=vendas;
        
        super.setSalario(valorFixo+this.comissao*this.vendas);
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    


}
