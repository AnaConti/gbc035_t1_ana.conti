public class Horista extends Funcionarios{

    private double valorHora, horasTrabalhadas;

    public Horista(String nome, String dataNasc, double valorHora, double horasTrabalhadas){
        super(nome, dataNasc, 0);
        this.valorHora=valorHora;
        this.horasTrabalhadas=horasTrabalhadas;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void calculaSalario(){
        double salario = getHorasTrabalhadas()*getValorHora();
        super.setSalario(salario);
    }

    @Override
    public String toString() {
        return "Horista: "+ super.toString();
    }
}
