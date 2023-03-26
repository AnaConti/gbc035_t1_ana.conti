public class Main {
    public static void main(String[] args) {
        Figurinhas []fig = new Figurinhas[3];

        for(int i=0; i<fig.length; i++){
            fig[i]= new Figurinhas();
        }

        fig[0].setNome("Gabriel");
        fig[0].setDataNasc("04/04/1997");
        fig[0].setPosicao("Centroavante");
        fig[0].setPais("Angola");
        fig[0].setAltura(1.85);
        fig[0].setPeso(74);

        System.out.printf("Jogador 1: Nome: %s, Data de Nascimento: %s, Posicao: %s, Pais: %s, Altura: %.2f, Peso: %.2f\n"
                , fig[0].getNome(), fig[0].getDataNasc(), fig[0].getPosicao(), fig[0].getPais(), fig[0].getAltura(), fig[0].getPeso());

        fig[1].setNome("Anna Julia");
        fig[1].setDataNasc("20/05/2000");
        fig[1].setPosicao("Goleira");
        fig[1].setPais("Franca");
        fig[1].setAltura(1.77);
        fig[1].setPeso(64);

        System.out.printf("Jogador 2: Nome: %s, Data de Nascimento: %s, Posicao: %s, Pais: %s, Altura: %.2f, Peso: %.2f\n"
        , fig[1].getNome(), fig[1].getDataNasc(), fig[1].getPosicao(), fig[1].getPais(), fig[1].getAltura(), fig[1].getPeso());

        fig[2].setNome("Sammy");
        fig[2].setDataNasc("10/04/2020");
        fig[2].setPosicao("Ponta esquerda");
        fig[2].setPais("Brasil");
        fig[2].setAltura(0.63);
        fig[2].setPeso(6);

        System.out.printf("Jogador 3: Nome: %s, Data de Nascimento: %s, Posicao: %s, Pais: %s, Altura: %.2f, Peso: %.2f\n"
        , fig[2].getNome(), fig[2].getDataNasc(), fig[2].getPosicao(), fig[2].getPais(), fig[2].getAltura(), fig[2].getPeso());

    }
}