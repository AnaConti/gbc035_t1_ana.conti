public class Operario extends Funcionario{
    // Operario: valor por produção * quantidade produzida
    private double valorProducao;
    private int qtd;

    public Operario(String nome, String dataNasc, double valorProducao, int qtd){
        super(nome,dataNasc);
        this.valorProducao=valorProducao;
        this.qtd=qtd;

        super.setSalario(this.valorProducao*this.qtd);
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    
}
