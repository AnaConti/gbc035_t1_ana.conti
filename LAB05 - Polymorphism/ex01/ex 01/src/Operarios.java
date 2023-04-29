public class Operarios extends Funcionarios{

    private double valorProducao;
    private int qtdProduzida;

    public Operarios(String nome, String dataNasc, double valorProducao, int qtdProduzida){
        super(nome, dataNasc, 0.0);
        this.valorProducao=valorProducao;
        this.qtdProduzida=qtdProduzida;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public int getQtdProduzida() {
        return qtdProduzida;
    }

    public void setQtdProduzida(int qtdProduzida) {
        this.qtdProduzida = qtdProduzida;
    }

    public void calculaSalario(){
        double salario = getValorProducao()*getQtdProduzida();
        setSalario(salario);
    }
    
    @Override
    public String toString() {
        return "Operarios: " + super.toString();
    }
}
