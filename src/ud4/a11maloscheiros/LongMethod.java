package ud4.a11maloscheiros;

import java.util.Random;
import java.util.Scanner;

/*

Este método genera una contraseña aleatoria del largo que se le pase como parámetro (mínimo 8).
Es un solo método que se podría descomponer en, al menos, tres métodos más pequeños que hagan las siguientes funciones:
1. Añadir un carácter de cada tipo (mayúsculas, minúsculas, números, caracteres especiales).
2. Rellenar el resto de la contraseña.
3. Mezclar los caracteres para que tengan posiciones aleatorias.

*/

public class LongMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de caracteres que quieres que tenga tu contraseña (mínimo 8): ");
        int largo = sc.nextInt();
        System.out.println("Contraseña generada: " + generarPasswordAleatorio(largo));
        sc.close();
    }

    public static String generarPasswordAleatorio(int largo) {
        if (largo < 8) {
            throw new IllegalArgumentException("La contraseña debe tener al menos 8 caracteres.");
        }

        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        String caracteresEspeciales = "!@#$%^&*()-_=+<>?";
        String todosLosCaracteres = mayusculas + minusculas + numeros + caracteresEspeciales;

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        // Añade una carácter de cada tipo
        password.append(mayusculas.charAt(random.nextInt(mayusculas.length())));
        password.append(minusculas.charAt(random.nextInt(minusculas.length())));
        password.append(numeros.charAt(random.nextInt(numeros.length())));
        password.append(caracteresEspeciales.charAt(random.nextInt(caracteresEspeciales.length())));

        // Rellena el resto de la contraseña
        for (int i = password.length(); i < largo; i++) {
            password.append(todosLosCaracteres.charAt(random.nextInt(todosLosCaracteres.length())));
        }

        // Mezcla los caracteres para que estén en posiciones aleatorias.
        char[] passwordArray = password.toString().toCharArray();
        for (int i = 0; i < passwordArray.length; i++) {
            int swapIndex = random.nextInt(passwordArray.length);
            char temp = passwordArray[i];
            passwordArray[i] = passwordArray[swapIndex];
            passwordArray[swapIndex] = temp;
        }

        // Pasa el array de caracteres a StringBuilder
        password = new StringBuilder();
        for (char c : passwordArray) {
            password.append(c);
        }

        return password.toString();
    }
}