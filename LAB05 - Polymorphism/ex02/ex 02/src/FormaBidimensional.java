public class FormaBidimensional extends Forma{
    private double area;

    public FormaBidimensional(String nome, double area){
        super(nome);
        this.area=area;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "FormaBidimensional: " + super.toString() + 
                "area=" + area +
                '\n';
    }
}
