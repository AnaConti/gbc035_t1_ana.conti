public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João", 123456789, 30000.0);

        try {
            funcionario.aumentaSalario(-1.10);
            System.out.println("Salário atual: " + funcionario.getSalario());
        } catch (ValorInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
            System.out.println("Salário atual: " + funcionario.getSalario());
        }
    }
}