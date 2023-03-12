import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Produto[] produtos= new Produto[4];

        for(int i=0; i<4;i++){
            produtos[i]=new Produto();
        }

        for(int i=0; i<4;i++){
            System.out.println("Informe o nome, o preco e a qtd. em estoque do produto "+(i+1));
            produtos[i].nome=sc.nextLine();
            produtos[i].preco=sc.nextFloat();
            sc.nextLine();
            produtos[i].qtd_estoque=sc.nextInt();
            sc.nextLine();
        }

        System.out.println("Aumentando o preco em 10% do produto 1 e 3");
        produtos[0].altera_preco(-110);
        produtos[2].altera_preco(10);

        System.out.println("Reduzindo o preco em 5% do produto 2");
        if(produtos[1].altera_preco(-5)==-1)
            System.out.println("Erro: preco nao alterado. Porcentagem invalida");
        System.out.println("Preco alterado com sucesso");

        System.out.println("Alterando o preco do prod. 3");
        if(produtos[3].altera_preco(-110)==-1)
            System.out.println("Erro: preco nao alterado. Porcentagem invalida");

        System.out.println("Produtos Cadastrados:");
        for(int i=0;i<4;i++){
            System.out.printf("\nProduto: %s\nPreco: %f\nEstoque: %d", produtos[i].nome, produtos[i].preco, produtos[i].qtd_estoque);
        }
    }
}