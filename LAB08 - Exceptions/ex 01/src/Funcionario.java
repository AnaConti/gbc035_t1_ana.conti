public class Funcionario {
    private String nome;
    private int CPF;
    private double salario;
    private double tetoSalarial;

    public Funcionario(String nome, int CPF, double salario){
        this.nome=nome;
        this.CPF=CPF;
        this.salario=salario;
        this.tetoSalarial=40000.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getTetoSalarial() {
        return tetoSalarial;
    }

    public void setTetoSalarial(double tetoSalarial) {
        this.tetoSalarial = tetoSalarial;
    }

    public double aumentaSalario(double valorPercentual){
        double aumento = getSalario() * valorPercentual;
        
        if(aumento<0){
            throw new ValorInvalidoException("Valor inválido de salário");
        }
        if(aumento>getTetoSalarial()){
            throw new ValorInvalidoException("Valor ultrapassa o teto");
        }

        setSalario(aumento);
        return getSalario();

    }
}
