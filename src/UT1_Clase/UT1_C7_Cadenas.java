package UT1_Clase;

public class UT1_C7_Cadenas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu nombre, por favor");

        String nombre = scanner.nextLine();

        System.out.println("Hola " + nombre);

        System.out.println("¿Cuántos años tienes?");

        int edad = scanner.nextInt();

        System.out.println(nombre + " tiene " + edad + " años");


    }
}