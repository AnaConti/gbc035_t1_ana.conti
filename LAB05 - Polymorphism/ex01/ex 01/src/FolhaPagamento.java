public class FolhaPagamento extends Funcionarios{
    public FolhaPagamento(String nome, String dataNasc, double salario){
        super(nome, dataNasc, salario);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public String getDataNasc() {
        return super.getDataNasc();
    }

    @Override
    public double getSalario() {
        return super.getSalario();
    }

    @Override
    public String toString() {
        return "Nome='" + getNome() + '\'' +
                ", dataNasc='" + getDataNasc() + '\'' +
                ", salario=" + getSalario();
    }
}
