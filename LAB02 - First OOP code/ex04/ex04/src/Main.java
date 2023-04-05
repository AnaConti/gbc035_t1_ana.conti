public class Main {
    public static void main(String[] args) {
        Figurinhas []jogadoresBrasil = new Figurinhas[11];

        for(int i=0; i<jogadoresBrasil.length; i++){
            jogadoresBrasil[i]= new Figurinhas();
        }

        jogadoresBrasil[0].setNome("Gabriel");
        jogadoresBrasil[0].setDataNasc("04/04/1997");
        jogadoresBrasil[0].setPosicao("Centroavante");
        jogadoresBrasil[0].setPais("Angola");
        jogadoresBrasil[0].setAltura(1.85);
        jogadoresBrasil[0].setPeso(74);

        jogadoresBrasil[1].setNome("Anna Julia");
        jogadoresBrasil[1].setDataNasc("20/05/2000");
        jogadoresBrasil[1].setPosicao("Goleira");
        jogadoresBrasil[1].setPais("Franca");
        jogadoresBrasil[1].setAltura(1.77);
        jogadoresBrasil[1].setPeso(64);
        
        jogadoresBrasil[2].setNome("Sammy");
        jogadoresBrasil[2].setDataNasc("10/04/2020");
        jogadoresBrasil[2].setPosicao("Ponta esquerda");
        jogadoresBrasil[2].setPais("Brasil");
        jogadoresBrasil[2].setAltura(0.63);
        jogadoresBrasil[2].setPeso(6);

        jogadoresBrasil[3].setNome("Sammy");
        jogadoresBrasil[3].setDataNasc("10/04/2020");
        jogadoresBrasil[3].setPosicao("Ponta esquerda");
        jogadoresBrasil[3].setPais("Brasil");
        jogadoresBrasil[3].setAltura(0.63);
        jogadoresBrasil[3].setPeso(6);

        jogadoresBrasil[4].setNome("Sammy");
        jogadoresBrasil[4].setDataNasc("10/04/2020");
        jogadoresBrasil[4].setPosicao("Ponta esquerda");
        jogadoresBrasil[4].setPais("Brasil");
        jogadoresBrasil[4].setAltura(0.63);
        jogadoresBrasil[4].setPeso(6);

        jogadoresBrasil[5].setNome("Sammy");
        jogadoresBrasil[5].setDataNasc("10/04/2020");
        jogadoresBrasil[5].setPosicao("Ponta esquerda");
        jogadoresBrasil[5].setPais("Brasil");
        jogadoresBrasil[5].setAltura(0.63);
        jogadoresBrasil[5].setPeso(6);

        jogadoresBrasil[6].setNome("Sammy");
        jogadoresBrasil[6].setDataNasc("10/04/2020");
        jogadoresBrasil[6].setPosicao("Ponta esquerda");
        jogadoresBrasil[6].setPais("Brasil");
        jogadoresBrasil[6].setAltura(0.63);
        jogadoresBrasil[6].setPeso(6);

        jogadoresBrasil[7].setNome("Sammy");
        jogadoresBrasil[7].setDataNasc("10/04/2020");
        jogadoresBrasil[7].setPosicao("Ponta esquerda");
        jogadoresBrasil[7].setPais("Brasil");
        jogadoresBrasil[7].setAltura(0.63);
        jogadoresBrasil[7].setPeso(6);

        jogadoresBrasil[8].setNome("Sammy");
        jogadoresBrasil[8].setDataNasc("10/04/2020");
        jogadoresBrasil[8].setPosicao("Ponta esquerda");
        jogadoresBrasil[8].setPais("Brasil");
        jogadoresBrasil[8].setAltura(0.63);
        jogadoresBrasil[8].setPeso(6);

        jogadoresBrasil[9].setNome("Sammy");
        jogadoresBrasil[9].setDataNasc("10/04/2020");
        jogadoresBrasil[9].setPosicao("Ponta esquerda");
        jogadoresBrasil[9].setPais("Brasil");
        jogadoresBrasil[9].setAltura(0.63);
        jogadoresBrasil[9].setPeso(6);

        jogadoresBrasil[10].setNome("Sammy");
        jogadoresBrasil[10].setDataNasc("10/04/2020");
        jogadoresBrasil[10].setPosicao("Ponta esquerda");
        jogadoresBrasil[10].setPais("Brasil");
        jogadoresBrasil[10].setAltura(0.63);
        jogadoresBrasil[10].setPeso(6);

        Selecao brasil = new Selecao();
        brasil.setNomeSelecao("Brasil");
        brasil.setTecnico("Joao");

        System.out.println("Selecao: " + brasil.getNomeSelecao());
        System.out.println("Técnico: " + brasil.getTecnico());
        System.out.println("Jogadores titulares:");
        for (int i = 0; i < 11; i++) {
            System.out.println("Jogador " + (i+1) + ":");
            System.out.println("Nome do Jogador: " + jogadoresBrasil[i].getNome());
            System.out.println("Data de Nascimento: " + jogadoresBrasil[i].getDataNasc());
            System.out.println("Altura: " + jogadoresBrasil[i].getAltura() + "m");
            System.out.println("Peso: " + jogadoresBrasil[i].getPeso() + "kg");
            System.out.println("Posição: " + jogadoresBrasil[i].getPosicao());
            System.out.println("País: " + jogadoresBrasil[i].getPais());
            System.out.println();
        }  
        
        Figurinhas []jogadoresArgentina = new Figurinhas[11];

        for(int i=0; i<jogadoresArgentina.length; i++){
            jogadoresArgentina[i]= new Figurinhas();
        }

        jogadoresArgentina[0].setNome("Gabriel");
        jogadoresArgentina[0].setDataNasc("04/04/1997");
        jogadoresArgentina[0].setPosicao("Centroavante");
        jogadoresArgentina[0].setPais("Angola");
        jogadoresArgentina[0].setAltura(1.85);
        jogadoresArgentina[0].setPeso(74);

        jogadoresArgentina[1].setNome("Anna Julia");
        jogadoresArgentina[1].setDataNasc("20/05/2000");
        jogadoresArgentina[1].setPosicao("Goleira");
        jogadoresArgentina[1].setPais("Franca");
        jogadoresArgentina[1].setAltura(1.77);
        jogadoresArgentina[1].setPeso(64);
        
        jogadoresArgentina[2].setNome("Sammy");
        jogadoresArgentina[2].setDataNasc("10/04/2020");
        jogadoresArgentina[2].setPosicao("Ponta esquerda");
        jogadoresArgentina[2].setPais("Argentina");
        jogadoresArgentina[2].setAltura(0.63);
        jogadoresArgentina[2].setPeso(6);

        jogadoresArgentina[3].setNome("Sammy");
        jogadoresArgentina[3].setDataNasc("10/04/2020");
        jogadoresArgentina[3].setPosicao("Ponta esquerda");
        jogadoresArgentina[3].setPais("Argentina");
        jogadoresArgentina[3].setAltura(0.63);
        jogadoresArgentina[3].setPeso(6);

        jogadoresArgentina[4].setNome("Sammy");
        jogadoresArgentina[4].setDataNasc("10/04/2020");
        jogadoresArgentina[4].setPosicao("Ponta esquerda");
        jogadoresArgentina[4].setPais("Argentina");
        jogadoresArgentina[4].setAltura(0.63);
        jogadoresArgentina[4].setPeso(6);

        jogadoresArgentina[5].setNome("Sammy");
        jogadoresArgentina[5].setDataNasc("10/04/2020");
        jogadoresArgentina[5].setPosicao("Ponta esquerda");
        jogadoresArgentina[5].setPais("Argentina");
        jogadoresArgentina[5].setAltura(0.63);
        jogadoresArgentina[5].setPeso(6);

        jogadoresArgentina[6].setNome("Sammy");
        jogadoresArgentina[6].setDataNasc("10/04/2020");
        jogadoresArgentina[6].setPosicao("Ponta esquerda");
        jogadoresArgentina[6].setPais("Argentina");
        jogadoresArgentina[6].setAltura(0.63);
        jogadoresArgentina[6].setPeso(6);

        jogadoresArgentina[7].setNome("Sammy");
        jogadoresArgentina[7].setDataNasc("10/04/2020");
        jogadoresArgentina[7].setPosicao("Ponta esquerda");
        jogadoresArgentina[7].setPais("Argentina");
        jogadoresArgentina[7].setAltura(0.63);
        jogadoresArgentina[7].setPeso(6);

        jogadoresArgentina[8].setNome("Sammy");
        jogadoresArgentina[8].setDataNasc("10/04/2020");
        jogadoresArgentina[8].setPosicao("Ponta esquerda");
        jogadoresArgentina[8].setPais("Argentina");
        jogadoresArgentina[8].setAltura(0.63);
        jogadoresArgentina[8].setPeso(6);

        jogadoresArgentina[9].setNome("Sammy");
        jogadoresArgentina[9].setDataNasc("10/04/2020");
        jogadoresArgentina[9].setPosicao("Ponta esquerda");
        jogadoresArgentina[9].setPais("Argentina");
        jogadoresArgentina[9].setAltura(0.63);
        jogadoresArgentina[9].setPeso(6);

        jogadoresArgentina[10].setNome("Sammy");
        jogadoresArgentina[10].setDataNasc("10/04/2020");
        jogadoresArgentina[10].setPosicao("Ponta esquerda");
        jogadoresArgentina[10].setPais("Argentina");
        jogadoresArgentina[10].setAltura(0.63);
        jogadoresArgentina[10].setPeso(6);

        Selecao Argentina = new Selecao();
        Argentina.setNomeSelecao("Argentina");
        Argentina.setTecnico("Joao");

        System.out.println("Selecao: " + Argentina.getNomeSelecao());
        System.out.println("Técnico: " + Argentina.getTecnico());
        System.out.println("Jogadores titulares:");
        for (int i = 0; i < 11; i++) {
            System.out.println("Jogador " + (i+1) + ":");
            System.out.println("Nome do Jogador: " + jogadoresArgentina[i].getNome());
            System.out.println("Data de Nascimento: " + jogadoresArgentina[i].getDataNasc());
            System.out.println("Altura: " + jogadoresArgentina[i].getAltura() + "m");
            System.out.println("Peso: " + jogadoresArgentina[i].getPeso() + "kg");
            System.out.println("Posição: " + jogadoresArgentina[i].getPosicao());
            System.out.println("País: " + jogadoresArgentina[i].getPais());
            System.out.println();
        }  
        

        
    }
}