public class Vendedores extends Funcionarios{
    private double comissao;
    private int vendas;

    public Vendedores(String nome, String dataNasc, double salario, double comissao, int vendas){
        super(nome, dataNasc, salario);
        this.comissao=comissao;
        this.vendas=vendas;
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

    public void calculaSalario(){
        double salario =super.getSalario()+ getComissao()*getVendas();
        super.setSalario(salario);
    }

    @Override
    public String toString() {
        return "Vendedores: " + super.toString();
    }
}
