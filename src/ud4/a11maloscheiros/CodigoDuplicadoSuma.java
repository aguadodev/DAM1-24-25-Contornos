package ud4.a11maloscheiros;

public class CodigoDuplicadoSuma {
    
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int sumarTresNumeros(int a, int b, int c) {
        return a + b + c; // Código duplicado, se repite lógica de suma.
    }

    public static void main(String[] args) {

        int a = 2;
        int b = 3;
        int c = 5;

        int resultado1 = sumar(a, b);
        int resultado2 = sumarTresNumeros(a, b, c);

        System.out.println("Resultado de sumar 5 + 3: " + resultado1);
        System.out.println("Resultado de sumar 1 + 2 + 3: " + resultado2);
    }
}
