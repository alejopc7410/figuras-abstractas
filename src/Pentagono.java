public class Pentagono extends Figura {
    private int lado;

    public Pentagono (String tipo, int lado) {
        super(tipo);
        this.lado = lado;
    }
    
    public int getLado () {return lado;}
    public void setLado (int lado) {this.lado = lado;}

    @Override 
    public double area() {
        return (double) (Math.pow(lado, 2) * (Math.sqrt(25 + (10 * Math.sqrt(5))))) / 4;
    }
}