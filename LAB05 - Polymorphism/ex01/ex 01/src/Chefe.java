public class Chefe extends Funcionarios{
    public Chefe(String nome, String dataNasc, double salario){
        super(nome, dataNasc, salario);
    }

    @Override
    public String toString() {
        return "Chefe: " +super.toString();
    }
}
