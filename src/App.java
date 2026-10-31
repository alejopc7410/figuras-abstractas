public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public static void polimorfismo (Figura figura) {
        System.out.println("El tipo de figura es: " + figura.getTipo());
        System.out.println("El área de la figura es: " + figura.area());
    }
}
