public class Main {
    public static void main(String[] args) {
        Funcionarios f = new Chefe("Joao", "15/06/2000", 2500.00);
        System.out.println(f.toString());

        Funcionarios v = new Vendedores("Maria", "17/06/1999", 1500.00, 275.75, 5);

        ((Vendedores) v).calculaSalario();
        System.out.println(v.toString());


    }
}