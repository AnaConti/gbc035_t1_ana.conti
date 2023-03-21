public class Main {
    public static void main(String[] args) {
        Figurinhas jogador1 = new Figurinhas();
        Figurinhas jogador2 = new Figurinhas();
        Figurinhas jogador3 = new Figurinhas();

        jogador1.setNome("Gabriel");
        jogador1.setDataNasc("04/04/1997");
        jogador1.setPosicao("Centroavante");
        jogador1.setPais("Angola");
        jogador1.setAltura(1.85);
        jogador1.setPeso(74);

        System.out.printf("Jogador 1: Nome: %s, Data de Nascimento: %s, Posicao: %s, Pais: %s, Altura: %.2f, Peso: %.2f\n"
                , jogador1.getNome(), jogador1.getDataNasc(), jogador1.getPosicao(), jogador1.getPais(), jogador1.getAltura(), jogador1.getPeso());

        jogador2.setNome("Anna Julia");
        jogador2.setDataNasc("20/05/2000");
        jogador2.setPosicao("Goleira");
        jogador2.setPais("Franca");
        jogador2.setAltura(1.77);
        jogador2.setPeso(64);

        System.out.printf("Jogador 2: Nome: %s, Data de Nascimento: %s, Posicao: %s, Pais: %s, Altura: %.2f, Peso: %.2f\n"
        , jogador2.getNome(), jogador2.getDataNasc(), jogador2.getPosicao(), jogador2.getPais(), jogador2.getAltura(), jogador2.getPeso());

        jogador3.setNome("Sammy");
        jogador3.setDataNasc("10/04/2020");
        jogador3.setPosicao("Ponta esquerda");
        jogador3.setPais("Brasil");
        jogador3.setAltura(0.63);
        jogador3.setPeso(6);

        System.out.printf("Jogador 3: Nome: %s, Data de Nascimento: %s, Posicao: %s, Pais: %s, Altura: %.2f, Peso: %.2f\n"
        , jogador3.getNome(), jogador3.getDataNasc(), jogador3.getPosicao(), jogador3.getPais(), jogador3.getAltura(), jogador3.getPeso());
}
}