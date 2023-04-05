public class Main {
    public static void main(String[] args) {
        Selecao selecao1= new Selecao("Brasil", "Joao", "Brasil");
        selecao1.getJogadores()[0].setNome("Gabriel");
        selecao1.getJogadores()[0].setDataNasc("04/04/1997");
        selecao1.getJogadores()[0].setPosicao("Centroavante");
        selecao1.getJogadores()[0].setPais("Angola");
        selecao1.getJogadores()[0].setAltura(1.85);
        selecao1.getJogadores()[0].setPeso(74);

        selecao1.getJogadores()[1].setNome("Anna Julia");
        selecao1.getJogadores()[1].setDataNasc("20/05/2000");
        selecao1.getJogadores()[1].setPosicao("Goleira");
        selecao1.getJogadores()[1].setPais("Franca");
        selecao1.getJogadores()[1].setAltura(1.77);
        selecao1.getJogadores()[1].setPeso(64);
        
        selecao1.getJogadores()[2].setNome("Sammy");
        selecao1.getJogadores()[2].setDataNasc("10/04/2020");
        selecao1.getJogadores()[2].setPosicao("Ponta esquerda");
        selecao1.getJogadores()[2].setPais("Brasil");
        selecao1.getJogadores()[2].setAltura(0.63);
        selecao1.getJogadores()[2].setPeso(6);

        selecao1.getJogadores()[3].setNome("Sammy");
        selecao1.getJogadores()[3].setDataNasc("10/04/2020");
        selecao1.getJogadores()[3].setPosicao("Ponta esquerda");
        selecao1.getJogadores()[3].setPais("Brasil");
        selecao1.getJogadores()[3].setAltura(0.63);
        selecao1.getJogadores()[3].setPeso(6);

        selecao1.getJogadores()[4].setNome("Sammy");
        selecao1.getJogadores()[4].setDataNasc("10/04/2020");
        selecao1.getJogadores()[4].setPosicao("Ponta esquerda");
        selecao1.getJogadores()[4].setPais("Brasil");
        selecao1.getJogadores()[4].setAltura(0.63);
        selecao1.getJogadores()[4].setPeso(6);

        selecao1.getJogadores()[5].setNome("Sammy");
        selecao1.getJogadores()[5].setDataNasc("10/04/2020");
        selecao1.getJogadores()[5].setPosicao("Ponta esquerda");
        selecao1.getJogadores()[5].setPais("Brasil");
        selecao1.getJogadores()[5].setAltura(0.63);
        selecao1.getJogadores()[5].setPeso(6);

        selecao1.getJogadores()[6].setNome("Sammy");
        selecao1.getJogadores()[6].setDataNasc("10/04/2020");
        selecao1.getJogadores()[6].setPosicao("Ponta esquerda");
        selecao1.getJogadores()[6].setPais("Brasil");
        selecao1.getJogadores()[6].setAltura(0.63);
        selecao1.getJogadores()[6].setPeso(6);

        selecao1.getJogadores()[7].setNome("Sammy");
        selecao1.getJogadores()[7].setDataNasc("10/04/2020");
        selecao1.getJogadores()[7].setPosicao("Ponta esquerda");
        selecao1.getJogadores()[7].setPais("Brasil");
        selecao1.getJogadores()[7].setAltura(0.63);
        selecao1.getJogadores()[7].setPeso(6);

        selecao1.getJogadores()[8].setNome("Sammy");
        selecao1.getJogadores()[8].setDataNasc("10/04/2020");
        selecao1.getJogadores()[8].setPosicao("Ponta esquerda");
        selecao1.getJogadores()[8].setPais("Brasil");
        selecao1.getJogadores()[8].setAltura(0.63);
        selecao1.getJogadores()[8].setPeso(6);

        selecao1.getJogadores()[9].setNome("Sammy");
        selecao1.getJogadores()[9].setDataNasc("10/04/2020");
        selecao1.getJogadores()[9].setPosicao("Ponta esquerda");
        selecao1.getJogadores()[9].setPais("Brasil");
        selecao1.getJogadores()[9].setAltura(0.63);
        selecao1.getJogadores()[9].setPeso(6);

        selecao1.getJogadores()[10].setNome("Sammy");
        selecao1.getJogadores()[10].setDataNasc("10/04/2020");
        selecao1.getJogadores()[10].setPosicao("Ponta esquerda");
        selecao1.getJogadores()[10].setPais("Brasil");
        selecao1.getJogadores()[10].setAltura(0.63);
        selecao1.getJogadores()[10].setPeso(6);

        System.out.println("Selecao: " + selecao1.getNomeSelecao());
        System.out.println("Técnico: " + selecao1.getTecnico());
        System.out.println("Jogadores titulares:");
        for (int i = 0; i < 11; i++) {
            System.out.println("Jogador " + (i+1) + ":");
            System.out.println("Nome do Jogador: " + selecao1.getJogadores()[i].getNome());
            System.out.println("Data de Nascimento: " + selecao1.getJogadores()[i].getDataNasc());
            System.out.println("Altura: " + selecao1.getJogadores()[i].getAltura() + "m");
            System.out.println("Peso: " + selecao1.getJogadores()[i].getPeso() + "kg");
            System.out.println("Posição: " + selecao1.getJogadores()[i].getPosicao());
            System.out.println("País: " + selecao1.getJogadores()[i].getPais());
            System.out.println();
        }  

        Selecao selecao2= new Selecao("Argentina", "Juan", "Argentina");
        selecao2.getJogadores()[0].setNome("Gabriel");
        selecao2.getJogadores()[0].setDataNasc("04/04/1997");
        selecao2.getJogadores()[0].setPosicao("Centroavante");
        selecao2.getJogadores()[0].setPais("Angola");
        selecao2.getJogadores()[0].setAltura(1.85);
        selecao2.getJogadores()[0].setPeso(74);

        selecao2.getJogadores()[1].setNome("Anna Julia");
        selecao2.getJogadores()[1].setDataNasc("20/05/2000");
        selecao2.getJogadores()[1].setPosicao("Goleira");
        selecao2.getJogadores()[1].setPais("Franca");
        selecao2.getJogadores()[1].setAltura(1.77);
        selecao2.getJogadores()[1].setPeso(64);
        
        selecao2.getJogadores()[2].setNome("Sammy");
        selecao2.getJogadores()[2].setDataNasc("10/04/2020");
        selecao2.getJogadores()[2].setPosicao("Ponta esquerda");
        selecao2.getJogadores()[2].setPais("Argentina");
        selecao2.getJogadores()[2].setAltura(0.63);
        selecao2.getJogadores()[2].setPeso(6);

        selecao2.getJogadores()[3].setNome("Sammy");
        selecao2.getJogadores()[3].setDataNasc("10/04/2020");
        selecao2.getJogadores()[3].setPosicao("Ponta esquerda");
        selecao2.getJogadores()[3].setPais("Argentina");
        selecao2.getJogadores()[3].setAltura(0.63);
        selecao2.getJogadores()[3].setPeso(6);

        selecao2.getJogadores()[4].setNome("Sammy");
        selecao2.getJogadores()[4].setDataNasc("10/04/2020");
        selecao2.getJogadores()[4].setPosicao("Ponta esquerda");
        selecao2.getJogadores()[4].setPais("Argentina");
        selecao2.getJogadores()[4].setAltura(0.63);
        selecao2.getJogadores()[4].setPeso(6);

        selecao2.getJogadores()[5].setNome("Sammy");
        selecao2.getJogadores()[5].setDataNasc("10/04/2020");
        selecao2.getJogadores()[5].setPosicao("Ponta esquerda");
        selecao2.getJogadores()[5].setPais("Argentina");
        selecao2.getJogadores()[5].setAltura(0.63);
        selecao2.getJogadores()[5].setPeso(6);

        selecao2.getJogadores()[6].setNome("Sammy");
        selecao2.getJogadores()[6].setDataNasc("10/04/2020");
        selecao2.getJogadores()[6].setPosicao("Ponta esquerda");
        selecao2.getJogadores()[6].setPais("Argentina");
        selecao2.getJogadores()[6].setAltura(0.63);
        selecao2.getJogadores()[6].setPeso(6);

        selecao2.getJogadores()[7].setNome("Sammy");
        selecao2.getJogadores()[7].setDataNasc("10/04/2020");
        selecao2.getJogadores()[7].setPosicao("Ponta esquerda");
        selecao2.getJogadores()[7].setPais("Argentina");
        selecao2.getJogadores()[7].setAltura(0.63);
        selecao2.getJogadores()[7].setPeso(6);

        selecao2.getJogadores()[8].setNome("Sammy");
        selecao2.getJogadores()[8].setDataNasc("10/04/2020");
        selecao2.getJogadores()[8].setPosicao("Ponta esquerda");
        selecao2.getJogadores()[8].setPais("Argentina");
        selecao2.getJogadores()[8].setAltura(0.63);
        selecao2.getJogadores()[8].setPeso(6);

        selecao2.getJogadores()[9].setNome("Sammy");
        selecao2.getJogadores()[9].setDataNasc("10/04/2020");
        selecao2.getJogadores()[9].setPosicao("Ponta esquerda");
        selecao2.getJogadores()[9].setPais("Argentina");
        selecao2.getJogadores()[9].setAltura(0.63);
        selecao2.getJogadores()[9].setPeso(6);

        selecao2.getJogadores()[10].setNome("Sammy");
        selecao2.getJogadores()[10].setDataNasc("10/04/2020");
        selecao2.getJogadores()[10].setPosicao("Ponta esquerda");
        selecao2.getJogadores()[10].setPais("Argentina");
        selecao2.getJogadores()[10].setAltura(0.63);
        selecao2.getJogadores()[10].setPeso(6);

        System.out.println("Selecao: " + selecao2.getNomeSelecao());
        System.out.println("Técnico: " + selecao2.getTecnico());
        System.out.println("Jogadores titulares:");
        for (int i = 0; i < 11; i++) {
            System.out.println("Jogador " + (i+1) + ":");
            System.out.println("Nome do Jogador: " + selecao2.getJogadores()[i].getNome());
            System.out.println("Data de Nascimento: " + selecao2.getJogadores()[i].getDataNasc());
            System.out.println("Altura: " + selecao2.getJogadores()[i].getAltura() + "m");
            System.out.println("Peso: " + selecao2.getJogadores()[i].getPeso() + "kg");
            System.out.println("Posição: " + selecao2.getJogadores()[i].getPosicao());
            System.out.println("País: " + selecao2.getJogadores()[i].getPais());
            System.out.println();
        }  
        
    }
}