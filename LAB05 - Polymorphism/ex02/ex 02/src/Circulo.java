public class Circulo extends FormaBidimensional{
    private double raio;

    public Circulo(double raio){
        super("Circulo", 0);
        this.raio=raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void calculaArea(){
        double area= Math.PI*(getRaio()*getRaio());
        super.setArea(area);
    }

    @Override
    public String toString() {
        return super.toString() +"raio=" + raio +
                '\n';
    }
}
