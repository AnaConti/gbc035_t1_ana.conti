public class Main {
    public static void main(String[] args) {
        //ex01
        /*
        Autor autor1= new Autor("Ana", "12/05/2000","UFU");
        Artigo artigo1=new Artigo("Titulo","Resumo","Texto");

        System.out.printf("Autor: %s \nData de nascimento: %s \nInstituicao: %s \n", autor1.getNome(), autor1.getDataNasc(), autor1.getInstituicao());
        System.out.printf("Artigo:\nTitulo: %s \nResumo: %s \nTexto: %s", artigo1.getTitulo(), artigo1.getResumo(), artigo1.getTexto());
        */



        //ex02
        /* 
        Autor autor1= new Autor("Ana", "12/05/2000","UFU");
        Autor autor2=new Autor("Maria", "24/07/1998", "USP");


        Artigo artigo1=new Artigo("Titulo","Resumo","Texto", autor1);

        System.out.printf("Autor1: %s \nData de nascimento: %s \nInstituicao: %s \n", autor1.getNome(), autor1.getDataNasc(), autor1.getInstituicao());
        System.out.printf("\nAutor2: %s \nData de nascimento: %s \nInstituicao: %s \n", autor2.getNome(), autor2.getDataNasc(), autor2.getInstituicao());
        System.out.printf("\nArtigo:\nTitulo: %s \nResumo: %s \nTexto: %s\nAutor: %s", artigo1.getTitulo(), artigo1.getResumo(), artigo1.getTexto(), autor1.getNome());
        */

        //ex03
        
        Autor autor1= new Autor("Ana", "12/05/2000","UFU");
        Autor autor2= new Autor("Maria", "24/07/1998", "USP");

        Autor[] autoresArtigo1= {autor1};
        Autor[] autoresArtigo2={autor1, autor2};

        Artigo artigo1=new Artigo("Titulo","Resumo","Texto", autoresArtigo2 );

        System.out.printf("\nArtigo1:\nTitulo: %s \nResumo: %s \nTexto: %s\n", artigo1.getTitulo(), artigo1.getResumo(), artigo1.getTexto());
        System.out.printf("Autor 1: \nNome %s \nData de Nascimento: %s\nInstituicao: %s\n", autor1.getNome(), autor1.getDataNasc(), autor1.getInstituicao());
        System.out.printf("Autor 2: \nNome: %s \nData de Nascimento: %s\nInstituicao: %s\n", autor2.getNome(), autor2.getDataNasc(), autor2.getInstituicao());


    }
}