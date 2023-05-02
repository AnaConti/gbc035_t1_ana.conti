public class FormaTridimensional extends Forma{
        private double area, volume;

        public FormaTridimensional(String nome, double area, double volume){
            super(nome);
            this.area=area;
            this.volume=volume;
        }

        public double getArea() {
            return area;
        }

        public void setArea(double area) {
            this.area = area;
        }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }


    @Override
    public String toString() {
        return "FormaTridimensional: " + super.toString()+
                "area=" + area +
                ", volume=" + volume +
                '\n';
    }
}
