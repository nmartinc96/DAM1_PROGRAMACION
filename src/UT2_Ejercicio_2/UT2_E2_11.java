package UT2_Ejercicio_2;

import java.util.Scanner;

public class UT2_E2_11 {
    public static void main(String[] args) {
        // Programa un juego que genere un número aleatorio y te permita introducir números hasta que des con el adecuado. El juego deberá indicarte si el número introducido es mayor o menor.

        Scanner sc = new Scanner(System.in);
        System.out.println("He elegido un número entero de 1 al 10, adivinalo");
        int nsecreto = (int) (Math.random() * 10) + 1;
        int n = 0;

        while (nsecreto != n) {
            System.out.println("Teclea un número");
            n = sc.nextInt();

            if (n < 1 || n > 10) {
                System.out.println("Número no válido");
            } else if (n < nsecreto) {
                System.out.println("Te quedaste corto, prueba otra vez con un número mayor");
            } else if (n > nsecreto) {
                System.out.println("Te pasaste, prueba otra vez con un número menor");
            } else {
                System.out.println("Genial!! El número secreto es " + n);
            }
        }
        sc.close();

    }
}
