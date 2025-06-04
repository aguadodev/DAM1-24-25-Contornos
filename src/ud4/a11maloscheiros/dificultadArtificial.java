package ud4.a11maloscheiros;
//Andre Pazo Dominguez


// Interfaz Operacion
interface Operacion {
    int operar(int a, int b);
}

// Clase que implementa la suma
class Suma implements Operacion {
    public int operar(int a, int b) {
        return a + b;
    }
}

// Clase Calculadora que utiliza una operación
class Calculadora {
    public int calcular(Operacion op, int a, int b) {
        return op.operar(a, b);
    }
}

// Clase principal con el método main
public class dificultadArtificial {
    public static void main(String[] args) {
        // Crear una instancia de la operación Suma
        Operacion suma = new Suma();

        // Crear una instancia de la Calculadora
        Calculadora calc = new Calculadora();

        // Realizar una operación de suma
        int resultado = calc.calcular(suma, 7, 5);
        System.out.println("Resultado de la suma: " + resultado);
    }
}
