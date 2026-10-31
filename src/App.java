public class App {
    public static void main(String[] args) throws Exception {
        polimorfismo(new Triangulo("Triángulo", 5, 10));
        polimorfismo(new Cuadrado("Cuadrado", 5));
        polimorfismo(new Pentagono("Pentágono", 5));
        polimorfismo(new Hexagono("Hexágono", 5));
        polimorfismo(new Circulo("Círculo", 5));
    }

    public static void polimorfismo (Figura figura) {
        System.out.println("El tipo de figura es: " + figura.getTipo());
        System.out.println("El área de la figura es: " + figura.area());
    }
}
