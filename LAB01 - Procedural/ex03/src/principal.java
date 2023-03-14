import java.util.Scanner;

public class principal {

    public static void ex01(){
        Scanner sc = new Scanner(System.in);
        int val1,val2,val3,val4,val5,val6;

        System.out.println("<< Listando um vetor >>");
        System.out.println("Entre com o número 1:");
        val1 = sc.nextInt();

        System.out.println("Entre com o número 2:");
        val2 = sc.nextInt();

        System.out.println("Entre com o número 3:");
        val3 = sc.nextInt();

        System.out.println("Entre com o número 4:");
        val4 = sc.nextInt();

        System.out.println("Entre com o número 5:");
        val5 = sc.nextInt();

        System.out.println("Entre com o número 6:");
        val6 = sc.nextInt();

        System.out.println("Os valores lidos são:");
        System.out.printf("%d %d %d %d %d %d ", val1, val2, val3, val4, val5, val6);

    }

    public static void ex02(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");

        for (int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Os valores lidos são:");
        for (int i = 0; i < 6; i++){
            System.out.printf("%d ",vet[i]);
        }
    }

    public static void ex03() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];

        System.out.println("<< Listando um vetor na ordem inversa>>");

        for (int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Os valores lidos na ordem inversa são:");
        for (int i = 5; i >= 0; i--){
            System.out.printf("%d ",vet[i]);
        }
    }

    public static void ex04(){
        Scanner sc= new Scanner(System.in);
        int[] vet = new int[6];
        int i=0;
        System.out.println("<< Listando um vetor de numeros pares>>");

        while(i<6){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
            if((vet[i]%2)==0)
                i++;
            else
                System.out.println("Erro: valor invalido");

        }

        System.out.println("Os valores lidos são:");
        for (int j = 0; j < 6; j++){
            System.out.printf("%d ",vet[j]);
        }
    }

    public static void ex05(){
        Scanner sc= new Scanner(System.in);
        int[] vet = new int[5];
        int maior, menor, soma=0;
        double media=0;

        System.out.println("<< 5 valores>>");

        for (int i = 0; i < 5; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        maior=vet[0];
        menor=vet[0];
        for (int i = 0; i<5; i++) {
            if (vet[i]>maior)
                maior = vet[i];
            
            if (vet[i]<menor) 
                menor = vet[i];
            
            soma +=vet[i];
        }

        media=soma/5.0;

        System.out.println("Os valores lidos são:");
        for (int j = 0; j < 5; j++){
            System.out.printf("%d ",vet[j]);
        }
        
        System.out.printf("\nO maior valor: %d \n", maior);
        System.out.printf("O menor valor: %d \n", menor);
        System.out.printf("A media: %.2f \n", media);
    }

    public static void ex06(){
        Scanner sc= new Scanner(System.in);
        int[] vet = new int[5];
        int maior, menor, soma=0, indiceMaior=0, indiceMenor=0;
        double media=0;

        System.out.println("<< 5 valores>>");

        maior=vet[0];
        menor=vet[0];
        
        for (int i = 0; i < 5; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();

            if (vet[i]>maior){
                maior = vet[i];
                indiceMaior=i;
            } 
            
            if (vet[i]<menor){
                menor = vet[i];
                indiceMenor=i;
            } 
            
            soma +=vet[i];
        }



        media=soma/5.0;

        System.out.println("Os valores lidos são:");
        for (int j = 0; j < 5; j++){
            System.out.printf("%d ",vet[j]);
        }
        
        System.out.printf("\nO maior valor: %d, localizado na posicao %d do vetor\n", maior, indiceMaior);
        System.out.printf("O menor valor: %d, localizado na posicao %d do vetor\n", menor, indiceMenor);
        System.out.printf("A media: %.2f \n", media);
    }

    public static void ex07(){
        
        Scanner sc = new Scanner(System.in);
        int[] notas = new int[5];
        int maiorNota = 0, indice=0;

        System.out.println("<<Normalizando as notas>>");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a nota do " + (i + 1) + "o aluno: ");
            notas[i] = sc.nextInt();
            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
                indice=i;
            }
        }
        
        notas[indice]=100;
        
        System.out.println("Notas normalizadas: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(notas[i]);
        }
    }

    public static void ex08(){
        Scanner sc= new Scanner(System.in);
        int[] vet = new int[5];
        int maior, menor, soma=0;
        double media=0, desvioPadrao, variancia;

        System.out.println("<< Media e desvio padrao>>");

        for (int i = 0; i < 5; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
       
            soma += vet[i];
        }
        
        media = soma / 5.0;
            
        variancia = 0;
        for (int i = 0; i < 5; i++) {
            variancia += Math.pow(vet[i] - media, 2);
        }
        variancia /= 4.0;
            
            
        desvioPadrao = Math.sqrt(variancia);
            
        System.out.println("Média: " + media);
        System.out.println("Desvio padrão amostral: " + desvioPadrao);
    }

    public static void ex09() {
        Scanner sc = new Scanner(System.in);
        int numAlunos, soma=0;
        int [] notas;
        double media;
        
        System.out.print("Digite o número de alunos (até 100): ");
        numAlunos = sc.nextInt();
        
        if (numAlunos>100) {
            System.out.println("Erro: o número de alunos deve ser no máximo 100!");
            return;
        }
        
        notas = new int[numAlunos];
        
        System.out.println("Digite as notas dos " + numAlunos + " alunos:");
        
        for (int i = 0; i < numAlunos; i++) {
            System.out.print("Aluno " + (i + 1) + ": ");
            notas[i] = sc.nextInt();
            soma += notas[i];
        }
        
        media = soma / numAlunos;
        
        
        System.out.println("Notas dos alunos:");
        for (int i = 0; i < numAlunos; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + notas[i]);
        }
        System.out.println("Média da turma: " + media);
    }

    
    public static void main(String[] args) {
        //ex01();
        //ex02();
        //ex03();
        //ex04();
        //ex05();
        //ex06();
        //ex07();
        //ex08();
        //ex09();
    }


}
