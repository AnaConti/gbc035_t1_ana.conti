public class Tetraedro extends FormaTridimensional{
    private double lado;

    public Tetraedro(double lado){
        super("Tetraedro", 0, 0);
        this.lado=lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public void calculaArea(){
        double area=Math.pow(getLado(), 2)*Math.sqrt(3);
        super.setArea(area);
    }

    public void calculaVolume(){
        double volume= (1/3)*(getArea()* ((getLado()/3)*Math.sqrt(6)));
        super.setVolume(volume);
    }

    @Override
    public String toString() {
        return super.toString() +
                "lado=" + getLado() +
                '\n';
    }
}
