public class Triangulo extends FormaBidimensional{
    private double base, altura;

    public Triangulo(double base, double altura){
        super("Triangulo", 0);
        this.base=base;
        this.altura=altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void calculaArea(){
        double area= getBase()*getAltura();
        super.setArea(area);
    }

    @Override
    public String toString() {
        return super.toString() +"base=" + base +
                ", altura=" + altura +
                '\n';
    }
}
