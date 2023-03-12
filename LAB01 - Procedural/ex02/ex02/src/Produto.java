public class Produto {
    String nome;
    float preco;
    int qtd_estoque;

    public int altera_preco(float porcentagem){
        float temp;

        if(porcentagem > -100){
            temp= 1+porcentagem/100;
            this.preco=this.preco*temp;
            return 0;
        }
        return -1;
    }
}
