public class Main {
    public static void main(String[] args) {
        int n=10;

        Forma []formas= new Forma[n];

        formas[0]= new Quadrado(2);
        formas[1]= new Triangulo(2,4);
        formas[2]= new Circulo(8);
        formas[3]= new Cubo(5);
        formas[4]= new Esfera(6);
        formas[5]= new Tetraedro(7);


        for(int i=0; i< formas.length; i++){
            if(formas[i].getNome()== "Quadrado"){

                ((Quadrado) formas[i]).calculaArea();
                System.out.println(formas[i].toString());
            }
            else if(formas[i].getNome()== "Triangulo"){

                ((Triangulo) formas[i]).calculaArea();
                System.out.println(formas[i].toString());
            }
            else if(formas[i].getNome()== "Circulo"){

                ((Circulo) formas[i]).calculaArea();
                System.out.println(formas[i].toString());
            }
            else if(formas[i].getNome()== "Cubo"){

                ((Cubo) formas[i]).calculaArea();
                ((Cubo)formas[i]).calculaVolume();
                System.out.println(formas[i].toString());
            }
            else if(formas[i].getNome()== "Esfera"){

                ((Esfera) formas[i]).calculaArea();
                ((Esfera)formas[i]).calculaVolume();
                System.out.println(formas[i].toString());
            }
            else(formas[i].getNome()== "Tetraedro"){

                ((Tetraedro) formas[i]).calculaArea();
                ((Tetraedro)formas[i]).calculaVolume();
                System.out.println(formas[i].toString());
            }
        }
    }
}