public class Horista extends Funcionario{
    // Horista: valor por hora * total de horas trabalhadas.
    private double valorHora, horasTrab;

    public Horista(String nome, String dataNasc, double valorHora, double horasTrab){
        super(nome, dataNasc);
        this.valorHora=valorHora;
        this.horasTrab=horasTrab;

        super.setSalario(this.valorHora*this.horasTrab);
    }

    public double getHorasTrab() {
        return horasTrab;
    }

    public void setHorasTrab(double horasTrab) {
        this.horasTrab = horasTrab;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    

}
