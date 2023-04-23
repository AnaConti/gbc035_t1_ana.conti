public class Empresa {
    public static void main(String[] args) {
        Figurinhas fig = new Figurinhas("ANA", "14/12/2001", 
        "Lateral", "Brazil", 1.67, 75.00);

        System.out.println("Figurinha:\n");
        System.out.println(fig.mostraFigurinhas());

        FigurinhasExtras figExtra = new FigurinhasExtras("Ana", "14/12/2001",
        "Lateral", "BR", 1.67, 80, "Legends", "prata");

        System.out.println("\nFigurinha Extra:\n");
        System.out.println(figExtra.mostraFigurinhasExtra());
    }
}