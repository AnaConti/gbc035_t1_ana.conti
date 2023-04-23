public class Empresa {
    public static void main(String[] args) {
        int n = 8;

        Funcionario []funcionarios = new Funcionario[n];

        funcionarios[0]= new Chefe("Joao", "15/07/1998", 5047.45);
        funcionarios[1]= new Chefe("Maria", "01/07/2000", 5047.45);
        
        funcionarios[2]= new Vendedor("Ana", "22/12/2001", 1500.85, 500.25, 15);
        funcionarios[3]= new Vendedor("Alice", "03/09/1995", 1500.85, 500.25, 12);

        funcionarios[4]= new Horista("Amanda", "19/11/2002", 20.15, 80.00);
        funcionarios[5]= new Horista("Leonardo", "09/01/1995", 20.15, 72.00);

        funcionarios[6]= new Operario("Ricardo", "29/03/1989", 35.00, 15);
        funcionarios[7]= new Operario("Jorge", "08/12/1996", 35.00, 19);

        for(int i=0; i<funcionarios.length;i++){
            System.out.println("Funcionarios: " +i);
            System.out.println(funcionarios[i].mostraFuncionario());
            System.out.println("\n");
        }

    }
}

