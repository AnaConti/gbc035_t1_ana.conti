public class Chefe extends Funcionario{

    public Chefe(String nome, String dataNascimento, double salarioFixo) {
        super(nome, dataNascimento);
        setSalario(salarioFixo);
    }
}
