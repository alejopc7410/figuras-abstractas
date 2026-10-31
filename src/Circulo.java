public class Circulo extends Figura {
    private double radio;

    public Circulo (String tipo, double radio) {
        super(tipo);
        this.radio = radio;
    }
    
    public double getRadio () {return radio;}
    public void setRadio (double radio) {this.radio = radio;}

    @Override 
    public double area() {
        return (double) Math.PI * (this.radio * this.radio);
    }
}