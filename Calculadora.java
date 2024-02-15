class Calculadora {
    private int num1;
    private int num2;

    // Constructor
    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Método para realizar operación de suma
    public int suma() {
        return num1 + num2;
    }

    public int multiplicar() {
        return num1 * num2;
    }

    // Método para realizar la operación de división
public double dividir() {
    if (num2 != 0) {
        return (double) num1 / num2;
    } else {
        System.err.println("No se puede dividir por cero.");
        return Double.NaN; // Retornar NaN (Not a Number) en caso de división por cero
    }
}

    // Método para realizar operación específica
    public int realizarOperacion(String operacion) {
        if (operacion.equals("suma")) {
            return suma();
        } else {
            System.out.println("Operación no válida.");
            return 0;
        }
    }
}