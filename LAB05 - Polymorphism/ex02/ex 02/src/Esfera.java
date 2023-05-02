public class Esfera extends FormaTridimensional{
    private double raio;

    public Esfera(double raio){
        super("Esfera", 0, 0);
        this.raio=raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void calculaArea(){
        double area=4*Math.PI*Math.pow(getRaio(), 2);
        super.setArea(area);
    }

    public void calculaVolume(){
        double volume= (4/3)*(Math.pow(getRaio(), 3));
        super.setVolume(volume);
    }

    @Override
    public String toString() {
        return super.toString() +
                "raio=" + getRaio() +
                '\n';
    }
}
