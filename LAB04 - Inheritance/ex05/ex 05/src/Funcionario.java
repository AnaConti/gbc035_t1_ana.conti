public class Funcionario {
    private String nome, dataNasc;
    private double salario;

    public Funcionario(String nome, String dataNasc){
        this.nome=nome;
        this.dataNasc=dataNasc;
        this.salario=0.0;
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

    public String mostraFuncionario(){
        return "Nome: "+getNome()+ "\nData de nascimento:"+getDataNasc()+"\nSalario: "+getSalario();
    }
}
