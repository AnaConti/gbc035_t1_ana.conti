public class Main {
    public static void main(String[] args) {
        Figurinhas jogador1 = new Figurinhas();
        Figurinhas jogador2 = new Figurinhas();
        Figurinhas jogador3 = new Figurinhas();

        jogador1.nome="Gabriel";
        jogador1.dataNasc="04/04/1997";
        jogador1.posicao="Centroavante";
        jogador1.pais="Angola";
        jogador1.altura=1.85;
        jogador1.peso=74;

        System.out.printf("Jogador 1: Nome: %s, Data de Nascimento: %s, Posicao: %s, Pais: %s, Altura: %.2f, Peso: %.2f\n"
        , jogador1.nome, jogador1.dataNasc, jogador1.posicao, jogador1.pais, jogador1.altura, jogador1.peso);

        jogador2.nome="Anna Julia";
        jogador2.dataNasc="20/05/2000";
        jogador2.posicao="Goleira";
        jogador2.pais="Franca";
        jogador2.altura=1.77;
        jogador2.peso=64;

        System.out.printf("Jogador 2: Nome: %s, Data de Nascimento: %s, Posicao: %s, Pais: %s, Altura: %.2f, Peso: %.2f\n"
        , jogador2.nome, jogador2.dataNasc, jogador2.posicao, jogador2.pais, jogador2.altura, jogador2.peso);

        jogador3.nome="Sammy";
        jogador3.dataNasc="10/04/2020";
        jogador3.posicao="Ponta esquerda";
        jogador3.pais="Brasil";
        jogador3.altura=0.63;
        jogador3.peso=6;

        System.out.printf("Jogador 3: Nome: %s, Data de Nascimento: %s, Posicao: %s, Pais: %s, Altura: %.2f, Peso: %.2f\n"
        , jogador3.nome, jogador3.dataNasc, jogador3.posicao, jogador3.pais, jogador3.altura, jogador3.peso);
    }
}