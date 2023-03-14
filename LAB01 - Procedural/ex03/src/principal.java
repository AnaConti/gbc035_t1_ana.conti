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
        double media;

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
        double media;

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
        int maior, soma=0;
        double media, desvioPadrao, variancia;

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

    public static void ex10(){
        Scanner sc = new Scanner(System.in);
        
        int[] A = new int[3];
        int[] B = new int[3];
        int[] C = new int[3];
        
        System.out.println("<<Subtracao de vetores>>");
        System.out.println("Digite os valores do array A:");
        for (int i = 0; i < 3; i++) {
            A[i] = sc.nextInt();
        }
        
        System.out.println("Digite os valores do array B:");
        for (int i = 0; i < 3; i++) {
            B[i] = sc.nextInt();
        }
        
        for (int i = 0; i < 3; i++) {
            C[i] = A[i] - B[i];
        }
        
        System.out.println("Os valores do array C são:");
        for (int i = 0; i < 3; i++) {
            System.out.println(C[i]);
        }
    }
    
    public static void ex11(){
        Scanner sc= new Scanner(System.in);

        int[] v = new int[3];
        int[] v1 = new int[3];
        int[] v2 = new int[3];
        int count1 = 0;
        int count2 = 0;
        
        System.out.println("<<Pares e impares>>");
        
        for (int i = 0; i < 3; i++) {
            System.out.printf("Entre com o número %d:\n",i+1);
            v[i] = sc.nextInt();

            if (v[i] % 2 == 0) { 
                v2[count2] = v[i];
                count2++;
            } else { 
                v1[count1] = v[i];
                count1++;
            }
        }

        System.out.println("Impares:");
        for (int i = 0; i < count1; i++) {
            System.out.println(v1[i]);
        }
        
        System.out.println("Pares:");
        for (int i = 0; i < count2; i++) {
            System.out.println(v2[i]);
        }
         
    }

    public static void ex12(){
        Scanner sc = new Scanner(System.in);
        int azul, verde, amarelo,vermelho,total;
        double prob_azul, prob_verde, prob_amarelo, prob_vermelho;
        System.out.println("Digite a quantidade de bolas azuis:");
        azul = sc.nextInt();
        
        System.out.println("Digite a quantidade de bolas verdes:");
        verde = sc.nextInt();
        
        System.out.println("Digite a quantidade de bolas amarelas:");
        amarelo = sc.nextInt();
        
        System.out.println("Digite a quantidade de bolas vermelhas:");
        vermelho = sc.nextInt();
        
        total = azul + verde + amarelo + vermelho;
        
        prob_azul = (double) azul / total;
        prob_verde = (double) verde / total;
        prob_amarelo = (double) amarelo / total;
        prob_vermelho = (double) vermelho / total;
        
        System.out.println("A probabilidade de ocorrência de cada cor é:");
        System.out.printf("Azul: %.2f%%\n", prob_azul * 100);
        System.out.printf("Verde: %.2f%%\n", prob_verde * 100);
        System.out.printf("Amarelo: %.2f%%\n", prob_amarelo * 100);
        System.out.printf("Vermelho: %.2f%%\n", prob_vermelho * 100);
        
        if (prob_azul >= prob_verde && prob_azul >= prob_amarelo && prob_azul >= prob_vermelho) {
            System.out.println("A cor com maior probabilidade é a azul.");
        } else if (prob_verde >= prob_amarelo && prob_verde >= prob_vermelho) {
            System.out.println("A cor com maior probabilidade é a verde.");
        } else if (prob_amarelo >= prob_vermelho) {
            System.out.println("A cor com maior probabilidade é a amarela.");
        } else {
            System.out.println("A cor com maior probabilidade é a vermelha.");
        }
    }

    public static void ex13(){
        Scanner sc = new Scanner(System.in);
        int []vet= new int[5];

        System.out.println("<<Zerando negativos>>");
        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o valor da posição %d do vetor: ", i);
            vet[i] = sc.nextInt();
        }
        
        for (int i = 0; i < 5; i++) {
            if (vet[i] < 0) {
                vet[i] = 0;
            }
        }
        
        System.out.println("Vetor final:");
        for (int i = 0; i < 5; i++) {
            System.out.println(vet[i]);
        }

    }

    public static void ex14(){
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("<<Universidade X>>");
        System.out.print("Digite o número de alunos a serem cadastrados (máximo 10000): ");
        n = sc.nextInt();
        while (n < 1 || n > 10000) {
            System.out.print("Valor inválido. Digite o número de alunos a serem cadastrados (máximo 10000): ");
            n = sc.nextInt();
        }
        int[] matriculas = new int[n];
        char[] classesSociais = new char[n];
        double[] cra = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite a matrícula do aluno %d: ", i + 1);
            matriculas[i] = sc.nextInt();

            System.out.printf("Digite a classe social do aluno %d (A, B, C, D ou E): ", i + 1);
            classesSociais[i] = sc.next().charAt(0);
            while (classesSociais[i] != 'A' && classesSociais[i] != 'B' && classesSociais[i] != 'C' && classesSociais[i] != 'D' && classesSociais[i] != 'E') {
                System.out.print("Classe social inválida. Digite a classe social do aluno (A, B, C, D ou E): ");
                classesSociais[i] = sc.next().charAt(0);
            }

            System.out.printf("Digite o CRA do aluno %d: ", i + 1);
            cra[i] = sc.nextDouble();
        }

        System.out.println("Dados dos alunos cadastrados:");
        System.out.println("Matrícula\tClasse Social\tCRA");

        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t\t%c\t\t%.2f\n", matriculas[i], classesSociais[i], cra[i]);
        }
    }

    public static void ex15(){
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[8];

        System.out.println("<<Valores repetidos>>");
        System.out.println("Digite 8 números inteiros:");
        for (int i = 0; i < 8; i++) {
            vetor[i] = sc.nextInt();
        }

        boolean temRepetidos = false;
        for (int i = 0; i < 7 && !temRepetidos; i++) {
            for (int j = i + 1; j < 8 && !temRepetidos; j++) {
                if (vetor[i] == vetor[j]) {
                    temRepetidos = true;
                }
            }
        }

        if (temRepetidos) {
            System.out.println("Os valores repetidos no vetor são:");
            for (int i = 0; i < 7; i++) {
                for (int j = i + 1; j < 8; j++) {
                    if (vetor[i] == vetor[j]) {
                        System.out.println(vetor[i]);
                        break;
                    }
                }
            }
        } else {
            System.out.println("Não existem valores repetidos no vetor.");
        }
    }

    public static void ex16(){
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[8];

        
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < 8; i++) {
            int contador = 0;

            for (int j = i + 1; j < 8; j++) {
                if (vetor[i] == vetor[j]) {
                    contador++;
                }
            }

            if (contador > 0) {
                System.out.println("O número " + vetor[i] + " aparece " + (contador + 1) + " vezes na lista.");
            }
        }
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
        //ex10();
        //ex11();
        //ex12();
        //ex13();
        //ex14();
        //ex15();
        ex16();
    }


}
