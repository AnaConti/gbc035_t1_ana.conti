public class Main {
    public static void main(String[] args) {
        VIP i1 = new VIP(12.00, 5.00);

        System.out.println("Valor do ingresso é"+i1.valorIngressoVIP());

        Normal i2 = new Normal(22.00);

        System.out.println(i2.imprimeIngressoNormal());

        CamaroteInferior i3 = new CamaroteInferior("A6", 35, 10);

        System.out.println(i3.imprimeLocalizacaoCI());

        CamaroteSuperior i4 = new CamaroteSuperior(10, 35, 10);

        System.out.println("Valor do camarote Superior: "+ i4.valorCS());
}
}