public class Main {
    public static void main(String[] args) {
        C1 aux1 = new C1(3,4,5);
        System.out.println(aux1.mostraC1());

        C2 aux2 = new C2(7,8,9);
        System.out.println(aux2.mostraC2());

        System.out.println("\nMostra super C2: \n" +aux2.mostraSuperC2());

        C3 aux3 = new C3(85,244);

        System.out.println(aux3.mostraC3());
        System.out.println("\nMostra super C3: \n" +aux3.mostraSuperC3());
    }

}