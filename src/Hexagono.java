public class Hexagono extends Figura {
    private int lado;

    public Hexagono (String tipo, int lado) {
        super(tipo);
        this.lado = lado;
    }

    public int getLado () {return lado;}
    public void setLado (int lado) {this.lado = lado;}
    
    @Override 
    public double area() {
        return (double) 3 * ((Math.sqrt(3 * (Math.pow(lado, 2))))) / 2;
    }
}