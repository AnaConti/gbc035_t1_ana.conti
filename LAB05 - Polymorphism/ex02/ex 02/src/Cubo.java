public class Cubo extends FormaTridimensional{
    private double lado;

    public Cubo(double lado){
        super("Cubo", 0, 0);
        this.lado=lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public void calculaArea(){
        double area=6*Math.pow(getLado(),2);
        super.setArea(area);
    }

    public void calculaVolume(){
        double volume= Math.pow(getLado(), 3);
        super.setVolume(volume);
    }

    @Override
    public String toString() {
        return super.toString() +
                "lado=" + lado +
                '\n';
    }
}
