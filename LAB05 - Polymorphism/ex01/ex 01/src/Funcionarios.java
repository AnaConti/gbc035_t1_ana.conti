public class Funcionarios {
    private String nome, dataNasc;
    private double salario;

    public Funcionarios(String nome, String dataNasc, double salario){
        this.nome=nome;
        this.dataNasc= dataNasc;
        this.salario=salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nome='" + nome + '\'' +
                ", dataNasc='" + dataNasc + '\'' +
                ", salario=" + salario;
    }

}
