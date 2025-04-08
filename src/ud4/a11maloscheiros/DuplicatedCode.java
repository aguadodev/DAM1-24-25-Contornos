package contornos.malosOlores;

import java.util.Scanner;

class DuplicatedCode {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce un usuario (nombre y edad)");
        String nombre=sc.nextLine();
        int edad = sc.nextInt();
        System.out.println("Introudce un empleado (nombre y edad)");
        String nombre2 =sc.nextLine();
        sc.nextLine();
        int edad2 = sc.nextInt();
        printUserDetails(nombre, edad);
        printEmployeeDetails(nombre2, edad2);
    }

    public static void printUserDetails(String name, int age) {
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
    }
    public static void printEmployeeDetails(String name, int age) {
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
    }
}
