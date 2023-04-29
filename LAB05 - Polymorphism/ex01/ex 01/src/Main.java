public class Main {
    public static void main(String[] args) {
        Funcionarios [] funcionarios = new Funcionarios[20];
        
        funcionarios[0]= new Chefe("Joao", "15/06/2000", 2500.00);
        funcionarios[1] = new Vendedores("Maria", "17/06/1999", 1500.00, 275.75, 5);
        funcionarios[2] = new Operarios("Leo", "05/04/2001", 175.0, 15);
        funcionarios[3] = new Horista("Ana", "14/12/2001", 75.00, 36.0);

        ((Vendedores) funcionarios[1]).calculaSalario();
        ((Operarios)funcionarios[2]).calculaSalario();
        ((Horista)funcionarios[3]).calculaSalario();

        for(int i =0; i<funcionarios.length; i++){
            System.out.println(funcionarios[i].toString());
        }
    }
}