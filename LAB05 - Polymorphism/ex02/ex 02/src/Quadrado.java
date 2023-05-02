public class Quadrado extends FormaBidimensional{
    private double lado;

    public Quadrado(double lado){
        super("Quadrado", 0);
        this.lado=lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public void calculaArea(){
        double area= getLado()*getLado();
        super.setArea(area);
    }

    @Override
    public String toString() {
        return super.toString() +
                "lado=" + lado + "\n";
    }
}
