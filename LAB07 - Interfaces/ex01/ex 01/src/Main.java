public class Main {
    public static void main(String[] args) {

        Produto[] produtos = new Produto[5]; 

        produtos[0] = new Produto(3);
        produtos[1] = new Produto(1);
        produtos[2] = new Produto(5);
        produtos[3] = new Produto(2);
        produtos[4] = new Produto(4);

        Classificador classificador = new Classificador();
        classificador.ordena(produtos);

        for (Produto produto : produtos) {
            System.out.println(produto);
        }



        Servico[] servicos = new Servico[5]; 

        servicos[0] = new Servico(3.14);
        servicos[1] = new Servico(15.4);
        servicos[2] = new Servico(17.5);
        servicos[3] = new Servico(2.8);
        servicos[4] = new Servico(0.4);

        
        classificador.ordena(servicos);

        System.out.println("\n");
        for (Servico servico : servicos) {
            System.out.println(servico);
        }


        Cliente[] clientes = new Cliente[5]; 

        clientes[0] = new Cliente("Ana");
        clientes[1] = new Cliente("Beatriz");
        clientes[2] = new Cliente("Maria");
        clientes[3] = new Cliente("Julia");
        clientes[4] = new Cliente("Barbara");

        
        classificador.ordena(clientes);

        System.out.println("\n");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }


}
