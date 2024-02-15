public class pruebaCalculadora {
    public static void main(String[] args) {
        // Creamos un objeto Calculadora con dos números enteros
        Calculadora miCalculadora = new Calculadora(5, 3);
        
        // Probamos el método suma
        System.out.println("La suma es: " + miCalculadora.suma());
        
        // Probamos el método realizarOperacion
        System.out.println("La suma es: " + miCalculadora.realizarOperacion("suma"));
    }
}