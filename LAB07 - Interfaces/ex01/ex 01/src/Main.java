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
    }


}
